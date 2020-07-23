package junit5.tdd;

/**
 * @Author ZHUDO2
 * @Date 7/23/2020 11:36 AM
 * @Version 1.0
 */
public class FizzBuzz {
    public String play(int inputNumber){
        if(inputNumber % 3 == 0){
            return "Fizz";
        }
        if(inputNumber % 5 == 0){
            return "Buzz";
        }
        return String.valueOf(inputNumber);
    }
}
