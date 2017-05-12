import java.util.*;

public class Application {

    public static void main(String[] args) {
        int i;
        int count = 0;
        int sum = 0;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        for(i=0; i<1000; i++){
            if(i%3 == 0 || i%5 == 0){
                count++;
                numbers.add(i);
            }
        }
        
        for(i=0; i<=numbers.size()-1; i++){
            sum+= numbers.get(i);
        }
        
        System.out.println("Sum: " + sum);
    }
}
Updater (Installer only):

* WinGup v4.1
