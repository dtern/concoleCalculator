package calculator;


/**
*  ласс Calculator предназначен дл€ произведени€ арифметический операций
* с двум€ аргументами: сложение, вычитание, произведение, деление, и
* возведение в степень. ƒл€ этого созданы 5 отдельных методов.
* 
* @author Ternov
* 
* 
*/
public class Calculator implements Calculate {


   /** —уммирование 
	* @param var1 первый аргумент
    * @param var2 второй аргумент 	
    * @return result operation
    */
	public double summation(double var1, double var2){
		return var1 + var2;
	};
	
	
   /** ¬ычитание
    * @param var1 первый аргумент
    * @param var2 второй аргумент 	
    * @return result operation
    */
	public double subtraction(double var1, double var2){
		return var1 - var2;
	};
	
	
   /** ¬ычитание
    * @param var1 первый аргумент
    * @param var2 второй аргумент 	
    * @return result operation
    */
	public double composition(double var1, double var2){
		return var1 * var2;
	};
	
	
   /** ƒеление
    * @param var1 первый аргумент
    * @param var2 второй аргумент 	
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
	
	
   /** ¬озведение в степень
    * @param var1 первый аргумент
    * @param var2 второй аргумент 	
    * @return result operation
    */
	public double exponentiation(double var1, double var2){
		return Math.pow(var1, var2);
	};	

}
