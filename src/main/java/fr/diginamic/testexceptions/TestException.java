package fr.diginamic.testexceptions;

public class TestException {

	public static void main(String[] args) {
		System.out.println(Operation.diviser(2., 4.));
		System.out.println(Operation.diviser(2.,0));
	}
}
