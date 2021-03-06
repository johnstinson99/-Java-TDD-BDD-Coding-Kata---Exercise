package romanNumerals;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import romanNumerals.RomanNumeralGenerator;
import static org.assertj.core.api.Assertions.*;
/**
 * John Stinson 29 July 2015
 * Roman Numerals Kata - Cucumber Step Definitions DO NOT EDIT
 */

public class CucumberStepDefs {
    int inputNo;
    RomanNumeralGenerator myRomanNumeralGenerator = new RomanNumeralGenerator();

    @When("^I generate roman numeral for (-?[0-9]+)$")
    public void generateNumberFor(int myInputNo) throws Throwable {
        inputNo = myInputNo;
    }

    @Then("^the result is (.+)$")
    public void the_result_is(String myResult) throws Throwable {
        assertThat(myRomanNumeralGenerator.generateRomanNumber(inputNo))
               .isEqualTo(myResult);

    }

}
