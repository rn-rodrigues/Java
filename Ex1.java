/* A = π r² - circulo
   A = b.h - retangulo
   A= (b.a) / 2 - triangulo retangulo
   formula de heron para encontrar a area sabendo somente os lados

	p = (l1+l2+l3)/2		
	a = raiz(p(p-l1)(p-l2)(p-l3)	
*/	

import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.*;

public class Ex1 {
	
	private static void calcula (float r) {			//circulo
		float a = (float) (Math.PI*Math.pow(r,2));
		System.out.println("A Área do circulo é: "+a+" unidade(s) de área"); 				
	}
	private static void calcula (float b, float h) { 	//retangulo
		float a = b*h;
		System.out.println("A Área do retângulo é: "+a+" unidade(s) de área");	
	}
	private static void calcula (float l1, float l2, float l3) {		//triangulo
		float p = (l1+l2+l3)/2;
		float a =  (float) (Math.sqrt(p*(p-l1)*(p-l2)*(p-l3)));
		System.out.println("A Área do triângulo é: "+a+" unidade(s) de área");
	}

	public static void main (String[] args) {
		if (args.length == 1) {
			calcula(Float.valueOf(args[0]).floatValue());
		}
		else if (args.length == 2) {
			calcula(Float.valueOf(args[0]).floatValue(), Float.valueOf(args[1]).floatValue());			
		}
		else if (args.length == 3) {
			calcula(Float.valueOf(args[0]).floatValue(), Float.valueOf(args[1]).floatValue(), Float.valueOf(args[2]).floatValue());
		}
				
	}
}


