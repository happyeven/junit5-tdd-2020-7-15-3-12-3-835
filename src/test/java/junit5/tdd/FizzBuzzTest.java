package junit5.tdd;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Author ZHUDO2
 * @Date 7/23/2020 11:29 AM
 * @Version 1.0
 */
public class FizzBuzzTest {
    @Test
    public void should_return_1_when_count_off_given_1(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 1;
        String result = fizzBuzz.play(inputNumber);
        assertEquals("1",result);
    }
}
