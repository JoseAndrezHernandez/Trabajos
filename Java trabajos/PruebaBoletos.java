package pRUEBABoleto;
import java.util.Scanner;

public class PruebaBoletos {

	public static void main(String[] args) {
		double Nsilla=(int)(Math.random()*50+1);
		
		BoletoC boletos = new BoletoC();
		
		Scanner entrada = new Scanner(System.in);
		System.out.print(".....................................");
		System.out.println("");
		System.out.println("Ingrese el nombre de la pelicuala.");
		System.out.println("...................................");
		System.out.println("");

		
		 String elNombreP = entrada.nextLine();
		 
		 
		 
		System.out.print(".....................................");
		System.out.println("");
		System.out.println("Ingrese el nombre del cliente.");
		System.out.println("...................................");
		System.out.println("");
			
		String elNombre=entrada.nextLine();
		
		
	
		
			boletos.establecerrNombre(elNombre);
			boletos.establecerrNombrePelicula(elNombreP);
		
		 
		System.out.print(".....................................");
		System.out.println("");
		System.out.println("");
		System.out.printf("Nombre de la pelicula:      %s%n%n",boletos.ObtenerNombreP());
		System.out.println("");
		System.out.printf("Nombre del cliente:         %s%n%n",boletos.obtenernombre());
		System.out.println("");
		System.out.println("Fecha de la funcion:        24/7/2023");
		System.out.println(""); 
		System.out.println(""); 
		System.out.println("Hora de la funcion:          2:00");
		System.out.println("");
		System.out.println(""); 
		System.out.println("Numero del asiento: ");
		System.out.println("");
		System.out.println( Nsilla=(int)(Math.random()*50+1));
		System.out.println("");
		System.out.println("...................................");
		
		
		
		
	

	}

}
