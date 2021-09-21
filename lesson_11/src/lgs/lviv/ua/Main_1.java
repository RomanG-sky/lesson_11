package lgs.lviv.ua;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * Class description goes here.
 *
 * @version 1.0 18 Sep 2021
 * @author Roman G-sky
 */
public class Main_1 {

	public static void main(String[] args) {

		Random rd = new Random();
		Integer[] arr = new Integer[100];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt();
			System.out.println("Array without ToString : " + arr[i]); //different type of output array
		}
		
		System.out.println("\nArray before sorting : " + Arrays.deepToString(arr));

		Arrays.sort(arr);
		System.out.println("\nSorted array acs : " + Arrays.toString(arr));

		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("\nSorted array acs : " + Arrays.toString(arr));
	}
}
