package ar.edu.unlam.tallerweb.figuras;

import org.junit.Test;

public class PruebaCuadrado {
         @Test
         public void testCuadrado(){
        	 
        	 Cuadrado cuadrado= new Cuadrado();
        	 int resultado;
        	 cuadrado.ingresarLado(cuadrado,14);
        	 resultado=cuadrado.calcularArea(cuadrado);
        	 System.out.println(resultado);
         }
         
}
