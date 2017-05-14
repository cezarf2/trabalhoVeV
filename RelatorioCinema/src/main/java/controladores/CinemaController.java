package controladores;

import java.util.ArrayList;

//import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import entidades.Cinema;

@RestController
public class CinemaController {

	@RequestMapping("/Cinema/listar")
	public ArrayList<Cinema> getListCinema(){
		ArrayList<Cinema> cinemas = new ArrayList<>();
		cinemas.add(new Cinema(1, "O bom vizinho", "Quixadá"));
		cinemas.add(new Cinema(2, "Renato Aragão", "Sobral"));
		return cinemas;
	}
	
	@RequestMapping("/Cinema/cinemaporid")
	public Cinema getCinemaPorId(@RequestParam(value="id", defaultValue="1") int id){
		return new Cinema(1, "O bom vizinho", "Quixadá");
	}
}
