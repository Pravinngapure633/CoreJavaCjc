package For_loop;

public class B_Task1 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {

			for (int j = i; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 4; i > 0; i--) {
			for (int j = i; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
