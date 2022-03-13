package br.com.validarcao;

import java.io.IOException;

import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;

public class Cep {

	public static void main(String[] args) {


		ViaCEPClient cliente = new ViaCEPClient();
		try {
		ViaCEPEndereco endereco	= cliente.getEndereco("72015575");
		System.out.println(endereco.getBairro());
		System.out.println(endereco.getLogradouro());
		System.out.println(endereco.getComplemento());

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

//try {
//URL url = new URL("http://viacep.com.br/ws/01001000/json/");
//HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
//conexao.setRequestMethod("GET");
//conexao.getInputStream();
//
//}catch (MalformedInputException e) {
//e.getStackTrace();
//}catch (Exception e) {
//
//e.getStackTrace();
//}