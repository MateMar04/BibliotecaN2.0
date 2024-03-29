public class Main {
    public static void main(String[] args) {

        Provincia provincia = new Provincia("Cordoba");

        Localidad localidad = new Localidad("Embalse", provincia);
        Localidad localidad1 = new Localidad("terron", provincia);

        Barrio barrio = new Barrio("Amapolas", localidad);
        Barrio barrio1 = new Barrio("pepe", localidad1);

        Direccion direccion = new Direccion("San Martin", " 143849", barrio);

        Cliente cliente = new Cliente("Ignacio", "84829294127", "ignacio@gmail.com", direccion);

        Autor autor = new Autor("Robert Kiyosaki");
        Autor autor1 = new Autor("La Nacion");
        Autor autor2 = new Autor("Rumbos");
        Autor autor3 = new Autor("César Mallorquí");

        Editorial editorial = new Editorial("Santillana");
        Editorial editorial1 = new Editorial("La Nacion");
        Editorial editorial2 = new Editorial("Rumbos");


        Publicacion libro = new Libro("Padre rico, hijo pobre", editorial, autor);
        Publicacion libro1 = new Libro("La estrategia del parasito", editorial, autor3);
        Publicacion revista = new Revista("La nacion", editorial1, autor1);
        Publicacion revista1 = new Revista("Rumbos", editorial2, autor2);

        Prestamo prestamo = new Prestamo("2/1/2021", "18/8/2021", cliente);
        Prestamo prestamo1 = new Prestamo("1/1/2021", "18/8/2021", cliente);

        prestamo.agregar(libro);
        prestamo.agregar(revista);

        Biblioteca biblioteca = new Biblioteca("biblioteca cordoba");
        biblioteca.agregar(libro);
        biblioteca.agregar(revista);
        biblioteca.agregar(revista1);
        biblioteca.agregar(libro1);
        biblioteca.prestar(prestamo);
        biblioteca.prestar(prestamo1);
        biblioteca.agregarCliente(cliente);

        System.out.println("Cantidad de prestamos: " + biblioteca.cantPrestamos());
        biblioteca.cantLibros();
        biblioteca.cantPublicaciones();
        biblioteca.listaPublicaciones();
        biblioteca.listaPrestamos();

        System.out.println("listado de clientes a los que se les presto uno o mas libros:");
        biblioteca.listaClientes();

        System.out.println("listado de los barrios donde hay prestamos:");
        biblioteca.listaBarrios();

        BibliotecaVentana bibliotecaVentana = new BibliotecaVentana(biblioteca);
        bibliotecaVentana.setVisible(true);
    }
}
