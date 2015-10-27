# -Java-TDD-BDD-Coding-Kata---Exercise
Template for Roman Numerals TDD coding exercise in IntelliJ IDEA with Maven

This repository contains all you need to get started with the Roman Numerals Kata in Maven.

The exercise is to convert numbers from 1 to 99 to Roman Numerals I to XCIX.  
Note the convention is to first convert the tens, then the units so 99 is XC+IX, (90+9) and NOT IC (one less than 100)

All libraries and initial example JUnit and Cucumber tests are already present.
Add the next simplest unit test, then implement the simplest code to allow it to pass.  
Once the test is passing, look for opportunities to refactor, then repeat.

Once you've covered tests for converting 1 to 3 to Roman Numerals, move on to the Cucumber feature file.
The step definitions are already there.  There should be no need to edit these or the Cucumber runner.
All you need to do is add more scenairos to the feature file.

Once you have a sufficient number of functional tests and implemented code, take a look at the commented out performance/load 
test in the unit test file.  Uncomment and run the code.
What do you notice about the first test? Copy results to Excel, convert the Y axis to a logarithmic scale to make it clearer.
What do you think the reason is for this difference?  What would be the best way to test performance for a single converion?

What would appropriate edge cases be? Is it possible to write a negative test case for a decimal in Java? What happens if you try?
What would happen in Python?
