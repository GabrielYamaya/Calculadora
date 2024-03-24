//Importações das bibliotecas do framework JUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

//Cria a classe para testes usando o JUnit
public class CalculadoraTesteJunit {
	
	//Define as variáveis
	int soma, subtracao, multiplicacao;
	float divisao;

	//@Test indica que é uma função para teste do JUnit
	@Test
	public void somarDoisNumerosPositivos() {
		//Teste da função "somar" com um dois números positivos;
		Calculadora calc = new Calculadora();
		soma = calc.somar(3, 7);
		assertEquals(10, soma);
	}
	
	@Test
	public void somarUmNumeroPositivoComZero() {
		//Teste da função "somar" com um número positivo e um zero;
		Calculadora calc = new Calculadora();
		soma = calc.somar(3, 0);
		assertEquals(3, soma);
	}
	
	@Test
	public void somarDoisNumerosZeros() {
		//Teste da função "somar" com dois números zeros;
		Calculadora calc = new Calculadora();
		soma = calc.somar(0, 0);
		assertEquals(0, soma);
	}
	
	@Test
	public void somarUmNumeroPositivoEUmNumeroNegativo() {
		//Teste da função "somar" com um número positivo e um número negativo;
		Calculadora calc = new Calculadora();
		soma = calc.somar(3, -1);
		assertEquals(2, soma);
	}
	
	@Test
	public void subtrairDoisNumerosPositivos() {
		//Teste da função "subtracao" com dois números positivos;
		Calculadora calc = new Calculadora();
		subtracao = calc.subtrair(3, 7);
		assertEquals(-4, subtracao);
	}
	
	@Test
	public void subtrairUmNumeroPositivoComZero() {
		//Teste da função "subtracao" com um número positivo e um zero;
		Calculadora calc = new Calculadora();
		subtracao = calc.subtrair(3, 0);
		assertEquals(3, subtracao);
	}
	
	@Test
	public void subtrairDoisNumerosZeros() {
		//Teste da função "subtracao" com dois números zeros;
		Calculadora calc = new Calculadora();
		subtracao = calc.subtrair(0, 0);
		assertEquals(0, subtracao);
	}
	
	@Test
	public void subtrairUmNumeroPositivoEUmNumeroNegativo() {
		//Teste da função "subtracao" com um número positivo e um número negativo;
		Calculadora calc = new Calculadora();
		subtracao = calc.subtrair(3, -1);
		assertEquals(4, subtracao);
	}
	
	@Test
	public void multiplicarDoisNumerosPositivos() {
		//Teste da função "multiplicar" com dois números positivos;
		Calculadora calc = new Calculadora();
		multiplicacao = calc.multiplicar(3, 7);
		assertEquals(21, multiplicacao);
	}
	
	@Test
	public void multiplicarUmNumeroPositivoComZero() {
		//Teste da função "multiplicar" com um número positivo e um zero;
		Calculadora calc = new Calculadora();
		multiplicacao = calc.multiplicar(3, 0);
		assertEquals(0, multiplicacao);
	}
	
	@Test
	public void multiplicarDoisNumerosZeros() {
		//Teste da função "multiplicar" com dois números zeros;
		Calculadora calc = new Calculadora();
		multiplicacao = calc.multiplicar(0, 0);
		assertEquals(0, multiplicacao);
	}
	
	@Test
	public void multiplicarUmNumeroPositivoEUmNumeroNegativo() {
		//Teste da função "multiplicar" com um número positivo e um número negativo;
		Calculadora calc = new Calculadora();
		multiplicacao = calc.multiplicar(3, -1);
		assertEquals(-3, multiplicacao);
	}
	
	@Test
	public void divisaoDoisNumerosPositivos() {
		//Teste da função "dividir" com dois números positivos;
		Calculadora calc = new Calculadora();
		divisao = calc.dividir(3, 7);
		assertEquals(21, divisao);
	}
	
	@Test
	public void divisaoUmNumeroPositivoComZero() {
		//Teste da função "dividir" com um número positivo e um zero;
		Calculadora calc = new Calculadora();
		divisao = calc.dividir(3, 0);
		assertEquals(0, divisao);
	}
	
	@Test
	public void divisaoDoisNumerosZeros() {
		//Teste da função "dividir" com dois números zeros;
		Calculadora calc = new Calculadora();
		divisao = calc.dividir(0, 0);
		assertEquals(0, divisao);
	}
	
	@Test
	public void divisaoUmNumeroPositivoEUmNumeroNegativo() {
		//Teste da função "dividir" com um número positivo e um número negativo;
		Calculadora calc = new Calculadora();
		divisao = calc.dividir(3, -1);
		assertEquals(-3, divisao);
	}
}
