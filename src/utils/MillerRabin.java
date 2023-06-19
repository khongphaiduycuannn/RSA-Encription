package utils;

import java.math.BigInteger;

public class MillerRabin {

    public static boolean isPrime(BigInteger n, int k) {
        if (n.compareTo(BigInteger.ONE) <= 0 || n.mod(new BigInteger("2")).equals(BigInteger.ZERO))
            return false;

        BigInteger d = n.subtract(BigInteger.ONE);
        int s = 0;
        while (d.mod(new BigInteger("2")).equals(BigInteger.ZERO)) {
            s++;
            d = d.divide(new BigInteger("2"));
        }

        for (int i = 0; i < k; i++) {
            BigInteger a = CalculationManager.getRandomNumber(new BigInteger("2"), n.subtract(new BigInteger("2")));
            BigInteger x = a.modPow(d, n);
            if (x.equals(BigInteger.ONE) || x.equals(n.subtract(BigInteger.ONE)))
                continue;
            for (int j = 0; j < s - 1; j++) {
                x = x.modPow(new BigInteger("2"), n);
                if (x.equals(BigInteger.ONE))
                    return false;
                if (x.equals(n.subtract(BigInteger.ONE)))
                    break;
            }
            if (!x.equals(n.subtract(BigInteger.ONE)))
                return false;
        }
        return true;
    }
}
