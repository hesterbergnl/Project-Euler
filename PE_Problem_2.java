import java.util.*;

public class Application {

    public static void main(String[] args) {
        
        int preVal = 2;
        int twoPreVal = 1;
        int sum = 2;
        int curVal;
        
        while(true){
            curVal = preVal + twoPreVal;
            if(curVal >= 4000000){
                break;
            }
            if(curVal % 2 == 0){
                sum += curVal;
            }
            twoPreVal = preVal;
            preVal = curVal;
            System.out.println(curVal);
        }
        System.out.println("Sum: " + sum);
    }
}