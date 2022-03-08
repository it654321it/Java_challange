import org.junit.Assert;
import org.junit.Test;

public class TestFibonachiApp {
    private Fibonachi f = new Fibonachi();

    @Test
    public void fibonachiTestForNumberSeven() {
        int inputNumber = 7, expectedtAnswer = 13;
        Assert.assertEquals(expectedtAnswer, f.getLastNumberInFibonachiRow(inputNumber));
    }

    @Test
    public void test() {
        int[] inputNumber = {1, 2, 3, 4, 5, 6,  7,  8,  9, 10, 11,  12,  13,  14,  15,  16,   17,   18,   19,   20};
		
        //Entered number: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765
        //Fibonachi raw:  1, 2, 3, 4, 5, 6,  7,  8,  9, 10, 11,  12,  13,  14,  15,  16,   17,   18,   19,   20
        
        int[] expectedtAnswer = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765};

        for (int i = 0; i < inputNumber.length; i++){
            Assert.assertEquals(expectedtAnswer[i], f.getLastNumberInFibonachiRow(inputNumber[i]));
        }
    }
}