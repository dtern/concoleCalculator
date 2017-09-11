package calculator;

public class TestDivide {

	public static void main(String[] args) {

		int x = 9;
		int y = 2;
		
		double z = 9.0;
		double w = 2.0;
		
		System.out.println("Результат обычного деления (int): " + x/y );
		System.out.println("Результат деления с остатком (int): " + x%y );
		System.out.println("Результат обычного деления (double): " + z/w );
		System.out.println("Результат деления с остатком (double): " + z%w );

	}

}
