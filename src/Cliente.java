class Cliente {
    private final String nombre;
    private final String telefono;
    private final String mail;
    private final Direccion direccion;

    public Cliente(String nombre, String telefono, String mail, Direccion direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.mail = mail;
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }
    
    public String toString() {
        return "Cliente: " +"nombre = "+ nombre + ", telefono = " + telefono + ", mail = " + mail + ", direccion = " + direccion ;
    }
    
}
