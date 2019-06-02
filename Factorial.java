public class Factorial {

    public int factorial (int n, String type) {
        if(type.equals("iterative")) {
            return factorial_iterative(n);
        }
        if (type.equals("recursive")) {
            return factorial_recursive(n);
        }
        return 0;
    }

    public int factorial_iterative(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public int factorial_recursive(int n) {
        if(n == 1) {
            return 1;
        }
        return n * factorial_recursive(n - 1);
    }
}


