import java.util.Scanner;

public class FactorialCalculator {

    protected String [] types;


    // Constructor for the class.
    public FactorialCalculator () {
        types = new String [] {"recursive", "iterative"};
    }


    // Main driver code
    public static void main(String[] args) {
        Scanner input_scanner = new Scanner(System.in);

        // to do: input validation

        System.out.print("Please enter a number to compute its factorial: ");
        int num = input_scanner.nextInt();

        System.out.print("Please enter the method of computation (iterative/recursive): ");
        String type = input_scanner.next();
        type.toLowerCase();

        Factorial fact = new Factorial();
        int result = fact.factorial(num, type);

        System.out.print("The factorial of " + num + " is " + result);

    }


    /*
       THE FOLLOWING FUNCTIONS ARE NOT USED IN THIS PROGRAM BUT USEFUL FOR DEBUGGING AND ANALYSIS
    */


    // This function tests three sample values of the factorial function.
    public boolean testFactorial() {
        Factorial factorial = new Factorial();
        int[][] expectedValues = {{1, 1}, {4, 24}, {10, 3628800}};

        for (String type : types) {
            for (int i = 0; i < expectedValues.length; i++) {
                if (factorial.factorial(expectedValues[i][0], type) != expectedValues[i][1]) {
                    return false;
                }
            }
        }
        return true;
    }


    // This is a stub for testing the timing
    public void testPerformance() {
        // to do - compare recursion to iteration using wall clock speed
    }

}
