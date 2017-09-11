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
			
			// ������� �������� ����� �� �����
			addSeparator();
			System.out.println("�������� ��������, ������� �� ������ ���������:");
			System.out.println(" ");
			System.out.println("   1. ������������");
			System.out.println("   2. ���������");
			System.out.println("   3. ���������");
			System.out.println("   4. �������");
			System.out.println("   5. ���������� � �������");
			System.out.println("   6. ������� ������ ���������� ��������� ����������� ���������� (���� ����)");
			System.out.println("   7. �������� ��������� (������� ����������)");
			System.out.println("   8. �������� ������� �������� ����������");
			System.out.println("   9. ������ ���������");
			System.out.println("   10. ����� �� ������������");
			System.out.println(" ");
			
				try {
					System.out.print("������� ����� ��������: ");
					if (!scan.hasNextInt()) {
						scan.nextInt();
						continue;
					}
					else {
						action = scan.nextInt();
					}
				} catch (InputMismatchException e) {
					System.out.println("������������ ����� ������");
					scan.next();
				}


			
			switch (action) {
			    case 0:  System.out.println("�� �� ������� ����� ����");
			             break;
			    
		        case 1:  System.out.println("(�� ������� ������������) ");
		        		 if (useResult == false) {
		        		   if (arg1 == 0 || arg2 == 0) {
		        			   enterArgs();
		        		   }
		        		 } else {
		        			 if (arg2 == 0) {
		        				 enterArg(); 
		        			 }
		        		 }

		        		 System.out.println("���������: " + calc.summation(arg1, arg2));
		        		 result = calc.summation(arg1, arg2);
		                 break;
		                 
		        case 2:  System.out.println("(�� ������� ���������) ");
				         System.out.println("���������: " + calc.subtraction(arg1, arg2));
				         result = calc.subtraction(arg1, arg2);
		                 break;
		                 
		        case 3:  System.out.println("(�� ������� ���������) ");	
				         System.out.println("���������: " + calc.composition(arg1, arg2));
				         result = calc.composition(arg1, arg2);
		                 break;
		                 
		        case 4:  System.out.println("(�� ������� �������) ");	
				         System.out.println("���������: " + calc.division(arg1, arg2));
				         result = calc.composition(arg1, arg2);
		                 break;
		                 
		        case 5:  System.out.println("(�� ������� ���������� � �������) ");	
				         System.out.println("���������: " + calc.exponentiation(arg1, arg2));
				         result = calc.exponentiation(arg1, arg2);
		                 break;
		                 
		        case 6:  System.out.println("�� ������� ������ ���������� ���������� ����� ���������. ");
		                 if (result != 0){
		                      arg1 = result;
		 	                  System.out.println("������� ��������� ��������� ��������: " + result);
		                 } else {
		                	 System.out.print("����������� ���������� ��� ���. ������ �������� �� �����������");
		                 }
	                     break;
	                     
		        case 7:  System.out.println("�� ������� '�������� ��������� - ������� ��������� � ������� ���������'");	
		        	     arg1 = 0;
		        		 arg2 = 0;
		        		 result = 0;
		        		 useResult = false;
	                     break;
	                     
		        case 8:  System.out.println("������� �������� ����������:");
		                 System.out.println("1: " + arg1);
		                 System.out.println("2: " + arg2);
	                     break;
	                     
		        case 9:  enterArgs();
                         break;
                         
		       case 10:  exit = true;
                         break;                  

		       
		       default:  System.out.println("(�� ������� ������������ ����� ����)");
		                 break;
	        }
		}
		
	}


	// ������ ���� ��������
    public void enterArg() {
    	System.out.print("");
    	System.out.print("������� ������ ��������: ");
    	arg2 = getDoubleArgs(); //scan.nextDouble();
    	System.out.print("");
    };
    
    
    
    // ������ ��� ��������
    public void enterArgs() {
    	System.out.print("");
    	System.out.print("������� ������ ��������: ");
    	arg1 = getDoubleArgs(); // scan.nextDouble();
    	System.out.print("������� ������ ��������: ");
    	arg2 = getDoubleArgs(); // scan.nextDouble();
    	System.out.print("");
    };
    
    
    
    // ������� ������
    public void addSeparator() {
    	System.out.println("-");
    };
    
    
    public double getDoubleArgs() {
    	double arg = 0;
    	boolean rightChoice = false;
    	
    	while (rightChoice == false) {
			if (!scan.hasNextDouble()) {
				scan.next();
				System.out.println("������� �������� � ���������� �������: ");
			}
			else {
				arg = scan.nextDouble();
				// System.out.println("(�������� ���������: " + arg + ") ");
				rightChoice = true;
			}
    	}
    	return arg;
    }
    
}
