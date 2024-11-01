# Problem Statement

Vlad the Viking recently learned about labels and has given you the following
program to demonstrate his knowledge!

## What are Labels?

Labels can be used to name loops, such as in the following section of code:
```
outerLoop: 
    for (int i = 0; i < 5; i++) { 
    innerLoop: 
        for (int j = 0; j < 5; j++) { 
            //code
        } 
    } 
} 
```
But while this is interesting, we still don't know what they can be used for!

## What are Labels Used For?

Labels are used in conjunction with two other keywords: `break` and `continue`.

When used without labels, `break` exits the current loop, while `continue`
skips to the beginning of the next iteration of the current loop.

This is useful, for example, if you want to print all the strings in an array
that come before the word "hello".

However, with labels, `break` and `continue` can operate on a specific loop.

This is useful, for example, if you want to print all the strings in an 2D
array, which needs to be iterated through using nested for loops, that come
before the word "hello".

# Your Task

The program in Main.java implements a currently unknown method using labels.
Your task is to get that method to return a value of 20.

DO NOT CHANGE ANY OF THE CODE IN THE METHOD.