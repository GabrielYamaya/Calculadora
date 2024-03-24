
public class CalculadoraTestes {

	public static void main(String[] args) {
		//Cria um objeto da classe Soma
        Calculadora calc = new Calculadora();
        
        //Cenário de teste 1: soma de dois números positivos;
        int soma = calc.somar(3, 7);
        System.out.println(soma);
        //Neste cenário espera-se o valor "10";

        
        //Cenário de teste 1: soma de um número positivo e um zero;
        soma = calc.somar(3, 0);
        System.out.println(soma);
        //Neste cenário espera-se o valor "3";

        
        //Cenário de teste 1: soma de dois zeros;
        soma = calc.somar(0, 0);
        System.out.println(soma);
        //Neste cenário espera-se o valor "0";

        
        //Cenário de teste 4: soma de um número positivo e um número negativo;
        soma = calc.somar(3, -1);
        System.out.println(soma);
        //Neste cenário espera-se o valor "2";

                
        //Cenário de teste 5: subtração de dois números positivos;
        int subtracao = calc.subtrair(3, 7);
        System.out.println(subtracao);
        //Neste cenário espera-se o valor "-4";

        
        //Cenário de teste 6: subtração de um número positivo e um zero;
        subtracao = calc.subtrair(3, 0);
        System.out.println(subtracao);
        //Neste cenário espera-se o valor "3";

        
        //Cenário de teste 7: subtração de dois zeros;
        subtracao = calc.subtrair(0, 0);
        System.out.println(subtracao);
        //Neste cenário espera-se o valor "0";

        
        //Cenário de teste 8: subtração de um número positivo e um número negativo;
        subtracao = calc.subtrair(3, -1);
        System.out.println(subtracao);
        //Neste cenário espera-se o valor "4";

        
        //Cenário de teste 9: divisão de dois números positivos;
        float dividir = calc.dividir(6, 4);
        System.out.println(dividir);
        //Neste cenário espera-se o valor "1,5";

        
        //Cenário de teste 10: divisão de um número positivo e um zero;
        dividir = calc.dividir(3, 0);
        System.out.println(dividir);
        //Neste cenário espera-se a exceção Infinity (número infinito);
        
        
        //Cenário de teste 11: divisão de dois zeros;
        dividir = calc.dividir(0, 0);
        System.out.println(dividir);
        //Neste cenário espera-se a exceção NaN (not a number, não é um número);

        
        //Cenário de teste 12: divisão de um número positivo e um número negativo;
        dividir = calc.dividir(3, -1);
        System.out.println(dividir);
        //Neste cenário espera-se o valor "-3";

        
        //Cenário de teste 13: divisão de dois números positivos;
        int multiplicar = calc.multiplicar(3, 7);
        System.out.println(multiplicar);
        //Neste cenário espera-se o valor "21";
        
        
        //Cenário de teste 14: divisão de um número positivo e um zero;
        multiplicar = calc.multiplicar(3, 0);
        System.out.println(multiplicar);
        //Neste cenário espera-se o valor "0";

        
        //Cenário de teste 15: divisão de dois zeros;
        multiplicar = calc.multiplicar(0, 0);
        System.out.println(multiplicar);
        //Neste cenário espera-se o valor "0";

        
        //Cenário de teste 16: divisão de um número positivo e um número negativo;
        multiplicar = calc.multiplicar(3, -1);
        System.out.println(multiplicar);
        //Neste cenário espera-se o valor "-3";
	}

}
