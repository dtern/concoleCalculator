package calculator;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InteractRunner {

	// Objects
	Scanner scan = new Scanner(System.in);
	Calculator calc = new Calculator();
	
	// Parametrs
	int action = 0;
	double result = 0;
	double arg1 = 0;
	double arg2 = 0;
	
	// Settings
	boolean useResult = false;
	boolean exit = false;
	
	
	
	public static void main(String[] args) {		
		InteractRunner runner = new InteractRunner();
		runner.start();
	}	

	
	private void start() {
		while (exit == false) {
			
			// Выводим варианты выбор на экран
			addSeparator();
			System.out.println("Выберите операцию, которую вы хотите совершить:");
			System.out.println(" ");
			System.out.println("   1. Суммирование");
			System.out.println("   2. Вычитание");
			System.out.println("   3. Умножение");
			System.out.println("   4. Деление");
			System.out.println("   5. Возведение в степень");
			System.out.println("   6. Выбрать первым аргументом результат предыдущего вычисления (если есть)");
			System.out.println("   7. Очистить аргументы (сделать дефолтными)");
			System.out.println("   8. Показать текущие значения аргументов");
			System.out.println("   9. Ввести аргументы");
			System.out.println("   10. Выйти из калькулятора");
			System.out.println(" ");
			
				try {
					System.out.print("Введите число варианта: ");
					if (!scan.hasNextInt()) {
						scan.nextInt();
						continue;
					}
					else {
						action = scan.nextInt();
					}
				} catch (InputMismatchException e) {
					System.out.println("Неправильный выбор пункта");
					scan.next();
				}


			
			switch (action) {
			    case 0:  System.out.println("Вы не выбрали пункт меню");
			             break;
			    
		        case 1:  System.out.println("(Вы выбрали суммирование) ");
		        		 if (useResult == false) {
		        		   if (arg1 == 0 || arg2 == 0) {
		        			   enterArgs();
		        		   }
		        		 } else {
		        			 if (arg2 == 0) {
		        				 enterArg(); 
		        			 }
		        		 }

		        		 System.out.println("Результат: " + calc.summation(arg1, arg2));
		        		 result = calc.summation(arg1, arg2);
		                 break;
		                 
		        case 2:  System.out.println("(Вы выбрали вычитание) ");
				         System.out.println("Результат: " + calc.subtraction(arg1, arg2));
				         result = calc.subtraction(arg1, arg2);
		                 break;
		                 
		        case 3:  System.out.println("(Вы выбрали умножение) ");	
				         System.out.println("Результат: " + calc.composition(arg1, arg2));
				         result = calc.composition(arg1, arg2);
		                 break;
		                 
		        case 4:  System.out.println("(Вы выбрали деление) ");	
				         System.out.println("Результат: " + calc.division(arg1, arg2));
				         result = calc.composition(arg1, arg2);
		                 break;
		                 
		        case 5:  System.out.println("(Вы выбрали возведение в степень) ");	
				         System.out.println("Результат: " + calc.exponentiation(arg1, arg2));
				         result = calc.exponentiation(arg1, arg2);
		                 break;
		                 
		        case 6:  System.out.println("Вы выбрали первым аргументом полученный ранее результат. ");
		                 if (result != 0){
		                      arg1 = result;
		 	                  System.out.println("Первому аргументу присвоено значение: " + result);
		                 } else {
		                	 System.out.print("Предыдущего результата еще нет. Первый аргумент не перезаписан");
		                 }
	                     break;
	                     
		        case 7:  System.out.println("Вы выбрали 'Очистить аргументы - вернуть введенный в консоль аргументы'");	
		        	     arg1 = 0;
		        		 arg2 = 0;
		        		 result = 0;
		        		 useResult = false;
	                     break;
	                     
		        case 8:  System.out.println("Текущие значения аргументов:");
		                 System.out.println("1: " + arg1);
		                 System.out.println("2: " + arg2);
	                     break;
	                     
		        case 9:  enterArgs();
                         break;
                         
		       case 10:  exit = true;
                         break;                  

		       
		       default:  System.out.println("(Вы выбрали некорректный пункт меню)");
		                 break;
	        }
		}
		
	}


	// Вводим один агрумент
    public void enterArg() {
    	System.out.print("");
    	System.out.print("Введите второй аргумент: ");
    	arg2 = getDoubleArgs(); //scan.nextDouble();
    	System.out.print("");
    };
    
    
    
    // Вводим два агрумент
    public void enterArgs() {
    	System.out.print("");
    	System.out.print("Введите первый аргумент: ");
    	arg1 = getDoubleArgs(); // scan.nextDouble();
    	System.out.print("Введите второй аргумент: ");
    	arg2 = getDoubleArgs(); // scan.nextDouble();
    	System.out.print("");
    };
    
    
    
    // Очистка экрана
    public void addSeparator() {
    	System.out.println("-");
    };
    
    
    public double getDoubleArgs() {
    	double arg = 0;
    	boolean rightChoice = false;
    	
    	while (rightChoice == false) {
			if (!scan.hasNextDouble()) {
				scan.next();
				System.out.println("Введите аргумент в правильном формате: ");
			}
			else {
				arg = scan.nextDouble();
				// System.out.println("(Введенно правильно: " + arg + ") ");
				rightChoice = true;
			}
    	}
    	return arg;
    }
    
}
