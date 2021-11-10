class Localidad {
    private final String nombre;
    private final Provincia provincia;

    public Localidad(String nombre, Provincia prov) {
        this.nombre = nombre;
        this.provincia = prov;
    }
    
    public String toString() {
        return nombre + ", prov = " + provincia;
    }
    
}
