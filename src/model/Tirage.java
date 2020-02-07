package model;

import java.util.Random;
import java.util.Vector;

public class Tirage {
	Random random;
	Vector<Integer> list;
	int complementaire;

	public Tirage() {
		this.list = new Vector<Integer>();
		this.random = new Random();
		this.complementaire = 0; 
		tirerBoules();
		tirerComplemetaire();
	}

	public Vector<Integer> getList() {
		return list;
	}

	public Random getRandom() {
		return random;
	}
	
	public int getComplementaire() {
		return complementaire;
	}

	public void tirerBoules() {

		while (list.size() < 5) {
			int rand = 1 + getRandom().nextInt(50);

			boolean exe = exist(list, rand);

			if (exe == false) {
				list.add(rand);
			}
		}
	}

	public int tirerComplemetaire() {
		return complementaire = 1 + getRandom().nextInt(10);
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



	public String listToString() {

		String res = null;

		for (Integer number : list) {
			System.out.println(list.get(number));
		}
		return res;
	}
	
	@Override
	public String toString() {
		return listToString() + " " + getComplementaire();
	}

}
