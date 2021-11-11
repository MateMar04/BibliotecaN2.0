import java.util.ArrayList;

class Biblioteca {
    private final ArrayList<Publicacion> listadepublicaciones;
    private final ArrayList<Prestamo> listadeprestamos;


    private final String nombre;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        listadepublicaciones = new ArrayList<>();
        listadeprestamos = new ArrayList<>();
    }

    void agregar(Publicacion publicacion) {
        listadepublicaciones.add(publicacion);
    }

    void prestar(Prestamo publicacion) {
        listadeprestamos.add(publicacion);
    }


    int cantPrestamos() {
        return listadeprestamos.size();

    }

    public int cantPublicaciones() {
        int cantpublicaciones = 0;
        for (Publicacion p : listadepublicaciones) {
            cantpublicaciones++;

        }
        return cantpublicaciones;
    }

    public int cantLibros() {
        int cantidadLibros = 0;
        for (Publicacion p : listadepublicaciones) {
            if (p instanceof Libro) {
                cantidadLibros++;
            }
        }
        return cantidadLibros;
    }

    public int cantRevistas() {
        int cantidadRevistas = 0;
        for (Publicacion p : listadepublicaciones) {
            if (p instanceof Revista) {
                cantidadRevistas++;
            }
        }
        return cantidadRevistas;
    }

    void listaPublicaciones() {
        System.out.println("Listado de publicaciones:");
        for (Publicacion p : listadepublicaciones) {
            System.out.println(p.getTitulo());

        }
    }

    void listaPrestamos() {
        System.out.println("Lista de prestamos:");
        for (Prestamo p : listadeprestamos) {
            System.out.println(p);
        }
    }

    void listaClientes() {
        for (Prestamo p : listadeprestamos) {
            for (Publicacion publicacion : p.getPublicaciones()) {
                if (publicacion instanceof Libro) {
                    System.out.println(p.getClientes());
                }
            }
        }

    }

    void listaBarrios() {
        for (Prestamo p : listadeprestamos) {
            for (Publicacion publicacion : p.getPublicaciones()) {
                System.out.println(p.getClientes().getDireccion().getBarrio());
            }
        }
    }
}
