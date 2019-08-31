package dci.ufro.cl.fifa.model;

import dci.ufro.cl.fifa.controladorArchivo.ManejoArchivo;

import java.util.ArrayList;

public class ListaJugador {

    public static ArrayList<Jugador> listaJugadores = new ArrayList<>();

    public static ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public static void agregarJugadores(){
    String jugadoresTotal= ManejoArchivo.readFile("data.csv");

    String jugadoresSep[] = ManejoArchivo.separarLineas(jugadoresTotal);


    for(int i=1;i<jugadoresSep.length;i++){
        String datosPlayer[] = ManejoArchivo.separarComas(jugadoresSep[i]);

if(datosPlayer.length>20) {
    String fotografia = datosPlayer[4];
    String nombre = datosPlayer[2];
    String nacionalidad = datosPlayer[5];
    int rating = Integer.parseInt(datosPlayer[7].trim());
    int edad = Integer.parseInt(datosPlayer[3].trim());
    String club = datosPlayer[9];
    int potencial = Integer.parseInt(datosPlayer[8].trim());
    int velocidad = Integer.parseInt(datosPlayer[65].trim());
    int controlBalon = Integer.parseInt(datosPlayer[63]);
    int agilidad = Integer.parseInt(datosPlayer[66].trim());
    int resistencia = Integer.parseInt(datosPlayer[71]);

    listaJugadores.add(new Jugador(fotografia, nombre, nacionalidad, rating, edad, club, potencial, velocidad, controlBalon, agilidad, resistencia));
} else {
    String fotografia = datosPlayer[4];
    String nombre = datosPlayer[2];
    String nacionalidad = datosPlayer[5];
    int rating = Integer.parseInt(datosPlayer[7].trim());
    int edad = Integer.parseInt(datosPlayer[3].trim());
    String club = datosPlayer[9];
    int potencial = Integer.parseInt(datosPlayer[8].trim());
    listaJugadores.add(new Jugador(fotografia, nombre, nacionalidad, rating, edad, club, potencial, -1, -1, -1, -1));


}


    }


}
public static void mostrarArray(){
    for(int i=0;i<100;i++){
        System.out.println(listaJugadores.get(i).toString());
    }
}


}
