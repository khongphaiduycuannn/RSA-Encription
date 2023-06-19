package utils;

import java.math.BigInteger;
import java.util.Random;

public class CalculationManager {
    
    public static BigInteger getRandomNumber(BigInteger min, BigInteger max) {
        Random random = new Random();
        BigInteger randomBigInteger = new BigInteger(max.bitLength(), random);
        randomBigInteger = randomBigInteger.mod(max.subtract(min).add(BigInteger.ONE)).add(min);
        return randomBigInteger;
    }
    
    public static BigInteger gcd(BigInteger a, BigInteger b) {
        if (b.equals(new BigInteger("0")))
            return a;
        return gcd(b, a.mod(b));
    }
    
    public static BigInteger getEulerPhi(BigInteger p, BigInteger q) {
        return p.subtract(new BigInteger("1")).multiply(q.subtract(new BigInteger("1"))); 
    }
    
    public static BigInteger binPow(BigInteger a, BigInteger n, BigInteger mod) {
        if (n.equals(new BigInteger("0"))) 
            return new BigInteger("1");
        
        BigInteger temp = binPow(a, n.divide(new BigInteger("2")), mod);
        
        if (n.mod(new BigInteger("2")).equals(new BigInteger("1"))) {
            return temp.multiply(temp).multiply(a).mod(mod);
        }
        return temp.multiply(temp).mod(mod);
    }
    
     public static BigInteger binPow(BigInteger a, BigInteger n) {
        if (n.equals(new BigInteger("0"))) 
            return new BigInteger("1");
        
        BigInteger temp = binPow(a, n.divide(new BigInteger("2")));
        
        if (n.mod(new BigInteger("2")).equals(new BigInteger("1"))) {
            return temp.multiply(temp).multiply(a);
        }
        return temp.multiply(temp);
    }
    
    public static void extendedEuclid(BigInteger[] a, BigInteger A, BigInteger B) {
        if (B.equals(new BigInteger("0"))) {
            a[0] = new BigInteger("1");
            a[1] = new BigInteger("0");
        }
        else {
            extendedEuclid(a, B, A.mod(B));
            BigInteger temp = a[0];
            a[0] = a[1];
            a[1] = temp.subtract(A.divide(B).multiply(a[1]));
        }
    }
    
    public static BigInteger inverseModulo(BigInteger a, BigInteger n) {
        BigInteger[] arr = new BigInteger[2];
        extendedEuclid(arr, a, n);
        return arr[0].mod(n).add(n).mod(n);
    }
}
