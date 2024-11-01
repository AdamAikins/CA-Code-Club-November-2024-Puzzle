# Problem Statement

Vlad the Viking has written a sentence down, but Bexley has split it across 1000 files!

Help Vlad recover the original sentence!

# Input

Input the original sentence to complete this problem.

# How am I supposed to begin?

## Hint 1

The main method pieces together the original sentence from across 1000 different classes from Class000 to Class999.

However, the full string never actually exists at any point in time.
The rest of the code in Main is what ensures this happens. 

## Hint 2

The structure of 1000 classes are all the same
```
public class ClassXXX{
    public static String getString(){
        return ""; // This is either empty, or contains part of the sentence
    }
}
```

## Hint 3

Vlad knows that Bexley was lazy; the actual sentence fragments are only contaned in two files; all the rest contain an empty string.

## But I still don't what to do!

This problem is meant to force you to use tools beyond a simple text editor. in fact, I'm not sure this even compiles in BlueJ.

I'm aware of a couple tools that might work. 

Some of the more straightforward ones are Bash and Powershel (Scripting), grep or findstr (command-line tools), or some of the more advanced editors.

Some of these are harder to learn and use than others, but all will be worth learning in the long run. I recommend trying at least one of these methods even if you find another way to solve this problem.

There is also an (extremely) simple way to solve this problem that involves none of these tools.


