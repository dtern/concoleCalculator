package calculator;


/**
* ����� Calculator ������������ ��� ������������ �������������� ��������
* � ����� �����������: ��������, ���������, ������������, �������, �
* ���������� � �������. ��� ����� ������� 5 ��������� �������.
* 
* @author Ternov
* 
* 
*/
public class Calculator implements Calculate {


   /** ������������ 
	* @param var1 ������ ��������
    * @param var2 ������ �������� 	
    * @return result operation
    */
	public double summation(double var1, double var2){
		return var1 + var2;
	};
	
	
   /** ���������
    * @param var1 ������ ��������
    * @param var2 ������ �������� 	
    * @return result operation
    */
	public double subtraction(double var1, double var2){
		return var1 - var2;
	};
	
	
   /** ���������
    * @param var1 ������ ��������
    * @param var2 ������ �������� 	
    * @return result operation
    */
	public double composition(double var1, double var2){
		return var1 * var2;
	};
	
	
   /** �������
    * @param var1 ������ ��������
    * @param var2 ������ �������� 	
    * @return result operation
    */
	public double division(double var1, double var2){
		if (var2 != 0) {
			return var1/var2;
		}
		else {
			throw new ArithmeticException("Division by zero");
		}
	};
	
	
   /** ���������� � �������
    * @param var1 ������ ��������
    * @param var2 ������ �������� 	
    * @return result operation
    */
	public double exponentiation(double var1, double var2){
		return Math.pow(var1, var2);
	};	

}
