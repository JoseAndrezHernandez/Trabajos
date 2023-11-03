package pRUEBAfACTURA;

public class CantidadYsuma {
	
	double precio;
	int Cantidad;
	double Saldo;
	
	public CantidadYsuma (double precio, double Saldo) {
		if(Saldo<0) {
			Saldo=0.0;
			}else{
				Saldo=precio*Cantidad;
			}
		}
	
	public void cantidad(int cantidadArticulos ) {
		this.Cantidad=cantidadArticulos;
		
		Saldo=precio*cantidadArticulos;
	}
	
	public void precio(double PrecioArticulo) {
		
	}
		
	}
	
	


