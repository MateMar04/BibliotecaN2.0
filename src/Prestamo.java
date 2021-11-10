import java.util.ArrayList;


public class Prestamo {
    private final String fechainicioprest;
    private final String fetentativadedev;
    private final Cliente cliente;
    private final ArrayList<Publicacion> lista;

    public Prestamo(String fechainicioprest, String fetentativadedev, Cliente cliente) {
        this.fechainicioprest = fechainicioprest;
        this.fetentativadedev = fetentativadedev;
        this.cliente = cliente;
        lista = new ArrayList<>();
    }

    void agregar(Publicacion p) {
        p.incrementarCantPrestamos();
        lista.add(p);
    }


    Cliente getClientes() {
        return cliente;
    }

    public ArrayList<Publicacion> getPublicaciones() {
        return lista;
    }


    public String toString() {
        return "fecha inicio prestamo = " + fechainicioprest + ", fecha caducidad prestamo = " + fetentativadedev + cliente + ", lista=" + lista;
    }


}
