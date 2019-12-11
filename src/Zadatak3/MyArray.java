package Zadatak3;

public class MyArray {
	public int[] array;

	MyArray() {

	}

	MyArray(int[] array) {
		this.array = array;
	}

	// geteri
	public int getSmallestElement() {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (min > array[i])
				min = array[i];
		}
		return min;

	}

	public int getLargestElement() {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max < array[i])
				max = array[i];
		}
		return max;
	}

	public int sumAllElements() {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		return suma;
	}

	public void printAllElements() {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
	}
}
