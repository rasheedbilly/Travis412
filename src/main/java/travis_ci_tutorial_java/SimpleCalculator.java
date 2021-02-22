package travis_ci_tutorial_java;

public class SimpleCalculator {
	public int add(int a, int b) {
		return a + b;
	}

	public int minus(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) throws Exception{
		if(b == 0)
			throw new Exception("Exception message");
		return a / b;
	}
}
