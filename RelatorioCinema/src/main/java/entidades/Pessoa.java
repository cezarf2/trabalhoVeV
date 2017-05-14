package entidades;
public class Pessoa {

	private Integer id;
	private String nome;
	private String papel;
	
	public Pessoa(Integer id, String nome, String papel){
		this.setId(id);
		this.setNome(nome);
		this.setPapel(papel);
	}
	
	public Pessoa(){
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPapel() {
		return papel;
	}
	public void setPapel(String papel) {
		this.papel = papel;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
