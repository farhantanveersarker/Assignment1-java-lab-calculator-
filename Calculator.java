public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return (double) a / b;
    }

    public int[] fibonacci(int n) {
        if (n <= 0) {
            return new int[0]; // Return an empty array for invalid input
        }
        
        int[] fibSeries = new int[n];
        fibSeries[0] = 0;
        if (n > 1) {
            fibSeries[1] = 1;
            for (int i = 2; i < n; i++) {
                fibSeries[i] = fibSeries[i - 1] + fibSeries[i - 2];
            }
        }
        return fibSeries;
    }

    public int sumOfArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public double meanOfArray(int[] arr) {
        return sumOfArray(arr) / (double) arr.length;
    }

    public double varianceOfArray(int[] arr) {
        double mean = meanOfArray(arr);
        double sumSquaredDiffs = 0;
        for (int num : arr) {
            sumSquaredDiffs += Math.pow(num - mean, 2);
        }
        return sumSquaredDiffs / arr.length;
    }

    public double standardDeviationOfArray(int[] arr) {
        return Math.sqrt(varianceOfArray(arr));
    }

}
