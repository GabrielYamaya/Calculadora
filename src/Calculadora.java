/**
 *
 * @author Gabriel Yamaya
 * @version 1.0.1
 * @since Release 1.0.0 da aplicação
 */

public class Calculadora {
		/**
		 * 
		 * @param a, primeiro valor a ser utilizado para a soma
		 * @param b, segundo valor a ser utilizado para a soma
		 * @return, resultado da soma dos dois parâmetros
		 */
		public int somar(int a, int b) {
			//Função para somar dois números inteiros;
			return a + b;
		}
		
		/**
		 * 
		 * @param a, primeiro valor a ser utilizado para a subtração
		 * @param b, segundo valor a ser utilizado para a subtração
		 * @return, resultado da subtração dos dois parâmetros
		 */
		public int subtrair(int a, int b) {
			//Função para subtrair dois números inteiros;
			return a - b;
		}
		
		/**
		 * 
		 * @param a, primeiro valor a ser utilizado para a multiplicação
		 * @param b, segundo valor a ser utilizado para a multiplicação
		 * @return, resultado da multiplicação dos dois parâmetros
		 */
		public int multiplicar(int a, int b) {
			//Função para multiplicar dois números inteiros;
			return a * b;
		}
		
		/**
		 * 
		 * @param a, primeiro valor a ser utilizado para a divisão
		 * @param b, segundo valor a ser utilizado para a divisão
		 * @return, resultado da divisão dos dois parâmetros
		 */
		public float dividir(int a, int b) {
			//Função para dividir dois números inteiros;
			float x, y;
			x = a;
			y = b;
			return x / y;
		}

}
