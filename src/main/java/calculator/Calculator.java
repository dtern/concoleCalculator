package calculator;

public class Calculator {

	// Суммирование
	public double summation(double var1, double var2){
		return var1 + var2;
	};
	
	
	// Вычитание
	public double subtraction(double var1, double var2){
		return var1 - var2;
	};
	
	
	// Произведение
	public double composition(double var1, double var2){
		return var1 * var2;
	};
	
	
	// Деление
	public double division(double var1, double var2){
		if (var2 != 0) {
			return var1/var2;
		}
		else {
			System.out.println("Ошбика, на ноль делить нельзя. Но если осторожно, то можно");
			throw new ArithmeticException("Not finite");
		}
	};
	
	
	// Возведение в степень
	public double exponentiation(double var1, double var2){
		return Math.pow(var1, var2);
	};	

}
