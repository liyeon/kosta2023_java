package day4_0303;

class Calculator {
	int x, y;

	int add() {
		return x + y;
	}// add

	int sub() {
		return x - y;
	}// sub

	int mul() {
		return x * y;
	}// mul
	
	static int add(int x, int y) {
		return x+y;
	}//static add
	
	static int sub(int x, int y) {
		return x-y;
	}//static sub
	
	static int mul(int x, int y) {
		return x*y;
	}//static mul
}// class Calculator

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.x = 10;
		calc.y = 20;

		System.out.println(calc.add());
		System.out.println(calc.sub());
		System.out.println(calc.mul());
		
		System.out.println(Calculator.add(20, 10));
		System.out.println(Calculator.sub(200, 100));
		System.out.println(Calculator.mul(3, 5));
	}// main

}// 계산기