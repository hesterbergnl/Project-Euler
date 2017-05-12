//this is kinda right...

import java.util.*;

public class Application {

    public static void main(String[] args) {
        
        ArrayList<Integer> primes = new ArrayList<Integer>();
        int num;
        long i = 0;
        int j = 0;
        int largestPrimeDiv = 1;
        boolean flag = true;
        
        for(i=2; i<600851475143L; i++){
            if(600851475143L%i == 0){
                if(isPrime(i)){
                    largestPrimeDiv = (int)i;
                    System.out.println(largestPrimeDiv);
                }
            }
        }
        System.out.println("largest prime divisor: " + largestPrimeDiv); 
    }
    
    public static boolean isPrime(long num){
        int i;
        
        for(i=2; i*i<num; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
