package mine;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Define the number of elements in the Fibonacci series you want to generate
        int n = 10; // Example: first 10 Fibonacci numbers
        
        // Variables to hold the first two Fibonacci numbers
        int first = 0;
        int second = 1;
        
        // Print the first two Fibonacci numbers
        System.out.println(first);
        System.out.println(second);
        
        // Loop to generate and print the rest of the Fibonacci series
        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.println(next);
            // Update the variables to hold the last two numbers of the series
            first = second;
            second = next;
        }
    }
}
