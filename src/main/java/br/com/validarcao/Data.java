package br.com.validarcao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Data {

	public static void main(String[] args) {

		// apenas data
		DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(formatar.format(date));

		System.out.println();

		// data e hora
		DateTimeFormatter formatar1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time);
		System.out.println(formatar1.format(time));

		// Enuns ja criados
		System.out.println();
		DateTimeFormatter formatar3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		DateTimeFormatter formatar2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(formatar2.format(time));
		System.out.println(formatar3.format(time));

		System.out.println();

		// tirar e acrencentar horas
		System.out.println(time.minusHours(5));
		System.out.println(time.plusHours(10));

	}

}
