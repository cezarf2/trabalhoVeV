package entidades;

public class Categoria {

	private Integer id;
	private String nome;
	
	public Categoria(Integer id, String nome){
		this.setId(id);
		this.nome = nome;
	}
	
	public Categoria(){
		
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
