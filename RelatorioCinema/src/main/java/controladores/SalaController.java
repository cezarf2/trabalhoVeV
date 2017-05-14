package controladores;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import entidades.Cinema;
import entidades.Sala;

@RestController
public class SalaController {

	@RequestMapping("/sala/salaporcinema")
	public ArrayList<Sala> buscarSalaPorCinema(@RequestParam(value="id", defaultValue="1") int id){
		ArrayList<Sala> salas = new ArrayList<>();
		Cinema cinema = new Cinema(1, "O bom vizinho", "Quixadá");
		salas.add(new Sala(1, "Sala1", cinema, 40, "3d"));
		salas.add(new Sala(2, "Sala2", cinema, 35, "2d")); 
		return salas;
	}
}
