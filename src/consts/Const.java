package consts;

import java.math.BigInteger;
import utils.CalculationManager;

public class Const {
    public static BigInteger MIN_N = CalculationManager.binPow(new BigInteger("2"), new BigInteger("250"));
    public static BigInteger MAX_N = CalculationManager.binPow(new BigInteger("2"), new BigInteger("256"));
    public static int K = 20;
}


