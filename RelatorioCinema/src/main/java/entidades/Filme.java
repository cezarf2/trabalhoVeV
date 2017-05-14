package entidades;

import java.util.ArrayList;

public class Filme {

	private Integer id;
	private String titulo;
	private ArrayList<Pessoa> atores;
	private String sinopse;
	private int duracao;
	private Categoria categoria;
	private String tipo;
	
	public Filme(Integer id, String titulo, ArrayList<Pessoa> atores, String sinopse,
			int duracao, Categoria categoria, String tipo){
		this.setId(id);
		this.titulo = titulo;
		this.atores =atores;
		this.sinopse = sinopse;
		this.duracao =duracao;
		this.categoria =categoria;
		this.tipo =tipo;
	}
	
	public Filme(){
		
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public ArrayList<Pessoa> getAtores() {
		return atores;
	}
	public void setAtores(ArrayList<Pessoa> atores) {
		this.atores = atores;
	}
	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}	
}
