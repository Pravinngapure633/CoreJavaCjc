package For_loop;

public class A_Test1_Even_No {

	public static void main(String[] args) {

		System.out.println("Main-start");

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("No is EVEN :" + i);

			} else {
				//System.out.println("No is NOT Even :" + i);
			}
		}
		System.out.println("Main-end");
	}

}
