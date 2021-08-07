package edu.cp.algebra.prime_numbers;

public class Primality {

    /*
    Method determine if a number is prime or not.

    time - O(sqrt(n)), space - O(1)
     */
    public boolean testTrialDivision(int n){
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

}
