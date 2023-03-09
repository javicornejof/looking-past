package cl.edutecno;

import java.util.Map;
import java.util.TreeMap;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Map<String, Integer> golosinas = new TreeMap<String, Integer> ();
		golosinas.put("Chocman", 100);
		golosinas.put("Trulul�", 100);
		golosinas.put("Centella", 100);
		golosinas.put("kilate", 50);
		golosinas.put("Miti-miti", 30);
		golosinas.put("Traga Traga", 150);
		golosinas.put("Tablet�n", 5);

		System.out.println(golosinas+"\n");
		
		System.out.println("Las golosinas que val�an menos de $100 eran:");
		golosinas.entrySet().stream().filter(precio -> precio.getValue()<100).forEach(System.out :: println);
//		entrySet convertimos en dato Set
//		filter filtrado (dentro cada elemento precio se obtiene el valor menor a 100)
//		filtrado nos permite encontrar algo. 
//		forEach para cada elemento imprimelo (s�lo los bajo 100) s�lo itera sobre lo que filtr�, no almacena en nueva lista
		
		
		
	}

}
