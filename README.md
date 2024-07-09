# Group Project

## Name

Group 7 Double Sort.

## Paper

https://dl.acm.org/doi/10.1145/1734263.1734392

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
