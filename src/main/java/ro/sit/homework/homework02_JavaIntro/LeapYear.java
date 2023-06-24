package ro.sit.homework.homework02_JavaIntro;

//Exercise 02
//Display the number of days in month February from a year between 1900-2016 that is read from keyboard

//HINT
//A year is a leap year if:
//-Is divisible by 4 but not by 100
//-Is divisible by 100 but not by 400

//Name the class (and java file) LeapYear.

import java.util.Scanner;

//public class LeapYear {
//        public static void main(String[] args) {
//            for (int year = 1900; year <= 2016; year++) { //iterate through the years from 1900 to 2016
//                boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
//                //check if the year is divisible by 4 but not divisible by 100 or if it's divisible by 400,
//                //and assign the result to the boolean variable isLeapYear
//
//                if (isLeapYear) {
//                    System.out.println("February in " + year + " has 29 days."); //leap year
//                } else {
//                    System.out.println("February in " + year + " has 28 days."); //not a leap year
//                }
//            }
//        }
//    }

//Output

//        February in 1900 has 28 days.
//        February in 1901 has 28 days.
//        February in 1902 has 28 days.
//        February in 1903 has 28 days.
//        February in 1904 has 29 days.
//        February in 1905 has 28 days.
//        February in 1906 has 28 days.
//        February in 1907 has 28 days.
//        February in 1908 has 29 days.
//        February in 1909 has 28 days.
//        February in 1910 has 28 days.
//        February in 1911 has 28 days.
//        February in 1912 has 29 days.
//        February in 1913 has 28 days.
//        February in 1914 has 28 days.
//        February in 1915 has 28 days.
//        February in 1916 has 29 days.
//        February in 1917 has 28 days.
//        February in 1918 has 28 days.
//        February in 1919 has 28 days.
//        February in 1920 has 29 days.
//        February in 1921 has 28 days.
//        February in 1922 has 28 days.
//        February in 1923 has 28 days.
//        February in 1924 has 29 days.
//        February in 1925 has 28 days.
//        February in 1926 has 28 days.
//        February in 1927 has 28 days.
//        February in 1928 has 29 days.
//        February in 1929 has 28 days.
//        February in 1930 has 28 days.
//        February in 1931 has 28 days.
//        February in 1932 has 29 days.
//        February in 1933 has 28 days.
//        February in 1934 has 28 days.
//        February in 1935 has 28 days.
//        February in 1936 has 29 days.
//        February in 1937 has 28 days.
//        February in 1938 has 28 days.
//        February in 1939 has 28 days.
//        February in 1940 has 29 days.
//        February in 1941 has 28 days.
//        February in 1942 has 28 days.
//        February in 1943 has 28 days.
//        February in 1944 has 29 days.
//        February in 1945 has 28 days.
//        February in 1946 has 28 days.
//        February in 1947 has 28 days.
//        February in 1948 has 29 days.
//        February in 1949 has 28 days.
//        February in 1950 has 28 days.
//        February in 1951 has 28 days.
//        February in 1952 has 29 days.
//        February in 1953 has 28 days.
//        February in 1954 has 28 days.
//        February in 1955 has 28 days.
//        February in 1956 has 29 days.
//        February in 1957 has 28 days.
//        February in 1958 has 28 days.
//        February in 1959 has 28 days.
//        February in 1960 has 29 days.
//        February in 1961 has 28 days.
//        February in 1962 has 28 days.
//        February in 1963 has 28 days.
//        February in 1964 has 29 days.
//        February in 1965 has 28 days.
//        February in 1966 has 28 days.
//        February in 1967 has 28 days.
//        February in 1968 has 29 days.
//        February in 1969 has 28 days.
//        February in 1970 has 28 days.
//        February in 1971 has 28 days.
//        February in 1972 has 29 days.
//        February in 1973 has 28 days.
//        February in 1974 has 28 days.
//        February in 1975 has 28 days.
//        February in 1976 has 29 days.
//        February in 1977 has 28 days.
//        February in 1978 has 28 days.
//        February in 1979 has 28 days.
//        February in 1980 has 29 days.
//        February in 1981 has 28 days.
//        February in 1982 has 28 days.
//        February in 1983 has 28 days.
//        February in 1984 has 29 days.
//        February in 1985 has 28 days.
//        February in 1986 has 28 days.
//        February in 1987 has 28 days.
//        February in 1988 has 29 days.
//        February in 1989 has 28 days.
//        February in 1990 has 28 days.
//        February in 1991 has 28 days.
//        February in 1992 has 29 days.
//        February in 1993 has 28 days.
//        February in 1994 has 28 days.
//        February in 1995 has 28 days.
//        February in 1996 has 29 days.
//        February in 1997 has 28 days.
//        February in 1998 has 28 days.
//        February in 1999 has 28 days.
//        February in 2000 has 29 days.
//        February in 2001 has 28 days.
//        February in 2002 has 28 days.
//        February in 2003 has 28 days.
//        February in 2004 has 29 days.
//        February in 2005 has 28 days.
//        February in 2006 has 28 days.
//        February in 2007 has 28 days.
//        February in 2008 has 29 days.
//        February in 2009 has 28 days.
//        February in 2010 has 28 days.
//        February in 2011 has 28 days.
//        February in 2012 has 29 days.
//        February in 2013 has 28 days.
//        February in 2014 has 28 days.
//        February in 2015 has 28 days.
//        February in 2016 has 29 days.



public class LeapYear {
    public static void main(String[] args) {
        //create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a year between 1900 and 2016: ");
        //read the user input for the year
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        //check if the year is divisible by 4 but not divisible by 100 or if it's divisible by 400,
        //and assign the result to the boolean variable isLeapYear

        if (isLeapYear) {
            System.out.println("February in " + year + " has 29 days."); //leap year
        } else {
            System.out.println("February in " + year + " has 28 days."); //not a leap year
        }

        scanner.close(); //close the scanner object
    }
}

//Output

//Please enter a year between 1900 and 2016: 1981
//February in 1981 has 28 days.


//Please enter a year between 1900 and 2016: 1984
//February in 1984 has 29 days.