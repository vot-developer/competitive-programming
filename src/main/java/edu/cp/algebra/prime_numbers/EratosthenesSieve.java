package edu.cp.algebra.prime_numbers;

public class EratosthenesSieve {

    /*
    Count all prime numbers from 1 to n (included)
    time - O(log log n), space - O(n)
     */
    public int countPrimeNumbers(int n){
        boolean[] sieve = new boolean[n + 1];

        for (int i = 2; i <= n; i++){
            if (!sieve[i]){ //log
                for (int j = i * i; j <= n; j+=i) //log n
                    sieve[j] = true;
            }
        }

        int count = 0;
        for (int i = 2; i <= n; i++)
            if(!sieve[i])
                count++;
        return count;
    }
}
