package entidades;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
	
	private static DateTimeFormatter formatacao1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	private LocalDateTime moment;
	private String titulo;
	private String conteudo;
	private Integer likes;
	
	private List<Comentario> comentarios = new ArrayList<Comentario>();
	
	public Post(){
	}

	public Post(LocalDateTime moment, String titulo, String conteudo, Integer likes) {
		this.moment = moment;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.likes = likes;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	public Integer getLikes() {
		return likes;
	}
	
	public void addLikes() {
		likes++;
	}
	
	public List<Comentario> getComentarios() {
		return comentarios;
	}
	
	public void adicionarComentarios(Comentario comentarios) {
		this.comentarios.add(comentarios);
	}
	
	public void removerComentarios(Comentario comentarios) {
		this.comentarios.remove(comentarios);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(titulo + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(formatacao1.format(moment));
		sb.append(formatacao1.format(moment) + "\n");
		sb.append(conteudo + "\n");
		sb.append("Comentários: \n");
		for(Comentario comentario : comentarios) {
			sb.append(comentario);
		}
		 return sb.toString();
	}
}
