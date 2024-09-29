public class Main {
    public static void main(String[] args) {

        // Static methods test
        System.out.println("Testing static methods:");

        // Test cases for isPrime
        System.out.println("isPrime(5): " + MathUtil.isPrime(5));   // true
        System.out.println("isPrime(4): " + MathUtil.isPrime(4));   // false
        System.out.println("isPrime(13): " + MathUtil.isPrime(13) + "\n"); // true


        // Test cases for gcd
        System.out.println("gcd(24, 18): " + MathUtil.gcd(24, 18));   // 6
        System.out.println("gcd(100, 25): " + MathUtil.gcd(100, 25)); // 25
        System.out.println("gcd(8, 3): " + MathUtil.gcd(8, 3) + "\n");       // 1

        // Test cases for lcm
        System.out.println("lcm(4, 5): " + MathUtil.lcm(4, 5));   // 20
        System.out.println("lcm(7, 3): " + MathUtil.lcm(7, 3));   // 21
        System.out.println("lcm(6, 8): " + MathUtil.lcm(6, 8) + "\n");   // 24

        // Test cases for fibonacci
        System.out.println("fibonacci(5): " + MathUtil.fibonacci(5));  // 5
        System.out.println("fibonacci(7): " + MathUtil.fibonacci(7));  // 13
        System.out.println("fibonacci(10): " + MathUtil.fibonacci(10) + "\n");// 55

        // Test cases for factorial
        System.out.println("factorial(5): " + MathUtil.factorial(5));  // 120
        System.out.println("factorial(0): " + MathUtil.factorial(0));  // 1
        System.out.println("factorial(7): " + MathUtil.factorial(7) + "\n");  // 5040

        // Non-static methods test
        System.out.println("Testing non-static methods:");
        MathUtil mathUtil = new MathUtil();

        // Test cases for isPerfectNumber
        System.out.println("isPerfectNumber(6): " + mathUtil.isPerfectNumber(6));    // true
        System.out.println("isPerfectNumber(28): " + mathUtil.isPerfectNumber(28));  // true
        System.out.println("isPerfectNumber(12): " + mathUtil.isPerfectNumber(12) + "\n");  // false

        // Test cases for sumOfDigits
        System.out.println("sumOfDigits(123): " + mathUtil.sumOfDigits(123));  // 6
        System.out.println("sumOfDigits(456): " + mathUtil.sumOfDigits(456));  // 15
        System.out.println("sumOfDigits(789): " + mathUtil.sumOfDigits(789) + "\n");  // 24

        // Test cases for reverseNumber
        System.out.println("reverseNumber(123): " + mathUtil.reverseNumber(123));   // 321
        System.out.println("reverseNumber(4567): " + mathUtil.reverseNumber(4567)); // 7654
        System.out.println("reverseNumber(890): " + mathUtil.reverseNumber(890) + "\n");   // 98

        // Test cases for isArmstrongNumber
        System.out.println("isArmstrongNumber(153): " + mathUtil.isArmstrongNumber(153)); // true
        System.out.println("isArmstrongNumber(9474): " + mathUtil.isArmstrongNumber(9474)); // true
        System.out.println("isArmstrongNumber(123): " + mathUtil.isArmstrongNumber(123) + "\n"); // false

        // Test cases for nextPrime
        System.out.println("nextPrime(11): " + mathUtil.nextPrime(11)); // 13
        System.out.println("nextPrime(17): " + mathUtil.nextPrime(17)); // 19
        System.out.println("nextPrime(20): " + mathUtil.nextPrime(20) + "\n"); // 23
    }
}