package Zadatak3;

import java.util.Scanner;

public class MyArrayTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[10];
		System.out.println("Unesite niz cijelih brojeva (10 brojeva): ");
		for (int i = 0; i < 10; i++) {
			array[i] = input.nextInt();
		}
		MyArray arr = new MyArray(array);
		System.out.println("Smallest element in the array is: " + arr.getSmallestElement());
		System.out.println("Largest element in the array is: " + arr.getLargestElement());
		System.out.println("Sum of all elements in the array is: " + arr.sumAllElements());
		System.out.println("All elements: ");
		arr.printAllElements();

		input.close();

	}

}
