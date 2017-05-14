package entidades;

public class Cinema {

	private Integer id;
	private String nome;
	private String cidade;
	
	public Cinema(Integer id, String nome, String cidade){
		this.nome = nome;
		this.cidade = cidade;
		this.id = id;
	}
	
	public Cinema(){
		
	}
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
}
