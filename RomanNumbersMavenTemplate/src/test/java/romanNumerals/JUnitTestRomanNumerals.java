package romanNumerals;
import junit.framework.TestCase;
//import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
/**
 * John Stinson 29 July 2015
 * Roman Numerals Kata - jUnit tests - ADD UNIT TESTS HERE
 */

public class JUnitTestRomanNumerals extends TestCase{
    RomanNumeralGenerator myGenerator = new RomanNumeralGenerator();

    //If this passes it proves the test framework works.
    //Note Fluent test format is used here. This uses assertj library.
    public void test_romanNumeralFor_1_returns_I() {
        assertThat(myGenerator.generateRomanNumber(1)).isEqualTo("I");
    }

    //TODO - Write simplest test for method generateRomanNumber()


    //Example performance test code
    /*public void testPrintPerformance(){
        double myRunList[] = {1,1e1,1e2, 1e3, 1e4, 1e5, 1e6};
        for (double myNumberOfRuns: myRunList){
            double myTime = getMillisecondsForNRuns(myNumberOfRuns);
            System.out.println(myTime);
        }
    }
    public double getMillisecondsForNRuns(double noOfRuns){
        long startNanoseconds = System.nanoTime();
        for(double i = 1; i < noOfRuns; i++){
            myGenerator.generateRomanNumber(1);
        }
        long endNanoseconds = System.nanoTime();
        return (endNanoseconds-startNanoseconds)/1000000.0d;
    }*/
}
