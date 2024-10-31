package aplicacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entidades.Comentario;
import entidades.Post;

public class Main {

	public static void main(String[] args) {
		Comentario comentario01 = new Comentario("Uau, Isso é incrivel!");
		Comentario comentario02 = new Comentario("Tenha uma boa viagem!");
		
		DateTimeFormatter formatacao1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		String dadosHora = "21/06/2018 13:05:44";
		String titulo = "Viagem para nova zelandia!";
		String conteudo = "Estou indo visitar um país lindo!";
		Integer likes = 12;
		
		LocalDateTime dataHora = LocalDateTime.parse(dadosHora, formatacao1);
		
		Post post01 = new Post(dataHora, titulo, conteudo, likes);
		post01.adicionarComentarios(comentario01);
		post01.adicionarComentarios(comentario02);
		
		System.out.println(post01);

	}

}
