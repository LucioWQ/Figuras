package ar.edu.unlam.tallerweb.figuras;

public class Cuadrado {
	int lado;
    int calcularArea(Cuadrado cuadrado)
    {
    	int area;
    	area=cuadrado.lado*cuadrado.lado;
    	return area;
    	
    }
   void ingresarLado(Cuadrado cuadrado,int a)
   {
	 cuadrado.lado=a;  

	   
   }
   
   
	
	


}