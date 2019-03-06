package main;

import java.math.BigInteger;

public class Recursion1 {
    static BigInteger factorial(BigInteger number) {
        if(number.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }
        return number.multiply(factorial(number.subtract(BigInteger.ONE)));
    }

    public static void main(String[] args) {
        Recursion1 recursion1 = new Recursion1();
        System.out.println(factorial(BigInteger.valueOf(50))); }
}
/*
* Input: 50
* Output: 30414093201713378043612608166064768844377641568960512000000000000 */

