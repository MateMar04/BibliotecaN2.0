class Barrio {
    private final String nombre;
    private final Localidad localidad;

    public Barrio(String nombre, Localidad localidad) {
        this.nombre = nombre;
        this.localidad = localidad;
    }

    public String toString() {
        return nombre + ", localidad = " + localidad;
    }

}
