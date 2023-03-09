package cl.edutecno;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList <String> marcas = new ArrayList <String>();
		marcas.add("nickelodeon");
		marcas.add("sapito");
		marcas.add("calaf");
		marcas.add("telefonica");
		marcas.add("feriamix");
		marcas.add("mekano");
		marcas.add("MSN");
		marcas.add("kodak");
		marcas.add("ZooloTV");
		marcas.add("Polaroid");
		
		System.out.println(marcas);
		
		marcas.add("Blokbaster");
		marcas.add("Carrefour");
		marcas.add("Jetix");
		
		System.out.println(marcas);
		
		marcas.set(10, "Blockbuster");
		System.out.println(marcas);
		
		System.out.println(marcas.remove("Carrefour"));
		
		ArrayList<String> posiblesMarcas = new ArrayList<String>(Arrays.asList("Telmex","Mimbo", "lala", "Televisa"));
		marcas.addAll(posiblesMarcas);
		System.out.println(marcas);
		
		System.out.println(marcas.size());
		
		
		//ArrayList <String> marcas = new ArrayList <String>();
		
		
	}

}
