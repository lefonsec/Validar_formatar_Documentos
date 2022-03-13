package br.com.validarcao;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class ValdacaoCNPJ {

	public static void main(String[] args) {

		String cpnj = "82588641000173";
		CNPJValidator validador = new CNPJValidator();
		
		try {
			validador.assertValid(cpnj);
			System.out.println("CNPJ é válido");
		}catch (InvalidStateException e) {
			System.out.println("Cnpj Inválido: " + e.getMessage() );
		}
	}

}
