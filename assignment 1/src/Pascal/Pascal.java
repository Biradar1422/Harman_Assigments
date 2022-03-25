package q4;

import java.util.Scanner;


public class Pascal {
	public static void main(String args[]) {// opening of main
		Scanner sc = new Scanner(System.in);
		int n, i, j, a[][];
		
		System.out.println("How many steps...?");
		n = sc.nextInt();
		a = new int[n][n];
		
		for (i = 0; i < n; i++) {
			for (j = 0; j <= i; j++)
				if (j == 0 || j == i)
					a[i][j] = 1;
				else
					a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
		}
		// displaying the Pascal's Triangle as the output.
		System.out.println("\nOUTPUT:\n");
		for (i = 0; i < n; i++) {
			for (j = 0; j <= i; j++)
				System.out.print(a[i][j] + "\t");

			System.out.println();
		}
	}// clossing of main
}
