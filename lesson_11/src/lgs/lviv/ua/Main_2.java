package lgs.lviv.ua;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 * Class description goes here.
 *
 * @version 1.0 18 Sep 2021
 * @author Roman G-sky
 */

public class Main_2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); // new intup scaner
		typeOfMaterials[] TypeOfMaterials = typeOfMaterials.values();// array of enum

		while (true) { // menu

			System.out.println("Push 1 to outtup toString elements of array AUTO ");
			System.out.println("Push 2 to fill same elements of array AUTO");

			switch (scan.next())

			{ 

			case "1": { // menu 1 
				Auto[][] arrauto = new Auto[getRanndomfromRange(2, 6)][getRanndomfromRange(2, 6)]; //2-k array  auto with random parameters from range (2 to 6)
				for (int i = 0; i < arrauto.length; i++) {
					for (int j = 0; j < arrauto[i].length; j++) {
						arrauto[i][j] = new Auto(getRanndomfromRange(50, 200), getRanndomfromRange(1990, 2021), //array auto with random parameters from range
								new Engine(getRanndomfromRange(2, 6)),
								new Helm(getRanndomfromRange(30, 50),
										TypeOfMaterials[getRanndomfromRange(0, TypeOfMaterials.length - 1)]
												.toString()));
					}
				}

				System.out.println(Arrays.deepToString(arrauto));

			}
				break;

			case "2": { //menu 2
				int horses, year, cycinders, diameter; // variables of auto
				String materiali;// variables of auto
				System.out.println("Intup power of your car in range of 50 tо 200");
				Scanner scan1 = new Scanner(System.in); //scaners of each parameters
				horses = scan1.nextInt();
				if (horses <= 200 && horses >= 50) {  //range of parameters
					System.out.println("Power of your auto is : " + horses + " horse.");

				} else {
					throw new IllegalArgumentException("Power of your car is out of range");
				}

				System.out.println("Intup year of issue of your car in range of 2000 tо 2021");
				Scanner scan2 = new Scanner(System.in);
				year = scan2.nextInt();
				{
					if (year <= 2021 && year >= 2000) {
						System.out.println("Your car produce in : " + year + " year.");
					} else {
						throw new IllegalArgumentException("Year of issue of your car is out of range");
					}
				}
				System.out.println("Intup quantity of cylinders of your car in range of 4 tо 10");
				Scanner scan3 = new Scanner(System.in);
				cycinders = scan3.nextInt();
				{
					if (cycinders <= 12 && cycinders >= 4) {
						System.out.println("Your car has : " + cycinders + " cycinders.");
					} else {
						throw new IllegalArgumentException("Year of issue of your car is out of range");
					}
				}
				System.out.println("Intup helm diametr of of your car in range of 30 tо 50");
				Scanner scan4 = new Scanner(System.in);
				diameter = scan4.nextInt();
				{
					if (diameter <= 50 && diameter >= 30) {
						System.out.println("Helm of your car is  : " + diameter + ".");
					} else {
						throw new IllegalArgumentException("Helm diameter of your car is out of range");
					}
					System.out.println("Choose type of material " + Arrays.deepToString(TypeOfMaterials));
					Scanner scan5 = new Scanner(System.in);
					materiali = scan5.next().toLowerCase();
					TypeOfMaterials.equals(materiali);

					boolean flag = false;

					flag = true;
					{
						if (flag) {
							System.out.println("Material of your helm is :" + materiali + ".");
						} else {
							throw new IllegalArgumentException("Wrong type of materials");
						}

						Auto auto = new Auto(horses, year, new Engine(cycinders), new Helm(diameter, materiali));
						System.out.println("Congrats you create a car with parameters :" + auto);
						Auto autoArray[] = new Auto[getRanndomfromRange(2, 7)];
						Arrays.fill(autoArray, auto);
						System.out.println(Arrays.deepToString(autoArray));
					}
				}
			}
			}
		}
	}

	public static int getRanndomfromRange(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("Min value bigger than max value, fix it");
		}
		Random rd = new Random();
		return rd.nextInt(max - min + 1) + min;

	}
}
