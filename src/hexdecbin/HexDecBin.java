package hexdecbin;

import java.util.Scanner;

public class HexDecBin {

	Scanner kbd = new Scanner(System.in);
	String S_base, S_num, E_base;

	int num;

	public void getHexNumber() {

		System.out.println("Welcome to Mitchell's HexDecBin converter!");

		System.out.println("Enter starting base (hex, dec, bin, oct, quat)");

		S_base = kbd.nextLine().toLowerCase();

		System.out.println("enter ending base");

		E_base = kbd.nextLine().toLowerCase();

		System.out.println("enter starting number");

		S_num = kbd.nextLine();

		convert(S_base, S_num, E_base);

	}

	void convert(String S_base, String num, String E_base) {

		if (S_base.equals("hex")) {

			if (E_base.equals("dec")) {
				System.out.println(Integer.parseInt(num, 16));

			} else if (E_base.equals("bin")) {
				String convert = Integer.toString(Integer.parseInt(num, 16));
				System.out.println(Integer.toString(Integer.parseInt(convert), 2));

			} else if (E_base.equals("oct")) {

				String convert = Integer.toString(Integer.parseInt(num, 16));
				System.out.println(Integer.toString(Integer.parseInt(convert), 8));

			} else if (E_base.equals("quat")) {
				int convert = Integer.parseInt(num, 16);
				System.out.println(Integer.toString(convert, 4));
			}

		} else if (S_base.equals("dec")) {

			if (E_base.equals("hex")) {
				System.out.println(Integer.toHexString(Integer.parseInt(num)));

			} else if (E_base.equals("bin")) {
				System.out.println(Integer.toString(Integer.parseInt(num), 2));

			} else if (E_base.equals("oct")) {

				System.out.println(Integer.toString(Integer.parseInt(num), 8));

			} else if (E_base.equals("quat")) {
				System.out.println(Integer.toString(Integer.parseInt(num), 4));
			}

		} else if (S_base.equals("bin")) {

			if (E_base.equals("hex")) {

				String convert = Integer.toString(Integer.parseInt(num, 2));
				System.out.println(Integer.toHexString(Integer.parseInt(convert)));

			} else if (E_base.equals("dec")) {
				System.out.println(Integer.parseInt(num, 2));

			} else if (E_base.equals("oct")) {

				String convert = Integer.toString(Integer.parseInt(num, 2));
				System.out.println(Integer.toString(Integer.parseInt(convert), 8));

			} else if (E_base.equals("quat")) {
				int convert = Integer.parseInt(num, 2);
				System.out.println(Integer.toString(convert, 4));
			}

		} else if (S_base.equals("oct")) {

			if (E_base.equals("hex")) {

				String convert = Integer.toString(Integer.parseInt(num), 8);
				System.out.println(Integer.toHexString(Integer.parseInt(convert)));

			} else if (E_base.equals("dec")) {
				System.out.println(Integer.toString(Integer.parseInt(num), 8));

			} else if (E_base.equals("bin")) {

				String convert = Integer.toString(Integer.parseInt(num), 8);
				System.out.println(Integer.toString(Integer.parseInt(convert), 2));
			}

			else if (E_base.equals("quat")) {

				int convert = Integer.parseInt(num, 8);
				System.out.println(Integer.toString(convert, 4));
			}

		} else if (S_base.equals("quat")) {

			if (E_base.equals("hex")) {

				String convert = Integer.toString(Integer.parseInt(num), 4);
				System.out.println(Integer.toHexString(Integer.parseInt(convert)));

			} else if (E_base.equals("dec")) {
				System.out.println(Integer.toString(Integer.parseInt(num), 4));

			} else if (E_base.equals("bin")) {

				String convert = Integer.toString(Integer.parseInt(num), 4);
				System.out.println(Integer.toString(Integer.parseInt(convert), 2));

			} else if (E_base.equals("oct")) {
				int convert = Integer.parseInt(num, 4);
				System.out.println(Integer.toString(convert, 4));
			}

		} else {
			System.out.println("good job you broke everything, now i gotta exit the program");
			System.exit(0);

		}

	}
}
