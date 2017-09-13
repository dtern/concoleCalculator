package calculator;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
* Класс InteractRunner предназначен для предоставления пользователю
* меню с выбором действий для последующего выполнения арифметических
* действий при помощи калькулятора
* 
* @author Ternov
* @since 2017.09.13
* @version 3.0
* <br>
* <b>В методах:</b><br>
*  (scan) объект сканнера;<br>
*  (calc) объект калькулятора;<br>
*  (menuBuilder) билдер меню пользователя;<br>
*  (resultBuilder) билдер для формирования строк результатов;<br>
*/
public class InteractRunner {

	final Scanner scan = new Scanner(System.in);
	final Calculator calc = new Calculator();
	final StringBuilder menuBuilder = new StringBuilder();
	final StringBuilder resultBuilder = new StringBuilder();
	
	int action = 0;
	double result = 0;
	double arg1 = 0;
	double arg2 = 0;
	
	boolean useResult = false;
	boolean exit = false;

	
	
	public static void main(String[] args) {		
		InteractRunner runner = new InteractRunner();
		runner.start();
	}	

	
	
	/**
	* Метод createMenu() предназначен для создания пользовательского меню в виде
	* объекта StringBuilder. Это было сделано для того, чтобы иметь возможность
	* менять строки меню в одном месте с удобным форматированием.
	* 
	* Заполнение строк меню по мере необходимости, не забывая после добавления
	* пункта меню - создать его релизацию в соответствующем методе обработки
	* выбор пользователя.
	*/
	public void createMenu() {
		this.menuBuilder.append("Выберите операцию, которую вы хотите совершить:\n\n");
		this.menuBuilder.append("   1. Сложение\n");
		this.menuBuilder.append("   2. Вычитание\n");
		this.menuBuilder.append("   3. Умножение\n");
		this.menuBuilder.append("   4. Деление\n");
		this.menuBuilder.append("   5. Возведение в степень\n");
		this.menuBuilder.append("   6. Включить/Выключить использование результата в качестве первого аргумента\n");
		this.menuBuilder.append("   7. Очистить все аргументы и параметры программы\n");
		this.menuBuilder.append("   8. Показать текущие значения аргументов\n");
		this.menuBuilder.append("   9. Ввести аргументы\n");
		this.menuBuilder.append("   10. Выйти из калькулятора\n\n");
	}
	
	
	
	
	
	/**
	* Метод start() является композитным и состоит из несколиких этапов работы программы:
	* <br>
	* #1 Создание стартового меню<br>
	* #2 Основной цикл работы программы (проверка продолжать или завершить программу) <br>
	* #3 Выбор варианта действия в пользовательском меню, и запуск действия<br>
	*/
	public void start() {
		
		// #1
		createMenu();			
		
		// #2
		while (exit == false) {			

			addSeparator();
			System.out.print(menuBuilder.toString());
			
			// #3
			try {
				System.out.print("Введите число варианта: ");
				if (!scan.hasNextInt()) {
					scan.nextInt();
					continue;
				} else {
					this.action = scan.nextInt();
					this.goAction(this.action);
					
				}
			} catch (InputMismatchException e) {
				    e.printStackTrace();
					System.out.println("Неправильный выбор пункта");
					scan.next();
			}       
		}
		System.out.println("Программа завершена");
	}


	
	
