package calculator;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
* ����� InteractRunner ������������ ��� �������������� ������������
* ���� � ������� �������� ��� ������������ ���������� ��������������
* �������� ��� ������ ������������
* 
* @author Ternov
* @since 2017.09.13
* @version 3.0
* <br>
* <b>� �������:</b><br>
*  (scan) ������ ��������;<br>
*  (calc) ������ ������������;<br>
*  (menuBuilder) ������ ���� ������������;<br>
*  (resultBuilder) ������ ��� ������������ ����� �����������;<br>
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
	* ����� createMenu() ������������ ��� �������� ����������������� ���� � ����
	* ������� StringBuilder. ��� ���� ������� ��� ����, ����� ����� �����������
	* ������ ������ ���� � ����� ����� � ������� ���������������.
	* 
	* ���������� ����� ���� �� ���� �������������, �� ������� ����� ����������
	* ������ ���� - ������� ��� ��������� � ��������������� ������ ���������
	* ����� ������������.
	*/
	public void createMenu() {
		this.menuBuilder.append("�������� ��������, ������� �� ������ ���������:\n\n");
		this.menuBuilder.append("   1. ��������\n");
		this.menuBuilder.append("   2. ���������\n");
		this.menuBuilder.append("   3. ���������\n");
		this.menuBuilder.append("   4. �������\n");
		this.menuBuilder.append("   5. ���������� � �������\n");
		this.menuBuilder.append("   6. ��������/��������� ������������� ���������� � �������� ������� ���������\n");
		this.menuBuilder.append("   7. �������� ��� ��������� � ��������� ���������\n");
		this.menuBuilder.append("   8. �������� ������� �������� ����������\n");
		this.menuBuilder.append("   9. ������ ���������\n");
		this.menuBuilder.append("   10. ����� �� ������������\n\n");
	}
	
	
	
	
	
	/**
	* ����� start() �������� ����������� � ������� �� ���������� ������ ������ ���������:
	* <br>
	* #1 �������� ���������� ����<br>
	* #2 �������� ���� ������ ��������� (�������� ���������� ��� ��������� ���������) <br>
	* #3 ����� �������� �������� � ���������������� ����, � ������ ��������<br>
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
				System.out.print("������� ����� ��������: ");
				if (!scan.hasNextInt()) {
					scan.nextInt();
					continue;
				} else {
					this.action = scan.nextInt();
					this.goAction(this.action);
					
				}
			} catch (InputMismatchException e) {
				    e.printStackTrace();
					System.out.println("������������ ����� ������");
					scan.next();
			}       
		}
		System.out.println("��������� ���������");
	}


	
	
	/**
	* ����� goAction(int action) ��������� �������������� �������� ��� �����������,
	* ��� ������ ��������, ������� ������������� ����������� ������ �� ���� ������������.
	* 
	* @param action - ����� ������������
	*/
	public void goAction(int action) {
		
		switch (action) {
		
			case 0:  System.out.println("�� �� ������� ����� ����");
					 break;
					    
			case 1:  System.out.println("(�� ������� ������������) ");
			         this.entersArguments();
			         resultBuilder.append("���������: ").append(calc.summation(arg1, arg2));
					 System.out.println(resultBuilder.toString());
				     resultBuilder.delete(0, resultBuilder.length()); 
				     result = calc.summation(arg1, arg2);
				     break;
				     
			case 2:  System.out.println("(�� ������� ���������) ");
			         this.entersArguments();
			         resultBuilder.append("���������: ").append(calc.subtraction(arg1, arg2));
			         System.out.println(resultBuilder.toString());
		             resultBuilder.delete(0, resultBuilder.length()); 
		             result = calc.subtraction(arg1, arg2);
		             break;
				                
				                 
			case 3:  System.out.println("(�� ������� ���������) ");
			         this.entersArguments();
			         resultBuilder.append("���������: ").append(calc.composition(arg1, arg2));
			         System.out.println(resultBuilder.toString());
		             resultBuilder.delete(0, resultBuilder.length()); 
					 result = calc.composition(arg1, arg2);
				     break;
				                 
				                 
			case 4:  System.out.println("(�� ������� �������) ");
	                 this.entersArguments();
	                 resultBuilder.append("���������: ").append(calc.division(arg1, arg2));
	                 System.out.println(resultBuilder.toString());
                     resultBuilder.delete(0, resultBuilder.length()); 
					 result = calc.division(arg1, arg2);
				     break;
				                 
				                 
			case 5:  System.out.println("(�� ������� ���������� � �������) ");
	                 this.entersArguments();
			         resultBuilder.append("���������: ").append(calc.exponentiation(arg1, arg2));
                     System.out.println(resultBuilder.toString());
                     resultBuilder.delete(0, resultBuilder.length()); 
					 result = calc.exponentiation(arg1, arg2);
				     break;
				                 
				                 
			case 6:  System.out.println("�� ������� ��������� ����������� ����� ���������� � �������� ������� ��������� ");
				     if (this.useResult) {
				    	 this.useResult = false;
				    	 System.out.printf("������� ���� ��������: %s", useResult);
				     } else {
				    	 this.useResult = true;
				    	 System.out.printf("������� ���� �������: %s", useResult);
				     }
			         break;
			                     
			                     
			case 7:  System.out.println("�� ������� '�������� ��� ��������� � ��������� ���������'\n");	
				     arg1 = 0;
				     arg2 = 0;
				     result = 0;
				     useResult = false;
			         break;
			                     
			                     
			case 8:  System.out.printf("������� �������� ����������: 1: %s  2: %s  Result: %s\n", arg1, arg2, result);
			         break;
			                     
			                     
			case 9:  arg1 = getEnterArg("������ ��������");
		 			 arg2 = getEnterArg("������ ��������");
		             break;
		                         
		                         
		   case 10:  exit = true;
		             break;                  

				       
		   default:  System.out.println("(�� ������� ������������ ����� ����)");
				     break;
		}		
	}
	
	
	/**
	    * ����� entersArguments() - ��������� ������������ ������� ���� ����������,
	    * � �������� ����� ������������� ��������� �� ��������.
	    */	
    private void entersArguments() {
    	if (this.useResult == true && this.result != 0) {
    		this.arg1 = result;
    		this.arg2 = getEnterArg("������ ��������");		
    	} else {
    		this.arg1 = getEnterArg("������ ��������");
    		this.arg2 = getEnterArg("������ ��������");	
    	}	
	}


    
    
    /**
    * ����� checkArgs() - ��������� ��������� ��������� �� ������� �� ������ ������ ��������
    * ������ ���������, � ���� ��� ����������� - �� ���������� ������������ ���� 
    * ����������.
    */	
	public boolean checkEmptyArgs(double arg1, double arg2) {
  		 if (arg1 == 0 || arg2 == 0) return true;
  		 else return false;
    };
	
	
	
    /**
    * ����� enterArg() - ��������� ������� ��������� ������������� ����������
    * ���� ��������� � ������� double. ������ ����� ����� ��� ����������
    * ���������� ����� ���������� ���������
    * 
    * @param argName - ��� ���������, ��� ������ ������� ����� ���������
    * @return double �������� ��������� �������������
    */
    public double getEnterArg(String argName) {
    	double arg = 0;
    	boolean rightChoice = false;
    	
    	System.out.printf("������� %s: ", argName);
    	
    	while (rightChoice == false) {
			if (!this.scan.hasNextDouble()) {
				this.scan.next();
				System.out.printf("������� %s � ���������� �������: ", argName);
			}
			else {
				arg = scan.nextDouble();
				rightChoice = true;
			}
    	}
    	return arg;
    };
    
  
    
    /**
    * ����� addSeparator() - ������� ����������� ������ ����������� � ������ �����
    */
    public void addSeparator() {
    	System.out.println("-");
    };
    
    
}
