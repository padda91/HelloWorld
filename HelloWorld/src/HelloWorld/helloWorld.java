package HelloWorld;

import java.util.Scanner;

public class helloWorld {

	public static void main(String[] args) {
		int i;

		Scanner s = new Scanner(System.in);

		System.out.println("Bist du Volljährig?");
		System.out.println("Tippe dein Alter ein");
		i = s.nextInt();
		if (i < 18) {
			System.out.println("leider bist du nicht volljährig");
		} else {

			System.out.println("Hello World");
		}
	}

}
