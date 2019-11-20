package fr.diginamic.testexceptions;

public class Operation {
	private double a;
	private double b;
	
	public Operation(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	public static double diviser(double a, double b) {
		if(b==0){
			System.out.println("Il est interdit de diviser par 0");
		}
		return a/b;
	}
	
	public static double diviserRuntime(double a, double b) {
		if(b==0){
			throw new RuntimeException("Il est interdit de diviser par 0");
		}
		return a/b;
	}
}
