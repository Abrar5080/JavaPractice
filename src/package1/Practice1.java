package package1;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1");
		int num1 = sc.nextInt();
		System.out.println("Enter number2");
		int num2 = sc.nextInt();

		for (int i = num1; i <= num2; i++) {
			if (i % 2 == 0) {
				System.out.println("EVEN NUMBERS:" + i);
			}

		}



	}

}
