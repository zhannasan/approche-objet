package fr.diginamic.testexceptions;

public class TestRuntimeException {

	public static void main(String[] args) {
		System.out.println(Operation.diviserRuntime(2., 4.));
		try{
			System.out.println(Operation.diviserRuntime(2.,0));
		}catch(RuntimeException e){
			System.out.println("Il est interdit de diviser par 0");
		}
	}

}
