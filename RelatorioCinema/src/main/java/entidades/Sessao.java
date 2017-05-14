package entidades;

public class Sessao {
	
	private Integer id;
	private Filme filme;
	private Sala sala;
	private int horaEntrada;
	private int horaSaida;
	private String data;
	
	public Sessao(Integer id, Filme filme, Sala sala, int horaEntrada, int horaSaida, String data){
		this.setId(id);
		this.filme = filme;
		this.sala = sala;
		this.horaEntrada = horaEntrada;
		this.horaSaida = horaSaida;
		this.data = data;
	}
	
	public Sessao(){
		
	}
	
	public Filme getFilme() {
		return filme;
	}
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	public int getHoraEntrada() {
		return horaEntrada;
	}
	public void setHoraEntrada(int horaIn) {
		this.horaEntrada = horaIn;
	}
	public int getHoraSaida() {
		return horaSaida;
	}
	public void setHoraSaida(int horaOut) {
		this.horaSaida = horaOut;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
