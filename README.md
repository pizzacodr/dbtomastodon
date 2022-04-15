# DB to Mastodon Status

## Purpose

Read data from a SQLite table and post it to Mastodon Server using their REST Interface.

 
## Maven Command to Build the Binary

To build a binary, run the maven command `mvn clean test compile assembly:single`

An executable will be created on the target directory.

## Configuration

To run the binary, you will need a properties file named `dbtomastodon.properties`.  Either on the same directory of the binary or on the user home directory. The properties are listed on the [ConfigFile.java](src/main/java/com/github/pizzacodr/dbtomastodon/ConfigFile.java) file.
