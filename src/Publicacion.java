public abstract class Publicacion {
    private int cantidadeprestamos;
    private final String titulo;

    public Publicacion (String nombre){
        this.titulo = nombre;
    }

    public void incrementarCantiPrestamos(){
        cantidadeprestamos++;
        
    }

    public String getTitulo() {
        return titulo;
    }
    
    

    public String toString() {
        return "Publicacion" + titulo +"cantidadeprestamos = " + cantidadeprestamos;
    }

}
