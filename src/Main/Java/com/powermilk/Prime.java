package com.powermilk;

import java.util.Arrays;

public class Prime {
    public static boolean isPrime(int n) {
        if(n == 0) {
            return false;
        }
        for(int i=2;i<n;i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeQuick(int n) {
        if(n == 4 || n == 0) {
            return false;
        }
        for(int i=2;2*i<n;i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeQuicker(int n) {
        if (n%2==0) {
            if(n == 2) {
                return true;
            }
            return false;
        }
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeByArray(int n) {
        boolean[] primes=new boolean[n+1];
        Arrays.fill(primes,true);
        primes[0] = false;
        if(primes.length > 1) {
            primes[1] = false;
            for (int i = 2; i < primes.length; i++) {
                if (primes[i]) {
                    for (int j = 2; i * j < primes.length; j++) {
                        primes[i * j] = false;
                    }
                }
            }
        }

        return primes[n];
    }
}
