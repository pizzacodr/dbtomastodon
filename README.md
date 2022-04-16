# DB to Mastodon Status

## Purpose

Read data from a SQLite table and post it to Mastodon Server using their REST Interface.

 
## Maven Command to Build the Binary

To build a binary, run the maven command `mvn clean test compile assembly:single`

An executable will be created on the target directory.

## Configuration

To run the binary, you will need a properties file named `dbtomastodon.properties`.  Either on the same directory of the binary or on the user home directory. The properties are listed on the [ConfigFile.java](src/main/java/com/github/pizzacodr/dbtomastodon/ConfigFile.java) file.

## SonarQube Analysis 

[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=pizzacodr_dbtomastodon&metric=bugs)](https://sonarcloud.io/summary/new_code?id=pizzacodr_dbtomastodon) [![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=pizzacodr_dbtomastodon&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=pizzacodr_dbtomastodon) [![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=pizzacodr_dbtomastodon&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=pizzacodr_dbtomastodon) [![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=pizzacodr_dbtomastodon&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=pizzacodr_dbtomastodon) [![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=pizzacodr_dbtomastodon&metric=ncloc)](https://sonarcloud.io/summary/new_code?id=pizzacodr_dbtomastodon)