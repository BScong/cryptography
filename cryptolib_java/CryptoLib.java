// Compilation (CryptoLibTest contains the main-method):
//   javac CryptoLibTest.java
// Running:
//   java CryptoLibTest

public class CryptoLib {

	/**
	 * Returns an array "result" with the values "result[0] = gcd",
	 * "result[1] = s" and "result[2] = t" such that "gcd" is the greatest
	 * common divisor of "a" and "b", and "gcd = a * s + b * t".
	 **/
	public static int[] EEA(int a, int b) {
		// Note: as you can see in the test suite,
		// your function should work for any (positive) value of a and b.
		boolean swapped = false;
		if (b>=a){
			swapped = true;
			int swap = b;
			b=a;
			a=swap;
		}

		int gcd = b;
		int s = 0;
		int t = 1;
		int old_gcd = a;
		int old_s = 1;
		int old_t = 0;
		int tmp;

		while (gcd!=0){
			int q = old_gcd/gcd;

			tmp = gcd;
			gcd = old_gcd-q*tmp;
			old_gcd = tmp;

			tmp = s;
			s = old_s-q*tmp;
			old_s = tmp;

			tmp = t;
			t = old_t-q*tmp;
			old_t = tmp;
			//System.out.println(gcd+" "+s+" "+t);
		}

		int[] result = new int[3];
		result[0] = old_gcd;
		if(swapped){
			tmp = old_s;
			old_s=old_t;
			old_t = tmp;
		}
		result[1] = old_s;
		result[2] = old_t;
		return result;
	}

	/**
	 * Returns Euler's Totient for value "n".
	 **/
	public static int EulerPhi(int n) {
		return -1;
	}

	/**
	 * Returns the value "v" such that "n*v = 1 (mod m)". Returns 0 if the
	 * modular inverse does not exist.
	 **/
	public static int ModInv(int n, int m) {
		return -1;
	}

	/**
	 * Returns 0 if "n" is a Fermat Prime, otherwise it returns the lowest
	 * Fermat Witness. Tests values from 2 (inclusive) to "n/3" (exclusive).
	 **/
	public static int FermatPT(int n) {
		return -1;
	}

	/**
	 * Returns the probability that calling a perfect hash function with
	 * "n_samples" (uniformly distributed) will give one collision (i.e. that
	 * two samples result in the same hash) -- where "size" is the number of
	 * different output values the hash function can produce.
	 **/
	public static double HashCP(double n_samples, double size) {
		return -1;
	}

}
