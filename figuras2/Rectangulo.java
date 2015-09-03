package ar.edu.unlam.tallerweb.figuras;

public class Rectangulo {
	int lado1;
	int lado2;
	void ingresarLados(Rectangulo rectangulo,int a, int b){
		rectangulo.lado1=a;
		rectangulo.lado2=b;
	}
	int calcularPerimetro(Rectangulo rectangulo) {
		int perimetro;
		perimetro=(rectangulo.lado1*2)+(rectangulo.lado2*2);
		return perimetro;
	}
	
	int calcularArea(Rectangulo rectangulo){
		int area;
		area=rectangulo.lado1*rectangulo.lado2;
		return area;
	}
}
