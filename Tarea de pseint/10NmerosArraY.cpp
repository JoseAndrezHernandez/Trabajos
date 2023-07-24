// Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
// Es posible que el codigo generado no sea completamente correcto. Si encuentra
// errores por favor reportelos en el foro (http://pseint.sourceforge.net).

#include<iostream>
using namespace std;

// Para leer variables de texto se utiliza el operador << del objeto cin, que
// lee solo una palabra. Para leer una linea completa (es decir, incluyendo los
// espacios en blanco) se debe utilzar getline (ej, reemplazar cin>>x por
// getline(cin,x)), pero obliga a agregar un cin.ignore() si antes del getline
// se leyó otra variable con >>.

int main() {
	float b;
	float c;
	float dato[10];
	float e;
	float m;
	int x;
	c = 0;
	b = 0;
	e = 0;
	cout << "Introdusca dies numeros." << endl;
	for (x=1;x<=10;x++) {
		cin >> dato[x-1];
		if (dato[x-1]<0) {
			c = c+1;
		}
		if (dato[x-1]==0) {
			b = b+1;
		}
		if (dato[x-1]>0) {
			e = e+1;
		}
	}
	cout << c << " Cantidad de numeros negativos" << endl;
	cout << b << " Cantidad de numeros nulos" << endl;
	cout << e << " Cantidad de numeros positivos" << endl;
	return 0;
}

