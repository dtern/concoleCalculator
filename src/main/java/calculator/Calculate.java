package calculator;

public interface Calculate {

	   /** ������������ 
		* @param var1 ������ ��������
	    * @param var2 ������ �������� 	
	    * @return result operation
	    */
		public double summation(double var1, double var2);
		
	   /** ���������
	    * @param var1 ������ ��������
	    * @param var2 ������ �������� 	
	    * @return result operation
	    */
		public double subtraction(double var1, double var2);
		
		
	   /** ���������
	    * @param var1 ������ ��������
	    * @param var2 ������ �������� 	
	    * @return result operation
	    */
		public double composition(double var1, double var2);
		
		
	   /** �������
	    * @param var1 ������ ��������
	    * @param var2 ������ �������� 	
	    * @return result operation
	    */
		public double division(double var1, double var2);
		
		
	   /** ���������� � �������
	    * @param var1 ������ ��������
	    * @param var2 ������ �������� 	
	    * @return result operation
	    */
		public double exponentiation(double var1, double var2);

}
