package br.com.validarcao;

import br.com.caelum.stella.validation.InvalidStateException;
import br.com.caelum.stella.validation.TituloEleitoralValidator;
import br.com.caelum.stella.validation.Validator;

public class ValidacaoTituloEleitor {

	public static void main(String[] args) {
		String tituloEleitor = "417453530116";
		TituloEleitoralValidator validador = new TituloEleitoralValidator();

		try {
			validador.assertValid(tituloEleitor);
			System.out.println("Titulo V�LIDO");
		} catch (InvalidStateException e) {
			System.out.println("Titulo INVA�LIDO: " + e.getMessage());
		}
	}
	
//	private static void validarDocumentos(Validator<String>validador, String documento) {
//		validador.assertValid(documento);
//	}
}

