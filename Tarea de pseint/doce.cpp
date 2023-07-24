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
	float i;
	float n;
	float r;
	cout << "Coloque cualquier numero del 1 al 12" << endl;
	cin >> n;
	for (i=0;i<=12;i++) {
		if (n<=1) {
			cout << "Coloque un numero mayor a 0" << endl;
			cin >> n;
		} else {
			r = i*n;
			cout << i << "X" << n << "=" << r << endl;
		}
	}
	return 0;
}

