public class Main {


    public static void main(String[] args) {
        Provincia provincia = new Provincia("Cordoba");
        Localidad localidad = new Localidad("Embalse", provincia);
        Localidad localidad1 = new Localidad("terron", provincia);
        Barrio barrio = new Barrio("Amapolas", localidad);
        Barrio barrio1 = new Barrio("pepe", localidad1);
        Direccion direccion = new Direccion("San Martin", " 143849", barrio);
        Cliente cliente = new Cliente("ignacio", "84829294127", "ignacio@gmail.com", direccion);
        Autor autor = new Autor("Robert Kiyosaki");
        Editorial editorial = new Editorial("santillana");
        Publicacion libro = new Libro("padre rico, hijo pobre");
        Publicacion revista = new Revista("la nacion");
        Prestamo prestamo = new Prestamo("2/1/2021", "18/8/2021", cliente);
        prestamo.agregar(libro);
        Biblioteca biblioteca = new Biblioteca("biblioteca cordoba");
        biblioteca.agregar(libro);
        biblioteca.agregar(revista);
        biblioteca.prestar(prestamo);
        System.out.println("Cantidad de prestamos: " + biblioteca.cantidadprestamos());
        biblioteca.cantlibrosbiblioteca();
        biblioteca.cantidadtotalpublicaciones();  
        biblioteca.listapublicaciones();        
        biblioteca.listaprestamos();
        System.out.println("listado de clientes a los que se les presto uno o mas libros:");
        biblioteca.listaclientes();
        System.out.println("listado de los barrios donde hay prestamos:");
        biblioteca.listabarrios();
    }
}
