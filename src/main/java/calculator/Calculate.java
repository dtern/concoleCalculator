package calculator;

public interface Calculate {

	   /** —уммирование 
		* @param var1 первый аргумент
	    * @param var2 второй аргумент 	
	    * @return result operation
	    */
		public double summation(double var1, double var2);
		
	   /** ¬ычитание
	    * @param var1 первый аргумент
	    * @param var2 второй аргумент 	
	    * @return result operation
	    */
		public double subtraction(double var1, double var2);
		
		
	   /** ¬ычитание
	    * @param var1 первый аргумент
	    * @param var2 второй аргумент 	
	    * @return result operation
	    */
		public double composition(double var1, double var2);
		
		
	   /** ƒеление
	    * @param var1 первый аргумент
	    * @param var2 второй аргумент 	
	    * @return result operation
	    */
		public double division(double var1, double var2);
		
		
	   /** ¬озведение в степень
	    * @param var1 первый аргумент
	    * @param var2 второй аргумент 	
	    * @return result operation
	    */
		public double exponentiation(double var1, double var2);

}
