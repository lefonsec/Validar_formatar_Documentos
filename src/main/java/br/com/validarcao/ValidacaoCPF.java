package br.com.validarcao;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class ValidacaoCPF {

	public static void main(String[] args) {
		String cpf = "044.260.791-10";
		CPFValidator validador = new CPFValidator();

		try {
			validador.assertValid(cpf);
			System.out.println("CPF VALIDO");
		} catch (InvalidStateException e) {
			System.out.println("CPF INVALIDO: " + e.getMessage());
		}

	}
}