	/**
	* Метод goAction(int action) выполняет арифметическое действие над аргументами,
	* или другое действие, которое соответствует конкретному выбору из меню пользователя.
	* 
	* @param action - Выбор пользователя
	*/
	public void goAction(int action) {
		
		switch (action) {
		
			case 0:  System.out.println("Вы не выбрали пункт меню");
					 break;
					    
			case 1:  System.out.println("(Вы выбрали суммирование) ");
			         this.entersArguments();
			         resultBuilder.append("Результат: ").append(calc.summation(arg1, arg2));
					 System.out.println(resultBuilder.toString());
				     resultBuilder.delete(0, resultBuilder.length()); 
				     result = calc.summation(arg1, arg2);
				     break;
				     
			case 2:  System.out.println("(Вы выбрали вычитание) ");
			         this.entersArguments();
			         resultBuilder.append("Результат: ").append(calc.subtraction(arg1, arg2));
			         System.out.println(resultBuilder.toString());
		             resultBuilder.delete(0, resultBuilder.length()); 
		             result = calc.subtraction(arg1, arg2);
		             break;
				                
				                 
			case 3:  System.out.println("(Вы выбрали умножение) ");
			         this.entersArguments();
			         resultBuilder.append("Результат: ").append(calc.composition(arg1, arg2));
			         System.out.println(resultBuilder.toString());
		             resultBuilder.delete(0, resultBuilder.length()); 
					 result = calc.composition(arg1, arg2);
				     break;
				                 
				                 
			case 4:  System.out.println("(Вы выбрали деление) ");
	                 this.entersArguments();
	                 resultBuilder.append("Результат: ").append(calc.division(arg1, arg2));
	                 System.out.println(resultBuilder.toString());
                     resultBuilder.delete(0, resultBuilder.length()); 
					 result = calc.division(arg1, arg2);
				     break;
				                 
				                 
			case 5:  System.out.println("(Вы выбрали возведение в степень) ");
	                 this.entersArguments();
			         resultBuilder.append("Результат: ").append(calc.exponentiation(arg1, arg2));
                     System.out.println(resultBuilder.toString());
                     resultBuilder.delete(0, resultBuilder.length()); 
					 result = calc.exponentiation(arg1, arg2);
				     break;
				                 
				                 
			case 6:  System.out.println("Вы выбрали установку полученного ранее результата в качестве первого аргумента ");
				     if (this.useResult) {
				    	 this.useResult = false;
				    	 System.out.printf("Текущий флаг отключен: %s", useResult);
				     } else {
				    	 this.useResult = true;
				    	 System.out.printf("Текущий флаг включен: %s", useResult);
				     }
			         break;
			                     
			                     
			case 7:  System.out.println("Вы выбрали 'Очистить все аргументы и параметры программы'\n");	
				     arg1 = 0;
				     arg2 = 0;
				     result = 0;
				     useResult = false;
			         break;
			                     
			                     
			case 8:  System.out.printf("Текущие значения аргументов: 1: %s  2: %s  Result: %s\n", arg1, arg2, result);
			         break;
			                     
			                     
			case 9:  arg1 = getEnterArg("первый аргумент");
		 			 arg2 = getEnterArg("второй аргумент");
		             break;
		                         
		                         
		   case 10:  exit = true;
		             break;                  

				       
		   default:  System.out.println("(Вы выбрали некорректный пункт меню)");
				     break;
		}		
	}
	
	
	/**
	    * Метод entersArguments() - позволяет пользователю сделать ввод аргументов,
	    * с которыми будет производиться выбранное им действие.
	    */	
    private void entersArguments() {
    	if (this.useResult == true && this.result != 0) {
    		this.arg1 = result;
    		this.arg2 = getEnterArg("второй аргумент");		
    	} else {
    		this.arg1 = getEnterArg("первый аргумент");
    		this.arg2 = getEnterArg("второй аргумент");	
    	}	
	}


    
    
    /**
    * Метод checkArgs() - позволяет проверить аргументы на наличие до старта работы основной
    * логики программы, и если они отсутствуют - то предложить пользователю ввод 
    * аргументов.
    */	
	public boolean checkEmptyArgs(double arg1, double arg2) {
  		 if (arg1 == 0 || arg2 == 0) return true;
  		 else return false;
    };
	
	
	
    /**
    * Метод enterArg() - позволяет вернуть введенный пользователем корректный
    * ввод аргумента в формате double. Данный метод нужен для реализации
    * стартового ввода аргументов программы
    * 
    * @param argName - имя аргумента, для строки запроса ввода аргумента
    * @return double аргумент введенный пользователем
    */
    public double getEnterArg(String argName) {
    	double arg = 0;
    	boolean rightChoice = false;
    	
    	System.out.printf("Введите %s: ", argName);
    	
    	while (rightChoice == false) {
			if (!this.scan.hasNextDouble()) {
				this.scan.next();
				System.out.printf("Введите %s в правильном формате: ", argName);
			}
			else {
				arg = scan.nextDouble();
				rightChoice = true;
			}
    	}
    	return arg;
    };
    
  
    
    /**
    * Метод addSeparator() - быстрая возможность вывода разделителя в нужном месте
    */
    public void addSeparator() {
    	System.out.println("-");
    };
    
    
}
