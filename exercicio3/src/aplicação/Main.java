package aplicação;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		
		DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatacao1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		LocalDate dataLocal = LocalDate.now();
		LocalDateTime dataLocalTime = LocalDateTime.now();
		Instant dataFuso = Instant.now();
		LocalDate dataLocalEscrita = LocalDate.parse("2002-02-22");
		LocalDateTime dataLocalTimeEscrita = LocalDateTime.parse("2002-02-22T13:09:20.9898");
		Instant dataLocalTimeFusoEscrita = Instant.parse("2002-02-22T13:09:20.9898Z");
		Instant dataLocalTimeFusoMinasEscrita = Instant.parse("2002-02-22T13:09:20.9898-03:00");
		LocalDateTime dataLocaTimelManual = LocalDateTime.parse("27/02/2202 13:59:45", formatacao1);
		LocalDate dataLocalManualof = LocalDate.of(2002,06,21);
		LocalDateTime dataLocalTimeManualof = LocalDateTime.of(2002,06,21,1,34);

		System.out.println(dataLocal);
		System.out.println(dataLocalTime);
		System.out.println(dataFuso);
		System.out.println(dataLocalEscrita);
		System.out.println(dataLocalTimeEscrita);
		System.out.println(dataLocalTimeFusoEscrita);
		System.out.println(dataLocalTimeFusoMinasEscrita);
		System.out.println(dataLocaTimelManual);
		System.out.println(dataLocalManualof);
		System.out.println(dataLocalTimeManualof);
		
		LocalDate dataLocalManual2 = LocalDate.parse("2022-05-27");
		LocalDateTime dataLocalTimelManual = LocalDateTime.parse("2002-05-14T13:24:56");
		Instant dataLocalTimeFusoManual = Instant.parse("2002-05-14T13:24:56Z");
			
		DateTimeFormatter formatacao2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
		DateTimeFormatter formatacao4 = DateTimeFormatter.ISO_DATE_TIME;

		System.out.println("Data: " + dataLocalManual2.format(formatacao));
		System.out.println("Data: " + formatacao.format(dataLocalManual2));
		System.out.println("Data: " + dataLocalTimelManual.format(formatacao1));
		System.out.println("Data: " + formatacao2.format(dataLocalTimeFusoManual));
		System.out.println("Data: " + formatacao4.format(dataLocalTimelManual));
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		LocalDate conversaoLocalDate = LocalDate.parse("2005-02-13");
		LocalDateTime conversaoLocalDateTime = LocalDateTime.parse("2005-02-13T01:02:23");
		Instant conversaoInstant = Instant.parse("2005-02-13T23:04:23Z");
		
		LocalDate resultado1 = LocalDate.ofInstant(conversaoInstant, ZoneId.systemDefault());
		LocalDate resultado2 = LocalDate.ofInstant(conversaoInstant, ZoneId.of("Asia/Qatar"));
		LocalDateTime resultado3 = LocalDateTime.ofInstant(conversaoInstant, ZoneId.of("Asia/Qatar"));;
		LocalDateTime resultado4 = LocalDateTime.ofInstant(conversaoInstant, ZoneId.systemDefault());;

		
		System.out.println(resultado1);
		System.out.println(resultado2);
		System.out.println(resultado3);
		System.out.println(resultado4);
		System.out.println("Dia: " + resultado1.getDayOfMonth());
		System.out.println("Hora: " + resultado3.getHour());

		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		LocalDate operacoesLocalDate = LocalDate.parse("2005-02-13");
		LocalDateTime operacoesLocalDateTime = LocalDateTime.parse("2005-02-13T01:02:23");
		Instant operacoesInstant = Instant.parse("2005-02-13T23:04:23Z");
		
		LocalDate semanaPassada = operacoesLocalDate.minusDays(7);
		LocalDate proximaPassada = operacoesLocalDate.plusDays(7);

		System.out.println(operacoesLocalDate);
		System.out.println(semanaPassada);
		System.out.println(proximaPassada);
		
		LocalDateTime semanaPassadaDateTime = operacoesLocalDateTime.minusDays(7);
		LocalDateTime proximaPassadaDataTime = operacoesLocalDateTime.plusDays(7);
		
		System.out.println(semanaPassadaDateTime);
		System.out.println(proximaPassadaDataTime);
		
		Instant semanaPassadaInstant = operacoesInstant.minus(7, ChronoUnit.DAYS);
		Instant proximaPassadaInstant = operacoesInstant.plus(7, ChronoUnit.DAYS);
		
		Duration duracao1 = Duration.between(semanaPassadaDateTime, proximaPassadaDataTime);
		Duration duracao2 = Duration.between(operacoesLocalDate.atStartOfDay(), proximaPassada.atStartOfDay());
		Duration duracao3 = Duration.between(semanaPassadaInstant, proximaPassadaInstant);

		System.out.println(duracao1.toDays());
		System.out.println(duracao2.toDays());
		System.out.println(duracao3.toDays());
	}

}
