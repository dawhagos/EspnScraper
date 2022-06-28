# Web Scraping with JSoup

## Summary:

This program utilizes the JSoup library to connect to a url from ESPN that contains advanced NBA statistics that provide
live updates. Then the specified DOM elements from within the webpage (names, stats, etc.) are captured to be used in
order to populate a table of our own by use of Thymeleaf.

### Technologies Used

```
- Java
- Spring Boot
- Jsoup
- Maven
- Thymeleaf
- jQuery Datatable
- IntelliJ IDEA
```

## EspnScraper:

John Hollinger's (ESPN) NBA Player/Team Advanced Statistics:

```
http://www.espn.com/nba/hollinger/statistics
http://www.espn.com/nba/hollinger/teamstats
```

These URLs contain a table of NBA players/teams along with their corresponding detailed statistics for the past season.

(Note that the player statistics table contains multiple pages of data held in their own URLs that must also be
scraped.) ex:

```http://www.espn.com/nba/hollinger/statistics/_/page/2```

### Steps

- Write separate player and team model objects that map to the data intended to be scraped. ex. _"playerName"_ maps
  to _"PLAYER"_ row on the ESPN table.
- Now within the service layer, write a method that uses jsoup to connect to the URLs and capture the data that we want.
    - Select the table DOM element. ex. _"table.tablehead tr"_
    - Iterate through said table and select every appearance of specified child element(s) as Strings. ex. _"td:
      nth-of-type(
      2)"_
    - If parsed values are numbers, parse the String value to it's appropriate datatype with built-in methods. ex.
    - ```Integer.parseInt(row.select("td:nth-of-type(3)").text())```
    - Capture values into a data structure.
- In the Controller, we write a Get mapping that will call our service tier method and provide the value (our data
  structure) to a Spring model attribute, which we will use to append the values we captured onto our own HTML page
  using Thymeleaf.
- Lastly, within our HTML there are a few steps to follow:
    - Firstly, our HTML files are held within the templates directory in resources. (Note that the name of the html
      file(s) we want rendered are what we return within our Controller mappings.)
    - Now we write a simple table structure in which you include the Thymeleaf provided command _th:each_ inside your
      tr (table row) tag as such: ```th:each="modelObject: ${modelName}"```
    - Next, utilize jQuery datatables with the necessary JS and CSS CDN URLs provided
      here: ```https://datatables.net/```
- This allows our table to become sortable and searchable dynamically!
- Additional styling can be added in our own CSS file saved within the static directory in resources.