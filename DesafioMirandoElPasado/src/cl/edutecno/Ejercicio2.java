package cl.edutecno;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Set <String> invitados = new TreeSet <String> (Arrays.asList("Daniel", "Paola", "Facundo","Pedro", "Jacinta", "Florencia", "Juan Pablo"));
	System.out.println(invitados);

	Set <String> posiblesInvitados = new HashSet <String> (Arrays.asList("Jorge", "Francisco","Marcos"));
	invitados.addAll(posiblesInvitados);
//	System.out.println(posiblesInvitados);
	System.out.println(invitados);
	
	invitados.remove("Jorge");
	System.out.println(invitados);
	}

}
