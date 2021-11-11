import java.util.ArrayList;

class Biblioteca {
    private final ArrayList<Publicacion> listaPublicaciones;
    private final ArrayList<Prestamo> listaPrestamos;
    private final ArrayList<Cliente> listaClientes;


    private final String nombre;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        listaPublicaciones = new ArrayList<>();
        listaPrestamos = new ArrayList<>();
        listaClientes = new ArrayList<>();
    }

    void agregar(Publicacion publicacion) {
        listaPublicaciones.add(publicacion);
    }

    void prestar(Prestamo prestamo) {
        listaPrestamos.add(prestamo);
    }

    void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    int cantPrestamos() {
        return listaPrestamos.size();

    }

    public int cantPublicaciones() {
        int cantpublicaciones = 0;
        for (Publicacion p : listaPublicaciones) {
            cantpublicaciones++;

        }
        return cantpublicaciones;
    }

    public int cantLibros() {
        int cantidadLibros = 0;
        for (Publicacion p : listaPublicaciones) {
            if (p instanceof Libro) {
                cantidadLibros++;
            }
        }
        return cantidadLibros;
    }

    public int cantRevistas() {
        int cantidadRevistas = 0;
        for (Publicacion p : listaPublicaciones) {
            if (p instanceof Revista) {
                cantidadRevistas++;
            }
        }
        return cantidadRevistas;
    }

    void listaPublicaciones() {
        System.out.println("Listado de publicaciones:");
        for (Publicacion p : listaPublicaciones) {
            System.out.println(p.getTitulo());

        }
    }

    void listaPrestamos() {
        System.out.println("Lista de prestamos:");
        for (Prestamo p : listaPrestamos) {
            System.out.println(p);
        }
    }

    void listaClientes() {
        for (Prestamo p : listaPrestamos) {
            for (Publicacion publicacion : p.getPublicaciones()) {
                if (publicacion instanceof Libro) {
                    System.out.println(p.getCliente());
                }
            }
        }

    }

    void listaBarrios() {
        for (Prestamo p : listaPrestamos) {
            for (Publicacion publicacion : p.getPublicaciones()) {
                System.out.println(p.getCliente().getDireccion().getBarrio());
            }
        }
    }

    public ArrayList<Cliente> getClientes(){
        return listaClientes;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return listaPrestamos;
    }
}
