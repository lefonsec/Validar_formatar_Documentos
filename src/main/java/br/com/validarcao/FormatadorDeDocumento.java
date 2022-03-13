package br.com.validarcao;

import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.TituloEleitoralFormatter;

public class FormatadorDeDocumento {

	public static void main(String[] args) {

		String cpf = "044.260.791-10";
		String cpnj = "17.325.833/0001-25";
		String tituloEleitor = "417453530116";
		
		CNPJFormatter formaterCnpj = new CNPJFormatter();
		String cnpjSemFormar = formaterCnpj.unformat(cpnj);
		System.out.println(cnpjSemFormar);
		
		TituloEleitoralFormatter Titulo = new TituloEleitoralFormatter();
		String tituloScomForma = Titulo.format(tituloEleitor);
		System.out.println(tituloScomForma);
		
		CPFFormatter formater = new CPFFormatter();
		String semFormatacao = formater.unformat(cpf);
		System.out.println(semFormatacao);
		
		

 
	}

}
