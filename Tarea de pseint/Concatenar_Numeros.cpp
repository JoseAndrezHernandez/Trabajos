// Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
// Es posible que el codigo generado no sea completamente correcto. Si encuentra
// errores por favor reportelos en el foro (http://pseint.sourceforge.net).

#include<iostream>
#include<sstream>
using namespace std;

// No hay en el C++ estandar una funcion equivalente a "convertiratexto", pero puede programarse una equivalente.
string convertiratexto(float f);

// Para leer variables de texto se utiliza el operador << del objeto cin, que
// lee solo una palabra. Para leer una linea completa (es decir, incluyendo los
// espacios en blanco) se debe utilzar getline (ej, reemplazar cin>>x por
// getline(cin,x)), pero obliga a agregar un cin.ignore() si antes del getline
// se leyó otra variable con >>.

int main() {
	string cadena;
	int num;
	int sw;
	cadena = "";
	cout << "Concatene solo 5 numeros." << endl;
	for (sw=1;sw<=5;sw+=1 paso) {
		cout << "Ingrese un número : ";
		cin >> num;
		if (num>0) {
			cadena = (cadena+convertiratexto(num));
		}
	}
	cout << cadena << endl;
	return 0;
}


string convertiratexto(float f) {
	stringstream ss;
	ss << f;
	return ss.str();
}

