package com.galvanize;

/*
Today's project: What is the Fibonacci Sequence?
It is the series of numbers where the next number is found
by adding up the two numbers before it (1, 1, 2, 3, 5, 8, 13, ...). Given (n),
calculate and output F(n) (with a numerical input, output the nth number in the sequence.)
 */

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(0)); //0
        System.out.println(fib(1)); //1
        System.out.println(fib(2)); //1
        System.out.println(fib(3)); //2
        System.out.println(fib(4)); //3
        System.out.println(fib(5)); //5
        System.out.println(fib(6)); //8
        System.out.println(fib(7)); //13
        System.out.println(fib(8)); //21
        System.out.println(fib(9)); //34
    }

    /*
    base case ->
        count iterations, if iterations == n, break

    recurse case ->
        as long as base conditional not hit, recurse

      (1, 1, 2, 3, 5, 8, 13, ...)

      always start at 1
      have a counter for iterations
      the next number is always the sum of the last two
      fib(n - 1) + fib(n - 2) = fib(n)

      fib(1) + fib(0) = fib(2)
      1 +



     */
    public static int fib(int n) {
        //base case
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        //return a recursive call
        return fib(n - 1) + fib(n - 2);
    }

}
