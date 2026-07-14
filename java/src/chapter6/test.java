package chapter6;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
			//객체    //인스턴스화
		Scanner sc = new Scanner(System.in);

		// System.out.print("몇칸짜리로 만드시겠습니까? >> ");
		// int n = Integer.parseInt(sc.nextLine());
		int n = 5;
		int cnt = n * n;
		int[][] array = new int[n][n];

		// 1)
		System.out.println("1)");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = cnt--;
			}
		}
		// printArray(array, n);

		
		  for (int i = 0; i < n; i++) { for (int j = 0; j < n; j++) {
		  System.out.printf("%3d ", array[i][j]); } System.out.println();
		
	}

	// 2)
	System.out.println("\n2)");cnt=1;for(

	int i = 0;i<n;i++)
	{
		for (int j = 0; j < n; j++) {
			array[i][j] = cnt;
			cnt += 2;
		}
	}

	for(
	int i = 0;i<n;i++)
	{
		for (int j = 0; j < n; j++) {
			System.out.printf("%3d ", array[i][j]);
		}
		System.out.println();
	}

	// 3)
	System.out.println("\n3)");

	cnt=n*n;for(
	int i = 0;i<n;i++)
	{
		for (int j = 0; j < n; j++) {
			array[j][i] = cnt--;
		}
	}

	for(
	int i = 0;i<n;i++)
	{
		for (int j = 0; j < n; j++) {
			System.out.printf("%3d ", array[i][j]);
		}
		System.out.println();
	}

	// 4)
	System.out.println("\n4)");cnt=1;for(
	int i = 0;i<n;i++)
	{
		for (int j = 0; j < n; j++) {
			array[j][i] = cnt++;
		}
	}

	for(
	int i = 0;i<n;i++)
	{
		for (int j = 0; j < n; j++) {
			System.out.printf("%3d ", array[i][j]);
		}
		System.out.println();
	}
	// 5)
	System.out.println("\n5)");array=new int[n][n];cnt=1;
	int x = 0, y = 0;
	int roof = 0;

	while(cnt<=n*n)
	{
		// →
		for (int j = roof; j < n - roof; j++) {
			// System.out.println("→ roof : " + roof + " / i : " + roof + " / j : " + j + "
			// / cnt : " + cnt);
			array[roof][j] = cnt++;
		}
		roof++;
		// ↓
		for (int j = roof; j < n - roof + 1; j++) {
			// System.out.println("↓ roof : " + roof + " / i : " + j + " / j : " + (n -
			// roof) + " / cnt : " + cnt);
			array[j][n - roof] = cnt++;
		}
		// ←
		for (int j = n - roof; j >= roof; j--) {
			// System.out.println("← roof : " + roof + " / i : " + (n-roof) + " / j : " +
			// (j) + " / cnt : " + cnt);
			array[n - roof][j - 1] = cnt++;
		}
		// ↑
		for (int j = n - roof - 1; j >= roof; j--) {
			// System.out.println("↑ roof : " + roof + " / i : " + (j) + " / j : " +
			// (roof-1) + " / cnt : " + cnt);
			array[j][roof - 1] = cnt++;
		}

	}

	for(
	int i = 0;i<n;i++)
	{
		for (int j = 0; j < n; j++) {
			System.out.printf("%3d ", array[i][j]);
		}
		System.out.println();
	}

	}

	public static void printArray(int arrayCnt, int[][] myArray) {
		for (int i = 0; i<arrayCnt; i++) {
			for (int j=0; j<arrayCnt; j++) {
				
				System.out.println();
			
				System.out.printf("3d", myArray[i][j]);
				
			}
		}
	}
}