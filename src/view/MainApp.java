package view;

import model.Tirage;

public class MainApp {

	public static void main(String[] args) {
		
		Tirage loto = new Tirage();
		System.out.println(loto.getList()+ " " + loto.getComplementaire());

	}

}
