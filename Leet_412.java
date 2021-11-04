import java.util.ArrayList;
import java.util.List;

public class Leet_412 {
    public static void main(String[] args) {


    }
    
    public List<String> fizzBuzz(int n) {
        List<String> resList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i%15==0){
                resList.add("FizzBuzz");
            } else if (i%3==0){
                resList.add("Fizz");
            } else if (i%5==0){
                resList.add("Buzz");
            } else {
                resList.add(String.valueOf(i));
            }
        }
        return resList;
    }
}
