public abstract class Publicacion {
    private int cantidadeprestamos;
    private final String titulo;
    private final Autor autor;
    private final Editorial editorial;

    public Publicacion(String nombre, Editorial editorial, Autor autor) {
        this.titulo = nombre;
        this.autor = autor;
        this.editorial = editorial;
    }

    public void incrementarCantPrestamos() {
        cantidadeprestamos++;
    }

    public String getTitulo() {
        return titulo;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public Autor getAutor() {
        return autor;
    }

    public String toString() {
        return "Publicacion" + titulo + "cantidadeprestamos = " + cantidadeprestamos;
    }

}
