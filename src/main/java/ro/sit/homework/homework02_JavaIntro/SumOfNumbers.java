package ro.sit.homework.homework02JavaIntro;

//Exercise 01
// Calculate the sum of the first 100 numbers higher than 0. Name the class (and java file) SumOfNumbers.
public class SumOfNumbers {

    public static void main(String[] args) {
        int sum = 0;   // variable that stores the sum of the numbers

        for (int number = 1; number <= 100; number++) {
            sum = sum + number;    // add the current number to the sum
        }

        System.out.println("Sum of the first 100 numbers is: " + sum);
    }
}

//Output
//Sum of the first 100 numbers is: 5050