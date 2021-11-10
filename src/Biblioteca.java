import java.util.ArrayList;

class Biblioteca {
    private ArrayList<Publicacion> listadepublicaciones;
    private ArrayList<Prestamo> listadeprestamos;
    
  
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

    
    int cantidadprestamos() {
        return listadeprestamos.size();

    }
    
    void cantidadtotalpublicaciones() {
        int cantpublicaciones = 0;
        for (Publicacion  p : listadepublicaciones ) {
            cantpublicaciones++ ;

        }
        System.out.println("Cantidad de publicaciones: "+cantpublicaciones);
    }
    
    void cantlibrosbiblioteca(){
        int cantidadlibros = 0; 
        int cantidadrevistas = 0;
        for (Publicacion  p : listadepublicaciones ) {
            if (p instanceof Libro) {
               cantidadlibros++;
            }
            else{
                cantidadrevistas++;
            }
            
        }
        System.out.println("cantidad de libros que posee la biblioteca: " + cantidadlibros);
        System.out.println("cantidad de revistas que posee la biblioteca: " + cantidadrevistas);
    }
    
     void listapublicaciones() {
        System.out.println("Listado de publicaciones:");
        for (Publicacion  p : listadepublicaciones ) {
            System.out.println(p.getTitulo());

        }
    }
     
    void listaprestamos(){
        System.out.println("Lista de prestamos:");
        for(Prestamo p : listadeprestamos){
            System.out.println(p);
        }
    }
         
     void listaclientes() {
        for(Prestamo p : listadeprestamos ){
            for(Publicacion publicacion : p.getPublicaciones()){
                if(publicacion instanceof Libro){
                 System.out.println(p.getClientes());     
                }
            }
        }

     }

    void listabarrios() {
        for(Prestamo p : listadeprestamos ){
            for(Publicacion publicacion : p.getPublicaciones()){
            System.out.println(p.getClientes().getDireccion().getBarrio());  
            }
        }
    }
}
