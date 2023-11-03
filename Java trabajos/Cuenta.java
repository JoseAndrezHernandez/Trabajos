package ej_cap3;

public class Cuenta {

	private String Nombre;
	private double Saldo;
	
	
	public Cuenta(String Nombre, double Saldo) {
		this.Nombre = Nombre;
		
		if(Saldo>0.0)
			this.Saldo=Saldo;
		
	}
	
	public void depositar(double montoDeposito)
	{
		if(montoDeposito>0.0)
			Saldo=Saldo+montoDeposito;
		
	}
	
	public void retirar(double retirarDeposito)
	{
		
		if(retirarDeposito>Saldo) {
			System.out.print("");
			System.out.printf("No se puede hacer esta accion");
		}else {
			Saldo=Saldo-retirarDeposito;
		}
			
		
	}

	
	public double obtenerSaldo() 
	{
		
		return Saldo;
	}
	
	public void EstablecerNombre(String Nombre) {
		this.Nombre = Nombre;
	}
	
	
	public String obtenerNombre() {
		return Nombre;
	}
	
}
