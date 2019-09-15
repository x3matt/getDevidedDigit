import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestClass {

    GetDividedDigit getDividedDigit = new GetDividedDigit();
    @Test
    public void getDividedDigit_valid_div3(){
        assertEquals("9",getDividedDigit.getDivDigit(27));
        assertEquals("7",getDividedDigit.getDivDigit(21));
        assertEquals("5",getDividedDigit.getDivDigit(15));
        assertEquals("515",getDividedDigit.getDivDigit(1545));
    }
    @Test
    public void getDividedDigit_valid_div5(){
        assertEquals("5",getDividedDigit.getDivDigit(25));
        assertEquals("25",getDividedDigit.getDivDigit(125));
        assertEquals("50",getDividedDigit.getDivDigit(250));
        assertEquals("250",getDividedDigit.getDivDigit(1250));
    }
    @Test
    public void getDividedDigit_invalid(){
        assertEquals("17",getDividedDigit.getDivDigit(17));
        assertEquals("533",getDividedDigit.getDivDigit(533));
        assertEquals("0",getDividedDigit.getDivDigit(0));
        assertEquals("11",getDividedDigit.getDivDigit(11));
        assertEquals("1",getDividedDigit.getDivDigit(1));
    }
    @Test(expected = NullPointerException.class)
    public void getDividedDigit_NullPointerException(){
        getDividedDigit.getDivDigit(null);
    }
}
