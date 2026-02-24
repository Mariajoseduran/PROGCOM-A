/******************************************************************************
temp=float(input(" Temperatura registrada"))
if temp>=27: print("pongase algo fresco👚")
elif temp>= 20 and temp<=27: print("abrigate")
elif temp>=16 and temp<20: print("abrigte mas")
else: print ("esta helando😬😬")
*******************************************************************************/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    System.out.println("Temperatura resgistrada: ");
		Scanner leer = new Scanner(System.in);
		//nextline es para String
		//nextFloat es para leer decimales 
		float temp = leer.nextFloat();
		// && es and y || es or
		if(temp>=27){System.out.println("pongase algo fresco");}
		else if(temp>= 20 && temp<=27){System.out.println("abrigate");}
		else if (temp>=16 && temp<20){System.out.println("abrigte mas");}
		else {System.out.println("esta helando");}
		
	   // ejercicio easy hand if  
		System.out.println("cual es tu edad ");
		int edad= leer.nextInt();
		System.out.println(edad>=18? "eres mayor de edad": "no eres mayor de edad");
	
	}
}