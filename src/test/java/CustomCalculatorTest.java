
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.collection.IsEmptyCollection.empty;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CustomCalculatorTest {

    private CustomCalculator customCalculator;

    //더하기 테스트 작성
    @Test
    public void add() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(10,15);
        assertTrue(result == 25);
        assertThat(result, is(25));
        /* 이곳에 테스트 코드를 작성하세요. */
//        System.out.println("result :: " + result);
    }

    //빼기 테스트 작성
    @Test
    public void subtract() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(23,10);
        //assertTrue(result == 13);
        assertThat(result, is(13));
        //assertFalse(result == 13);
        /* 이곳에 테스트 코드를 작성하세요. */
        System.out.println("result :: " + result);
    }

    @Test
    public void subtract2() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(23,10);
        assertFalse(result == 11);
        /* 이곳에 테스트 코드를 작성하세요. */
        System.out.println("result :: " + result);
    }

    //곱하기 테스트 작성
    @Test
    public void multiply() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.multiply(5,9);
        /* 이곳에 테스트 코드를 작성하세요. */
        System.out.println("result :: " + result);
    }

    //나누기 테스트 작성
    @Test
    public void divide() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.divide(25,5);
        /* 이곳에 테스트 코드를 작성하세요. */
        System.out.println("result :: " + result);
    }

    @Test(timeout = 4000)
    public void timeInMethodTest() throws InterruptedException {
        Thread.sleep(5000);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testIsEmptyOutofBoundException(){
        new ArrayList<Object>().get(0);
    }

    @Test
    public void isEmptyArray(){
        ArrayList<Object> myList = new ArrayList<>();
        assertThat(myList, is(empty()));
    }
}