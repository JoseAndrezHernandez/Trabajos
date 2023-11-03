package pRUEBAfACTURA;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Factura {

	public static void main(String[] args) {
		System.out.printf("**************************");
		System.out.println("");
		System.out.printf("          Menu");
		System.out.println("");
		System.out.printf("**************************");
		
		 Scanner sn = new Scanner(System.in);
	        boolean salir = false;
	        int opcion; 
	 
	        while (!salir) {
	        	System.out.println("");
	 
	            System.out.println("1 para martillo");
	            
	            System.out.println("2 para tuercas");
	            
	            System.out.println("3 para palas");
	           
	            System.out.println("4. Salir");
	 
	            try {
	 
	                System.out.println("Escribe una de las opciones");
	                opcion = sn.nextInt();
	 
	                switch (opcion) {
	                    case 1:
	                        System.out.println("Ingrese la cantidad de martillos que llevara");
	                        System.out.println("");
	                        System.out.println("Cada martillo cuesta $67");
	                        System.out.println("");
	                        double cantidadArticulos = sn.nextDouble();
	                        double precio=67;
	        
	                        
	                        
	                        
	                        break;
	                    case 2:
	                        System.out.println("Ingrese la cantidad de tuercas que llevara");
	                        System.out.println("");
	                        System.out.println("Cada tuerca cuesta $1");
	                        System.out.println("");
	                         precio =1;
	                        break;
	                    case 3:
	                        System.out.println("Ingrese la cantidad de palas que llevara");
	                        System.out.println("");
	                        System.out.println("Cada pala tiene un precio de $45");
	                        System.out.println("");
	                        precio=45;
	                        
	                        break;
	                    case 4:
	                        salir = true;
	                        break;
	                    default:
	                        System.out.println("Solo números entre 1 y 4");
	                }
	            } catch (InputMismatchException e) {
	                System.out.println("Debes insertar un número");
	                sn.next();
	            }
	        }
	 
	    }
	 
		
		
		

	}


