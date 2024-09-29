public class MathUtil {

    // Static Methods

    /**
     This method checks if a number n is prime.
     A number is prime if it's greater than 1 and is divisible only by 1 and itself.
     The method loops from 2 to the square root of n and checks if n is divisible
     by any number in this range. If it is, the number is not prime.
     */
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    /**
     This method calculates the greatest common divisor (GCD)
     of two numbers a and b using the Euclidean algorithm.
     The method repeatedly replaces a with b and b with the remainder of a % b until b becomes 0.
     The remaining value of a is the GCD.
     */
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    /**
     This method computes the least common multiple (LCM) of two numbers.
     The LCM is calculated by dividing the product of a and b by their GCD.
     */
    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    /**
     This method returns the nth Fibonacci number.
     The Fibonacci sequence starts with 0 and 1,
     and each subsequent number is the sum of the previous two.
     The method uses a loop to calculate this sum for the nth position.
     */
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    /**
     This method calculates the factorial of n (denoted as n!).
     It multiplies n by every integer below it down to 1.
     The factorial of 0 is defined as 1.
     */
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    // Non-static Methods

    /**
     This method checks if a number n is a perfect number,
     meaning it is equal to the sum of its divisors (excluding itself).
     The method sums up all the divisors of n and compares it to n.
     */
    public boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }

    /**
     This method computes the sum of the digits of a number n.
     It repeatedly extracts the last digit of n using n % 10,
     adds it to the sum, and removes the last digit by dividing n by 10.
     */
    public int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    /**
     This method reverses the digits of a number n.
     It extracts each digit (similar to sumOfDigits)
     and appends it to the result in reverse order.
     */
    public int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }

    /**
     This method checks if a number is an Armstrong number (or narcissistic number).
     It computes the sum of each digit raised to the power of the total number of digits,
     and checks if this sum equals the original number.
     */
    public boolean isArmstrongNumber(int n) {
        int original = n, sum = 0, digits = String.valueOf(n).length();
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        return sum == original;
    }

    /**
     This method finds the smallest prime number greater than n.
     It increments n and uses the isPrime method to check if the incremented number is prime.
     */
    public int nextPrime(int n) {
        n++;
        while (!isPrime(n)) {
            n++;
        }
        return n;
    }
}
