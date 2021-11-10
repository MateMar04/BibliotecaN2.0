class Barrio {
    private String nombre;
    private Localidad localidad;
    
    public Barrio(String nombre, Localidad localidad) {
        this.nombre = nombre;
        this.localidad = localidad;
    }
    
     public String toString() {
        return nombre + ", localidad = " + localidad;
    }
    
}
