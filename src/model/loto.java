package model;

import java.util.Random;
import java.util.Vector;

public class loto {

	public static void main(String[] args) {

		Random random = new Random();
		Vector<Integer> list = new Vector<Integer>();

		int random1 = 0;

		while (list.size() < 5) {

			random1 = 1 + random.nextInt(50);

			boolean exe = exist(list, random1);
			// System.out.println(exe);

			if (exe == false) {
				list.add(random1);
			}
		}

		int complementaire = 1 + random.nextInt(10);
		
		System.out.println("les numeros du tirage sont : " + list + "\net le numero complementaire : " + complementaire);
	}

	public static boolean exist(Vector<Integer> list, int random) {

		boolean exist = false;
		for (int index = 0; index < list.size(); index++) {
			if (list.get(index) == random) {
				exist = true;
				break;
			} else
				exist = false;
		}
		return exist;
	}
	
}
