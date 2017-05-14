package controladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import entidades.Categoria;
import entidades.Cinema;
import entidades.Filme;
import entidades.Pessoa;
import entidades.Sala;
import entidades.Sessao;

@RestController
public class SessaoController {

	@RequestMapping("/sessao/sessaoporfilme")
	public List<Sessao> buscarSessaoPorFilme(@RequestParam(value="id", defaultValue="1") int id){
		ArrayList<Sessao> sessoes = new ArrayList<>();
		ArrayList<Pessoa> equipe =  new ArrayList<Pessoa>();
		equipe.add(new Pessoa(1, "Erika", "Atriz"));
		equipe.add(new Pessoa(2, "Nathy", "Atriz"));
		equipe.add(new Pessoa(3, "Clarice", "Diretor"));
		Cinema cinema1 = new Cinema(1, "O bom vizinho","Quixadá");
		Cinema cinema2 = new Cinema(2, "Renato Aragão", "Sobral");
		Sala sala1 = new Sala(1, "Sala1", cinema1 , 40, "3d");
		Sala sala2 = new Sala(2, "Sala2", cinema2 , 35, "2d");
		Categoria categoria = new Categoria(1, "Suspense");
		Filme filme = new Filme(1, "A Cabana", equipe, "Historia triste de um pai",
				3, categoria,"3d");
		sessoes.add(new Sessao(1, filme, sala1, 12, 14, "12/10/12"));
		sessoes.add(new Sessao(2, filme, sala2, 20, 22, "12/10/12"));
		return sessoes;
	}
	
	@RequestMapping("/sessao/sessaoporsala")
	public ArrayList<Sessao> buscarSessaoPorSala(@RequestParam(value="id", defaultValue="1") int id){
		ArrayList<Sessao> sessoes = new ArrayList<>();
		ArrayList<Pessoa> equipe =  new ArrayList<Pessoa>();
		equipe.add(new Pessoa(1, "Erika", "Atriz"));
		equipe.add(new Pessoa(2, "Nathy", "Atriz"));
		equipe.add(new Pessoa(3, "Clarice", "Diretor"));
		Cinema cinema1 = new Cinema(1, "O bom vizinho","Quixadá");
		Sala sala1 = new Sala(1, "Sala1", cinema1 , 40, "3d");
		Sala sala2 = new Sala(2, "Sala2", cinema1, 35, "2d");
		Categoria categoria = new Categoria(1, "Suspense");
		Filme filme = new Filme(1, "A Cabana", equipe, "Historia triste de um pai",
				3, categoria,"3d");
		sessoes.add(new Sessao(1, filme, sala1, 12, 14, "12/10/12"));
		sessoes.add(new Sessao(2, filme, sala2, 20, 22, "12/10/12"));
		return sessoes;
	}
}
