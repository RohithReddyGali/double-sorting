# CompSt 751 Group Project

## Name

Group 7 Double Sort.

## People

Please list all the team members with name, github username and email,e.g. 
John Boyland, @boyland, boyland@uwm.edu

* Lourdu Rohith Reddy Gali, @LourduRohithReddyGali, lgali@uwm.edu
* Sai Eka Vardhan Reddy Chitreddy, @chitred2, chitred2@uwm.edu
* Peter Li, @peterlli, ylli@uwm.edu
* Anirudh Gokamalla, @gokamal2, gokamal2@uwm.edu
* Mihir Dixit, @MihirDixit14, mdixit@uwm,edu
* Sreejith Krishna Naveen Kumar, @sreejithkrishna99, sknaveen@uwm.edu

## Paper

https://dl.acm.org/doi/10.1145/1734263.1734392

### Scope

Describe what you will be implementing.

As we are a team of 6 we would like to implement the whole paper by spitting the team into 3 each

1st group will work on double insertion sort and its related test cases
1. Sai Eka Vardhan Reddy Chitreddy
2. ANIRUDH GOKAMALLA 
3. Sreejith Krishna Naveen Kumar

2nd group will work on double selection sort and its related test cases
1. Peter Li
2. Lourdu Rohith Reddy Gali
3. Mihir Dixit

###### implentation
1. The base implementation
    * Implementing double insertion sort for even number of values in array.
    * Implementing double insertion sort for odd number of values in array.
    * Implementing double selection sort for even number of values in array.
    * Implementing double selection sort for odd number of values in array.

2. Primary unit tests, which will include
    * Primary test cases for both double insertion and selection sort in case of even, odd number of values in the array.
    * Efficiency Tests: we will add tests related to the performance of our algorithms
       * Ex: we can create an array with max_number of values in the array and perform sorting operations on this.
    * Random tests: we will add random testing similar to our homework.
    * Exhaustive tests: we will add exhaustive testing similar to our homework

### Artifacts found

Give URLs of code provided by the authors of the paper or their collaborators.
* The provided URL is the link to the paper (which contains snippets of code for double insertion sort):
* https://dl.acm.org/doi/epdf/10.1145/1734263.1734392

* References to double selection sort code in the paper (written in C++):
* http://pr.stewartsplace.org.uk/d/sortbench.d

## Plan

### Main classes

What classes will you implement to demonstrate the technique of the paper?

We will be implementing two classes:
* Double insertion sort main class.
* Double selection sort main class.


### Helper classes

Are there any helpers you need to implement?
These can be from other open-source projects, as long as you credit them.

* We are currently not using any helper methods to date but this may change later.

### Test Suites

Provide a section for each test suite that is planned and a paragraph describing what it will do.

#### Functionality testing
* We plan on implementing tests for functionality for our base implementation of double insertion and double selection sort. These tests will ensure that the functionality of our algorithms is functioning/behaving as intended. We will have a general abstract file that will contain common methods that will be shared between two other files - one for insertion sort and one for selection sort. The test files unique to each implementation will extend the base file and provide its own implementation of methods and, if necessary, implement additional test methods.
* [Base Implementation](src/BaseImplementationTest.java) (abstract test file) 
* [Base Implementation double insertion sort](src/BaseImplementationInsertionTest.java) (extends base implementation test file).
* [Base implementation double selection sort](src/BaseImplementationSelectionTest.java) (extends base implementation test file).

#### Efficiency testing
* These will be testing the efficiency of our algorithm to ensure that we have the most efficient implementation. This will be similar to the efficiency tests we have been utilizing in our homework assignment and will be utilizing a similar file structure to our base implementation test suite.
* [Efficiency test](src/EfficiencyTest.java) (abstract test file)  
* [Efficiency test - double insertion](src/EfficiencyInsertionTest.java) (extends base implementation test file).
* [Efficiency test - double selection](src/EfficiencySelectionTest.java) (extends base implementation test file).

#### Random testing
* These will be testing various scenarios with random testing to ensure that our implementation covers various edge cases and other scenarios. This will be similar to the random tests we have been utilizing in our homework assignment and will be utilizing a similar file structure to our base implementation test suite.
* [Random test](src/RandomTest.java) (abstract test file) 
* [Random test - double insertion](src/RandomInsertionTest.java) (extends base implementation test file).
* [Random test - double selection](src/RandomSelectionTest.java) (extends base implementation test file).

#### Exhaustive testing
* These will be testing as many unique cases as possible of our algorithm to ensure that we will be covering various scenarios. This will be similar to the exhaustive tests we have been utilizing in our homework assignment and will be utilizing a similar file structure to our base implementation test suite.
* [Exhaustive test](src/ExhaustiveTest.java) (abstract test file) 
* [Exhaustive test - double insertion](src/ExhaustiveInsertionTest.java) (extends base implementation test file).
* [Exhaustive test - double selection](src/ExhaustiveSelectionTest.java) (extends base implementation test file).

## Status

Add section using the current date as the heading and describe the status in a few sentences or a few paragraphs.

### 10/01/2023
* We have determined what functionality and unit tests we will need to implement.
* We will be splitting into 2 teams of 3 people each - group focus and members listed above.

### 10/09/2023
* Created test cases per Professor Boyland's comments on Canvas.
   * We have updated the src folder to include blank test files. These files will be used later for testing functionality (base implementation), efficiency, random, and exhaustive.
* Updated empty portions of Github's readme.

### 10/12/2023
* Updated previously added information (from 10/01 and 10/09) to be more concise and be under the proper headers.

### 10/14/2023
* Added sources.txt. In this file, we will be listing all the sources/resources that we plan on utilizing for our project.
* Created a rough draft of what sources we intend to utilize.

### 10/15/2023
* Updated sources.txt rough draft to be more concise and what we intend to utilize and convert.

### 11/05/2023
* Implemented insertion sort and selection sort in the respective files(Insertion Sort.java and selectionSort.java)
* Added base test cases for both insertion and selection sort.

### 11/16/2023
* Reworked base implementation test files.
* Received exhaustive test gen program from Professor Boyland. Started altering the program to work with our project and generate the correct file format and tests.

### 11/17/2023
* Completed exhaustive test gen and exhaustive testing.

### 11/30/2023
* Completed efficiency tests.

### 12/03/2023
* Fixed compiler errors in random testing by adding some rudimentary test cases. May not need random testing files after conversation with Dr. Boyland from a couple of weeks ago.

