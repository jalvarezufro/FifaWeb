package dci.ufro.cl.fifa.model;

public class Jugador {

	private String fotografia;
	private String nombre;
	private String nacionalidad;
	private int rating;
	private int edad;
	private String club;
	private int potencial;
	private int velocidad;
	private int controlBalon;
	private int agilidad;
	private int resistencia;

    public Jugador(String fotografia, String nombre, String nacionalidad, int rating, int edad, String club, int potencial, int velocidad, int controlBalon, int agilidad, int resistencia) {
        this.fotografia = fotografia;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.rating = rating;
        this.edad = edad;
        this.club = club;
        this.potencial = potencial;
        this.velocidad = velocidad;
        this.controlBalon = controlBalon;
        this.agilidad = agilidad;
        this.resistencia = resistencia;
    }

    /**
	 * 
	 * @param fotografia
	 * @param nombre
	 * @param nacionalidad
	 * @param rating
	 * @param edad
	 * @param club
	 * @param potencial
	 * @param velocidad
	 * @param controlBalon
	 * @param agilidad
	 * @param resistencia
	 */



    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getPotencial() {
        return potencial;
    }

    public void setPotencial(int potencial) {
        this.potencial = potencial;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getControlBalon() {
        return controlBalon;
    }

    public void setControlBalon(int controlBalon) {
        this.controlBalon = controlBalon;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public String toString() {



        String mostrar = "Nombre = " + getNombre() + "   Edad = "+getEdad()+"   Foto = " + getFotografia() + "   Nacionalidad = " + getNacionalidad() + "   Club = " + getClub();

       return mostrar;
    }
    public static void mostrarMessi(){
        ListaJugador.getListaJugadores().get(0).toString();
    }
}