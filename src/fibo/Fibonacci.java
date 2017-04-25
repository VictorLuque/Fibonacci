package fibo;

public class Fibonacci {

    public double getRecursiveFibonacci(int n) throws IllegalArgumentException {
        if (n < 0){
            throw new IllegalArgumentException();
        }

        if (n == 0){
            return 0;
        }

        if (n == 1){
            return 1;
        }

        Fibonacci fiborecursive = new Fibonacci();
        return fiborecursive.getRecursiveFibonacci(n - 1) + fiborecursive.getRecursiveFibonacci(n - 2);
    }
}