package cl.edutecno;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Queue juegos = new LinkedList<>(Arrays.asList("Tombo", "Congelado", "Quemaditas"));
//		juegos.add("Tombo");
//		juegos.add("Congelado");
//		juegos.add("Quemaditas");
		juegos.add("Cachipún");
		juegos.add("Pillarse");
		
		System.out.println(juegos);
		System.out.println("La cantidad de juegos ingresados es: "+juegos.size());
		
	}

}
