package calculator;

public class Calculator {

	// ������������
	public double summation(double var1, double var2){
		return var1 + var2;
	};
	
	
	// ���������
	public double subtraction(double var1, double var2){
		return var1 - var2;
	};
	
	
	// ������������
	public double composition(double var1, double var2){
		return var1 * var2;
	};
	
	
	// �������
	public double division(double var1, double var2){
		if (var2 != 0) {
			return var1/var2;
		}
		else {
			System.out.println("������, �� ���� ������ ������. �� ���� ���������, �� �����");
			throw new ArithmeticException("Not finite");
		}
	};
	
	
	// ���������� � �������
	public double exponentiation(double var1, double var2){
		return Math.pow(var1, var2);
	};	

}
