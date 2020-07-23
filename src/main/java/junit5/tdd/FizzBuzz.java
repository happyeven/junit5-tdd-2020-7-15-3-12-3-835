package junit5.tdd;

/**
 * @Author ZHUDO2
 * @Date 7/23/2020 11:36 AM
 * @Version 1.0
 */
public class FizzBuzz {
    public String play(int inputNumber){
        if(inputNumber % 3 == 0 && inputNumber % 5 == 0 && inputNumber % 7 == 0){
            return "FizzBuzzWhizz";
        }
        if(inputNumber % 3 == 0 && inputNumber % 5 == 0){
            return "FizzBuzz";
        }
        if(inputNumber % 3 == 0 && inputNumber % 7 == 0){
            return "FizzWhizz";
        }
        if(inputNumber % 5 == 0 && inputNumber % 7 == 0){
            return "BuzzWhizz";
        }
        if(inputNumber % 3 == 0){
            return "Fizz";
        }
        if(inputNumber % 5 == 0){
            return "Buzz";
        }
        if(inputNumber % 7 == 0){
            return "Whizz";
        }
        return String.valueOf(inputNumber);
    }
}
