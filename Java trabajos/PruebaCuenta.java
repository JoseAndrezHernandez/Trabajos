package ej_cap3;
import java.util.Scanner;

public class PruebaCuenta {

	public static void main(String[] args) {
		
	Cuenta cuenta1 = new Cuenta("Janne Green",50.00);
	Cuenta cuenta2= new Cuenta("Jhon Blue",-7.53);
	
	System.out.printf("Saldo de:%s%n", cuenta1.obtenerNombre(),cuenta1.obtenerSaldo());
	System.out.printf("Saldo de:%s%n", cuenta2.obtenerNombre(),cuenta2.obtenerSaldo());
	
	Scanner entrada = new Scanner(System.in);
	System.out.print("Escriba el monto a depositar en la cuenta 1:");
	double montoDeposito = entrada.nextDouble();
	System.out.printf("%nsumando %.2f al saldo de cuenta1%n%n",montoDeposito);

	
	cuenta1.depositar(montoDeposito);
	
	System.out.printf("Saldo de %s:$%.2f%n",cuenta1.obtenerNombre(),cuenta1.obtenerSaldo());
	System.out.printf("Saldo de %s:$%.2f%n",cuenta2.obtenerNombre(),cuenta2.obtenerSaldo());
	
	System.out.print("Escriba el monto a depositar en cuenta 2:");
	montoDeposito = entrada.nextDouble();
	System.out.printf("%nsumando %.2f al saldo de cuenta2%n%n",montoDeposito);
	
	cuenta2.depositar(montoDeposito);
	
	System.out.printf("Salso es de %s: $%.2f%n",cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
	System.out.printf("Salso es de %s: $%.2f%n",cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
	
	
	System.out.print("Escriba el monto a retirar en la cuenta 1:");
	double retirarDeposito = entrada.nextDouble();
	System.out.printf("%nrestandoo %.2f al saldo de cuenta1%n%n",retirarDeposito);
	
	
	cuenta1.retirar(retirarDeposito);
	
		
	
	System.out.printf("Saldo de %s:$%.2f%n",cuenta1.obtenerNombre(),cuenta1.obtenerSaldo());
	System.out.printf("Saldo de %s:$%.2f%n",cuenta2.obtenerNombre(),cuenta2.obtenerSaldo());
	
	System.out.print("Escriba el monto a retirar en cuenta 2:");
	retirarDeposito = entrada.nextDouble();
	System.out.printf("%restando %.2f al saldo de cuenta2%n%n",retirarDeposito);
	
	cuenta2.retirar(retirarDeposito);
	
	System.out.printf("Salso de %s:$%.2f%n",cuenta1.obtenerNombre(),cuenta1.obtenerSaldo());
	System.out.printf("Salso de %s:$%.2f%n",cuenta2.obtenerNombre(),cuenta2.obtenerSaldo());
	
	
	
	

	}

}
