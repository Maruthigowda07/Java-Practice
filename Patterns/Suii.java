package Trainglepatt;

public class Suii {

	public static void main(String[] args) {


				for (int i = 0; i <= 6; i++) {
					for (int j = 0; j <= 7 - i; j++)
						System.out.print(" ");

					for (int j = 0; j <= i; j++)
						System.out.print("* ");

					for (int j = 0; j <= 6 - 2 * i; j++)
						System.out.print(" ");

					for (int j = 0; j <= i; j++)
						System.out.print("* ");

					System.out.println();
				}

				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < i + 1; j++)
						System.out.print(" ");

					if (i == 2)
						System.out.print("SNEHA");
					else {
						for (int j = 0; j < (15 - 2 * i); j++)
							System.out.print("* ");
					}

					System.out.println();
				}
			}
		}
	
