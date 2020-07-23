package junit5.tdd;


/**
 * @Author ZHUDO2
 * @Date 7/23/2020 11:36 AM
 * @Version 1.0
 */
public class FizzBuzz {
    public String play(int inputNumber){
        String result = "";
        result = result + getFizzByNumber(inputNumber) + getBuzzByNumber(inputNumber) + getWhizzByNumber(inputNumber);
        if("" .equals(result)){
            return String.valueOf(inputNumber);
        }
        return result;
    }

    public String getFizzByNumber(int inputNumber){
        return inputNumber % 3 == 0 ? "Fizz" : "";
    }
    public String getBuzzByNumber(int inputNumber){
        return inputNumber % 5 == 0 ? "Buzz" : "";
    }
    public String getWhizzByNumber(int inputNumber){
        return inputNumber % 7 == 0 ? "Whizz" : "";
    }
}
