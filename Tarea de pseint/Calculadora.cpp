// Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
// Es posible que el codigo generado no sea completamente correcto. Si encuentra
// errores por favor reportelos en el foro (http://pseint.sourceforge.net).

#include<iostream>
using namespace std;

// Para leer variables de texto se utiliza el operador << del objeto cin, que
// lee solo una palabra. Para leer una linea completa (es decir, incluyendo los
// espacios en blanco) se debe utilzar getline (ej, reemplazar cin>>x por
// getline(cin,x)), pero obliga a agregar un cin.ignore() si antes del getline
// se ley� otra variable con >>.

int main() {
	int dato;
	float n;
	float r;
	float u;
	cout << "Ingrese dos numeros" << endl;
	cin >> n;
	cout << "Operador algebraico" << endl;
	cin >> dato;
	cout << "Ingrese segundo numero" << endl;
	cin >> u;
	switch (dato) {
	case "x":
		if (dato=="x") {
			r = n*u;
			cout << "Respuesta " << r << endl;
		}
		break;
	case "%":
		if (dato=="%") {
			r = n/u;
			cout << "Respuesta " << r << endl;
		}
		break;
	case "+":
		if (dato=="+") {
			r = n+u;
			cout << "Respuesta " << r << endl;
		}
		break;
	case "-":
		if (dato=="-") {
			r = n-u;
			cout << "Respuesta " << r << endl;
		}
		break;
	}
	return 0;
}

