package controladores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import entidades.Cinema;
import entidades.Filme;
import entidades.RelatorioCinema;
import entidades.RelatorioFilme;
import entidades.Sala;
import entidades.SalaSessao;
import entidades.Sessao;

@RestController
public class RelatorioController {

	private final String host = "http://localhost:8080";
	private RestTemplate restTemplate = new RestTemplate();

	@RequestMapping("/relatorio/porcinema")
	public List<RelatorioFilme> buscarFilmePorCinema(@RequestParam(value="id", defaultValue="1") int id){
		List<RelatorioFilme> relatorioDeFilme = new ArrayList<>();
		List<Filme> filmesDoCinema = new ArrayList<>();
		List<Sessao> sessoesDoCinema = new ArrayList<>();
		List<Sala> salasDoCinema = Arrays.asList(restTemplate.getForObject(host + "/sala/salaporcinema?id=" + id, Sala[].class)); 

		for(Sala sala : salasDoCinema){
			List<Sessao> sessoesDaSala = Arrays.asList(restTemplate.getForObject(host + "/sessao/sessaoporsala?id=" + sala.getId(), Sessao[].class));
			for(Sessao sessao : sessoesDaSala){
				sessoesDoCinema.add(sessao);
				for(int i = 0; i < filmesDoCinema.size(); i++){
					if(filmesDoCinema.get(i).getId().equals(sessao.getFilme().getId())){
						filmesDoCinema.remove(i);
					}
				}
				filmesDoCinema.add(sessao.getFilme());
			}
		}
		
		for(Filme filme : filmesDoCinema){
			List<SalaSessao> salasSessoesDoFilme = new ArrayList<>();
			for(Sessao sessao : sessoesDoCinema){
				if(filme.getId().equals(sessao.getFilme().getId())){
					salasSessoesDoFilme.add(new SalaSessao(sessao.getSala().getQtdAcentos(),
							sessao.getSala().getTipo(), sessao.getSala().getNome(), 
							sessao.getHoraEntrada() + ":00 - " + sessao.getHoraSaida() + ":00",
							sessao.getData()));
				}
			}
			relatorioDeFilme.add(new RelatorioFilme(filme, salasSessoesDoFilme));
		}

		return relatorioDeFilme;
	}

	@RequestMapping("/relatorio/porfilme")
	public List<RelatorioCinema> buscarCinemaPorFilme(@RequestParam(value="id", defaultValue="1") int id){
		List<RelatorioCinema> relatorioDoCinema = new ArrayList<>();
		List<Cinema> cinemasDoFilme = new ArrayList<>();
		List<Sessao> sessoesDoFilme = Arrays.asList(restTemplate.getForObject(host + "/sessao/sessaoporfilme?id=" + id, Sessao[].class));
		
		for(Sessao sessao : sessoesDoFilme){
			for(int i = 0; i < cinemasDoFilme.size(); i++){
				if(cinemasDoFilme.get(i).getId().equals(sessao.getSala().getCinema().getId())){
					cinemasDoFilme.remove(i);
				}
			}
			cinemasDoFilme.add(sessao.getSala().getCinema());
		}
		
		for(Cinema cinema : cinemasDoFilme){
			List<SalaSessao> salasSessoesDoCinema = new ArrayList<>();
			for(Sessao sessao : sessoesDoFilme){
				if(cinema.getId().equals(sessao.getSala().getCinema().getId())){
					salasSessoesDoCinema.add(new SalaSessao(sessao.getSala().getQtdAcentos(),
							sessao.getSala().getTipo(), sessao.getSala().getNome(),
							sessao.getHoraEntrada() + ":00 - " + sessao.getHoraSaida() + ":00",
							sessao.getData()));
				}
			}
			relatorioDoCinema.add(new RelatorioCinema(cinema, salasSessoesDoCinema));
		}
		return relatorioDoCinema;
	}
}
