package fr.diginamic.operations;

public class Operations {

	public static double calcul(double a, double b, char c){
		double out = 0;
		if (c=='+'){
			out = a+b;
		}else if(c=='-'){
			out = a-b;
		}else if(c=='*'){
			out = a*b;
		}else if(c=='/'){
			out = a/b;
		}
		return out;
	}
}
