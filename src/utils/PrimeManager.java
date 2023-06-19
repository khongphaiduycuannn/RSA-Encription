package utils;

import consts.Const;
import java.math.BigInteger;

public class PrimeManager {
    
    public static BigInteger getRandomPrime(BigInteger min, BigInteger max) {
        BigInteger randomBigInteger;

        do {
            randomBigInteger = CalculationManager.getRandomNumber(min, max);
        }
        while(!isPrime(randomBigInteger));
            
        return randomBigInteger;
    }
    
    public static BigInteger getCoprime(BigInteger phi) {
        BigInteger m;
        do {
            m = getRandomPrime(new BigInteger("2"), phi.subtract(new BigInteger("1")));
        }
        while(!isPrime(m));
        return m;
    }
    
    public static boolean isPrime(BigInteger n) {
        return MillerRabin.isPrime(n, Const.K);
    }
}
