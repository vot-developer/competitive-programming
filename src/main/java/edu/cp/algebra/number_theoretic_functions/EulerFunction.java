package edu.cp.algebra.number_theoretic_functions;

public class EulerFunction {

    /*
    Calculate Euler function value for n

    time - O(sqrt(n), space - O(1))
     */
    public int calculate(int n){
        int res = n;
        for (int i = 2; i <= n; i++){
            if (n % i == 0) {
                while (n % i == 0)
                    n /= i;
                res -= res/i;
            }
        }
        if (n > 1)
            res -= res/n;
        return res;
    }

}
