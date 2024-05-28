package p4n;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberSumCalculator {

   
    public static <T extends Number> Result sumEvenAndOdd(List<T> numbers) {
        double evenSum = 0.0;
        double oddSum = 0.0;

        for (T number : numbers) {
            if (number.doubleValue() % 2 == 0) {
                evenSum += number.doubleValue();
            } else {
                oddSum += number.doubleValue();
            }
        }

        return new Result(evenSum, oddSum);
    }

    
    public static class Result {
        private double evenSum;
        private double oddSum;

        public Result(double evenSum, double oddSum) {
            this.evenSum = evenSum;
            this.oddSum = oddSum;
        }

        public double getEvenSum() {
            return evenSum;
        }

        public double getOddSum() {
            return oddSum;
        }

        @Override
        public String toString() {
            return "Even Sum: " + evenSum + ", Odd Sum: " + oddSum;
        }
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Double> doubleList = Arrays.asList(1.5, 2.0, 3.5, 4.0, 5.5, 6.0);

        Result integerResult = sumEvenAndOdd(integerList);
        Result doubleResult = sumEvenAndOdd(doubleList);

        System.out.println("Integer List Result: " + integerResult);
        System.out.println("Double List Result: " + doubleResult);
    }
}
