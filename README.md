# Web Scraping with JSoup

## Summary:

This program utilizes the JSoup library to connect to a given url, and capture any specified DOM elements from within
the webpage to be used in order to transform the display of values in different ways.

### Technologies Used

```
- Java
- jsoup
- Maven
- IntelliJ IDEA
```

## EspnScraper:

John Hollinger's (ESPN) NBA PER (Player Efficiency Rating) rankings:

```
http://www.espn.com/nba/hollinger/statistics
```

This URL contains a table of NBA players along with their corresponding detailed statistics for the past season.

### Steps

- Select the table DOM element. ex. _"table.tablehead tr"_
- Iterate through said table and select every appearance of specified child element(s) as Strings. ex. _"td:nth-of-type(
  2)"_
- If parsed values are numbers, parse the String value to it's appropriate datatype with built-in methods. ex.

```
Integer.parseInt(row.select("td:nth-of-type(3)").text())
```

- Capture values into a data structure and restructure the table in any way that you choose. ex. Generate a table that
  changes the order of players by minutes played value.  