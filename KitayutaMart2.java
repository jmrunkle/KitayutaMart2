
public class KitayutaMart2 {
	public static int numBought(int K, int T) {
		return 0;
	}

	public static void main(String args[]) {
		// test cases
		//assert numBought(100, 100) == 1;
		System.out.print("numBought(100, 100) - ");
		if (numBought(100, 100) == 1)
			System.out.println("PASS");
		else
			System.out.println("FAIL");

		//assert numBought(100, 300) == 2;
		System.out.print("numBought(100, 300) - ");
		if (numBought(100, 300) == 2)
			System.out.println("PASS");
		else
			System.out.println("FAIL");

		//assert numBought(150, 1050) == 3;
		System.out.print("numBought(150, 1050) - ");
		if (numBought(150, 1050) == 3)
			System.out.println("PASS");
		else
			System.out.println("FAIL");

		//assert numBought(160, 163680) == 10;
		System.out.print("numBought(160, 163680) - ");
		if (numBought(160, 163680) == 10)
			System.out.println("PASS");
		else
			System.out.println("FAIL");
	}
}