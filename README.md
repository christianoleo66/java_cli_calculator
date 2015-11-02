# Java CLI Calculator

A Command Line (CLI) Calculator written in Java.

# User Acceptance Criteria

For each release, [create a release on Github](https://help.github.com/articles/creating-releases/) and send a link to the release page to your acceptance tester. Your acceptance tester can be the person who looks after you, other interns or mutiple people. The idea is that you get feedback and guidance early and often to accelerate both learning and results.

## Release 1

- I want to sum to whole numbers.
- I want to substract to whole numbers.

For now and any future releases:

- I want to enter the numbers via command prompt.
- I want to see each result visually.

## Release 2

- I want to devide to whole numbers.
  - Devision by zero is not allowed
- I want to multiply to whole numbers.

## Release 3

- I want sum, substract, devide and multiply with decimals.

## Release 4

- I want to sum, substract, devide and multiply with multiple numbers both whole and decimal.

## Release 5

- I want to get the radical of a number.

# Technical Acceptance Criteria

- Use Java to program your application (It should be already installed on your machine)
- Use the command line interface (CLI / Mac OS X Terminal) to run your application and fetch the user's input
- **Use JUnit to write *at least one test* per user acceptance criteria**

# First steps

Check if Maven is installed by typing…

```
mvn -v
```

… to the command line. It should return something like:

```
Apache Maven 3.3.3 (7994120775791599e205a5524ec3e0dfe41d4a06; 2015-04-22T13:57:37+02:00)
Maven home: /usr/local/Cellar/maven/3.3.3/libexec
Java version: 1.8.0_25, vendor: Oracle Corporation
Java home: /Library/Java/JavaVirtualMachines/jdk1.8.0_25.jdk/Contents/Home/jre
Default locale: de_DE, platform encoding: UTF-8
OS name: "mac os x", version: "10.11.1", arch: "x86_64", family: "mac"
```

If there is something like…

```
-bash: mvn: command not found
```

…instead, you need to install Maven.

If Maven is installed, you can jump to **Install the application**. If not, continue with **Install Maven**.

## Install Maven

We will install Maven via Homebrew, so you need to install Homebrew first. Check out the instructions [here](http://brew.sh/).

After Homebrew is successfully installed, run:

```
brew install maven
```

Check if Maven is installed by typing…

```
mvn -v
```

… to the command line. It should return something like:

```
Apache Maven 3.3.3 (7994120775791599e205a5524ec3e0dfe41d4a06; 2015-04-22T13:57:37+02:00)
Maven home: /usr/local/Cellar/maven/3.3.3/libexec
Java version: 1.8.0_25, vendor: Oracle Corporation
Java home: /Library/Java/JavaVirtualMachines/jdk1.8.0_25.jdk/Contents/Home/jre
Default locale: de_DE, platform encoding: UTF-8
OS name: "mac os x", version: "10.11.1", arch: "x86_64", family: "mac"
```

If that's not the case, you probably did something wrong. Try again or ask for help.

# Install the application

Before running the appication or running any tests, the needs to be installed via:

```
mvn install
```

# Run the application

To run the application from a user's perspective, you need to compile the application and run it via command line.

To compile the app, run:

```
mvn compile
```

This will run all the tests, compiles the code and produces a runnable JAR package in the `target` directory like `cli-calculator-1.0-SNAPSHOT`.

To run the JAR, type…

```
java -jar <FILENAME>.jar
```

…within the `target` folder. You can change a directory via the `cd` command. For more information on the command line interface, see this instruction, this [command list](http://guides.macrumors.com/Terminal) and this [cheatsheet](https://github.com/0nn0/terminal-mac-cheatsheet/wiki/Terminal-Cheatsheet-for-Mac-(-basics-)).

# Run the tests

Run your tests by typing:

```
mvn test
```

This will execute all tests from your `test` directory.

For more information on JUnit and writing tests, see the [JUnit website](http://www.vogella.com/tutorials/JUnit/article.html).

# Where to start your development?

The main class, where the application will start, is the `main()` method in `App.java` file within the `src/main/java/com/plentymarkets/cli_calculator/` directory. For more (German) information on the Java programming language, take a look [here]([Java ist auch eine Insel](http://openbook.rheinwerk-verlag.de/javainsel/)).

You should start by writing a unit test for your next task, e.g. to sum two numbers. You can run unit tests via the command line or with your IDE's debugger (let someone show you how to do this). **How to work with a debugger is the most important thing you ever learn as a software developer!**

As your unit tests does not fail anymore, implement user input and output and use it for your code instead of the test data from your unit test.

Go on with the next task.

# Resources and help

- [Hour of Code](https://studio.code.org/hoc/1)
- [Java ist auch eine Insel](http://openbook.rheinwerk-verlag.de/javainsel/)
- [JUnit Tests](http://www.vogella.com/tutorials/JUnit/article.html)
- [Mac Terminal Commands](http://guides.macrumors.com/Terminal)
- [Mac Terminal Cheatsheet](https://github.com/0nn0/terminal-mac-cheatsheet/wiki/Terminal-Cheatsheet-for-Mac-(-basics-))
- [Github Releases](https://help.github.com/articles/creating-releases/)
