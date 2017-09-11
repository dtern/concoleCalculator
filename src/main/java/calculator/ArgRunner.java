package calculator;

public class ArgRunner {

	public static void main(String[] args) {
		
		double arg1 = Double.parseDouble(args[0]);
		double arg2 = Double.parseDouble(args[1]);
		
		Calculator calc = new Calculator();
		
		System.out.println("Сумма аргументов: " + calc.summation(arg1, arg2));
		System.out.println("Разница аргументов: " + calc.subtraction(arg1, arg2));
		System.out.println("Произведение аргументов: " + calc.composition(arg1, arg2));
		System.out.println("Деление аргументов: " + calc.division(arg1, arg2));
		System.out.println("Степень: " + calc.exponentiation(arg1, arg2));

	}

}
