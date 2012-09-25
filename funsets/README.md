Functional Sets — View Assignment
Assignment Name 	Functional Sets
Due Date 	Fri 5 Oct 2012 10:00:00 AM EEST
Hard Deadline 	Tue 9 Oct 2012 10:00:00 AM EEST
Submission 	Go to Assignments List page to submit your solutions.
Instructions 	

In this assignment, you will work with a functional representation of sets based on the mathematical notion of characteristic functions. The goal is to gain practice with higher-order functions.

Download the funsets.zip handout archive file and extract it somewhere on your machine. Write your solutions by completing the stubs in the FunSets.scala file.

Write your own tests! For this assignment, we don’t give you tests but instead the FunSetSuite.scala file contains hints on how to write your own tests for the assignment.
Representation

We will work with sets of integers. How would you represent the set of all positive integers? You cannot list them all… one way would be so say: if you give me an integer, I can tell you whether it’s in the set or not: for 3, I say ‘yes’; for -1, I say no.

Mathematically, we call the function which takes an integer as argument and which returns a boolean indicating whether the given integer belongs to a set, the characteristic function of the set. For example, we can characterize the set of positive integers by the characteristic function (x: Int => x > 0).

Therefore, we choose to represent a set by its characterisitc function and define a type alias for this representation:

type Set = Int => Boolean

Using this representation, we define a function that tests for the presence of a value in a set:

def contains(s: Set, elem: Int): Boolean = s(elem)

2.1 Basic Functions on Sets

Let’s start by implementing basic functions on sets.

    Define a function which creates a singleton set from one integer value: the set represents the set of the one given element. Its signature is as follows:

    def singletonSet(elem: Int): Set

    Now that we have a way to create singleton sets, we want to define a function that allow us to build bigger sets from smaller ones.

    Define the functions union, intersect, and diff, which takes two sets, and return, respectively, their union, intersection and differences. diff(s, t) returns a set which contains all the elements of the set s that are not in the set t. These functions have the following signatures:

    def union(s: Set, t: Set): Set def intersect(s: Set, t: Set): Set def diff(s: Set, t: Set): Set

    Define the function filter which selects only the elements of a set that are accepted by a given predicate p. The filtered elements are returned as a new set. The signature of filter is as follows:

    def filter(s: Set, p: Int => Boolean): Set

2.2 Queries and Transformations on Sets

In this part, we are interested in functions used to make requests on elements of a set. The first function tests whether a given predicate is true for all elements of the set. This forall function has the following signature:

def forall(s: Set, p: Int => Boolean): Boolean

Note that there is no direct way to find which elements are in a set. contains only allows to know whether a given element is included. Thus, if we wish to do something to all elements of a set, then we have to iterate over all integers, testing each time whether it is included in the set, and if so, to do something with it. Here, we consider that an integer x has the property -1000 <= x <= 1000 in order to limit the search space.

    Implement forall using linear recursion. For this, use a helper function nested in forall. Its structure is as follows (replace the ???):

    def forall(s: Set, p: Int => Boolean): Boolean = {
     def iter(a: Int): Boolean = {
       if (???) ???
       else if (???) ???
       else iter(???)
     }
     iter(???)

    }

    Using forall, implement a function exists which tests whether a set contains at least one element for which the given predicate is true. Note that the functions forall and exists behave like the universal and existential quantifiers of first-order logic.

    def exists(s: Set, p: Int => Boolean): Boolean

    Finally, write a function map which transforms a given set in another one by applying to each of its element the given function. map has the following signature:

    def map(s: Set, f: Int => Int): Set

Extra Hints

    Be attentive in the video lectures on how to write anonymous functions in Scala.
    Sets are represented as functions. Think about what it means for an element to belong to a set, in terms of function evaluation. For example, how do you represent a set that contains all numbers between 1 and 100?
    Most of the solutions for this assignment can be written as one-liners. If you have more, you probably need to rethink your solution. In other words, this assignment needs more thinking (whiteboard, pen and paper) than coding ;-).
    If you are having some trouble with terminology, have a look at the glossary.
