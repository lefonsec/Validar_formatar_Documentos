package br.com.validarcao;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.NumberValue;
import javax.money.convert.CurrencyConversion;
import javax.money.convert.ExchangeRateProvider;
import javax.money.convert.MonetaryConversions;

import org.javamoney.moneta.FastMoney;
import org.javamoney.moneta.Money;
import org.javamoney.moneta.convert.ExchangeRateType;
import org.javamoney.moneta.function.MonetaryOperators;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

public class Dinheiro {

	public static void main(String[] args) {

	CurrencyUnit moeda	= Monetary.getCurrency("BRL");
	MonetaryAmount valorDaParcela =Money.of(75, moeda);
	System.out.println(valorDaParcela);
	
	MonetaryAmount	valorTotal = valorDaParcela.multiply(12);
	System.out.println(valorTotal);
	
	MonetaryAmount desconto =	valorTotal.with(MonetaryOperators.percent(10));
	System.out.println(desconto);
	NumberValue descontoSemMoeda = desconto.getNumber();
	
	NumericToWordsConverter conversor = new NumericToWordsConverter(new FormatoDeReal());
	String numeroExtenso = conversor.toWords(descontoSemMoeda.doubleValue());
	System.out.println(numeroExtenso);
	
	System.out.println("Olá aluno ganhe " + numeroExtenso + " ouvindo nosso podcast ");
	}
	
	
	
	
	

	//Primeiro vamos criar as moedas e os valores
	CurrencyUnit dolar = Monetary.getCurrency("USD");
	CurrencyUnit real = Monetary.getCurrency("BRL");
	MonetaryAmount valorProdutoDolar = FastMoney.of(90, dolar);
	MonetaryAmount valorImpostoReal = FastMoney.of(30, real);

	//Agora vamos usar o provider para pegar a cotação
	ExchangeRateProvider provider = MonetaryConversions.getExchangeRateProvider(ExchangeRateType.ECB);


	//Vamos pegar a conversão atual(do dia)
	CurrencyConversion conversaoAtual = provider.getCurrencyConversion(dolar);


	//Agora vamos transformar o valor do imposto em Real para dólar
	MonetaryAmount valorImpostoDolar = conversaoAtual.apply(valorImpostoReal);


	//Agora que o valor do imposto está em dólar, podemos somar com o valor inicial do produto
	MonetaryAmount valorFinalProdutoDolar = valorProdutoDolar.add(valorImpostoDolar);
}
