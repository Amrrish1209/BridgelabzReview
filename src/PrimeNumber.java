import java.util.Stack;

public class PrimeNumber {

	public static void main(String[] args) {
		Stack<Integer> primeStack = new Stack<>();

		for (int i = 2; i <= 100; i++) {
			if (isPrime(i)) {
				primeStack.push(i);
			}
		}
		System.out.println("Prime Numbers between 1 to 100:");
		for(int i=primeStack.size()-1;i>=0;i--) {
			System.out.println(primeStack.get(i));
		}
	}
	

	public static boolean isPrime(int n) {
		if (n == 2 || n == 3) {
			return true;
		}
		if (n % 2 == 0 || n == 1) {
			return false;
		}
		for (int i = 3; i <= n / 2; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	/*
	 * public static void main(String[] args) { int primeNumber[] = new int[25]; int
	 * nonprimeNumber[] = new int[75]; int primeIndex = 0; int nonPrimeIndex = 0;
	 * int primeSum = 0; int nonPrimeSum = 0;
	 * 
	 * for (int i = 1; i <= 100; i++) { if (isPrime(i)) { primeNumber[primeIndex++]
	 * = i; primeSum += i; } else { nonprimeNumber[nonPrimeIndex++] = i; nonPrimeSum
	 * += i; } } for (int i = 0; i < primeNumber.length; i++) {
	 * System.out.println("Prime Numbers are : " + primeNumber[i]); }
	 * System.out.println(); System.out.println("sum of Prime Numbers: " +
	 * primeSum); System.out.println(); for (int i = 0; i < nonprimeNumber.length;
	 * i++) { System.out.println("Non Prime Numbers are: " + nonprimeNumber[i]); }
	 * System.out.println(); System.out.println("sum of NonPrimeNumber: " +
	 * nonPrimeSum);
	 * 
	 * }
	 * 
	 * public static boolean isPrime(int n) { if (n == 2 || n == 3) { return true; }
	 * if (n % 2 == 0 || n==1) { return false; } for (int i = 3; i <= n / 2; i += 2)
	 * { if (n % i == 0) { return false; } } return true; }
	 */
}