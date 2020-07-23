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
        String result = getReturnFromCombinationOfTwoNum(inputNumber);
        if(result == null){
            result = getReturnFromSimgleNum(inputNumber);
        }
        return result == null ? String.valueOf(inputNumber) : result;
    }
    public String getReturnFromCombinationOfTwoNum(int inputNumber){
        if(inputNumber % 3 == 0 && inputNumber % 5 == 0){
            return "FizzBuzz";
        }
        if(inputNumber % 3 == 0 && inputNumber % 7 == 0){
            return "FizzWhizz";
        }
        if(inputNumber % 5 == 0 && inputNumber % 7 == 0) {
            return "BuzzWhizz";
        }
        return null;
    }
    public String getReturnFromSimgleNum(int inputNumber){
        if(inputNumber % 3 == 0){
            return "Fizz";
        }
        if(inputNumber % 5 == 0){
            return "Buzz";
        }
        if(inputNumber % 7 == 0){
            return "Whizz";
        }
        return null;
    }
}
