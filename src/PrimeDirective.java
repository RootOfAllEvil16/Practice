// Import statement:

import java.util.ArrayList;

class PrimeDirective {

    // Add your methods here, its boolean bc it returns true/false
    public boolean isPrime(int number) {
        //in method  above the loop build if/else if statement
        if (number == 2) {
            //2 is a smallest prime number
            return true;
        } else if (number < 2) {
            //if less than 2 it is not prime
            return false;
        }

        //loop
        for (int i = 2; i < number; i++) {
            //is number divisible by i
            if (number % i == 0) {
                //if yes, number is not prime and return false
                return false;
            }
        }
        //below for loop, number isn`t divisible by any two smaller integers
        return true;

    }

    //method with integer arraylist
    public ArrayList<Integer> onlyPrimes(int[] numbers) {
        //create new empty arraylist that store all the prime numbers
        ArrayList<Integer> primes = new ArrayList<Integer>();
        //find all primes in array, create for-each loop
        for (int number : numbers) {
            //if number is prime, add it to primes
            if (isPrime(number)) {
                primes.add(number);
            }
        }
        //return primes from method
        return primes;
    }

    public static void main(String[] args) {
//instance instantiated
        PrimeDirective pd = new PrimeDirective();
        //test isPrime method with different numbers (any)
        System.out.println(pd.isPrime(28));
        //our array of numbers
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
//test onlyPrimes method with array
        System.out.println(pd.onlyPrimes(numbers));
    }

}