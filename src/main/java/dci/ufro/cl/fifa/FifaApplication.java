package dci.ufro.cl.fifa;

import dci.ufro.cl.fifa.controladorArchivo.ManejoArchivo;
import dci.ufro.cl.fifa.model.Jugador;
import dci.ufro.cl.fifa.model.ListaJugador;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FifaApplication {

	public static void main(String[] args) {


		ListaJugador.agregarJugadores();
		SpringApplication.run(FifaApplication.class, args);

	}

}
