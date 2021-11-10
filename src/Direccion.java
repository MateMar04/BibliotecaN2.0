class Direccion {
    private final String calle;
    private final Barrio barrio;
    private final String numero;


    public Direccion(String calle, String numero, Barrio barrio) {
        this.calle = calle;
        this.numero = numero;
        this.barrio = barrio;
    }

    public String toString() {
        return "calle: " + calle + ", barrio = " + barrio + ", numero = " + numero;
    }

    public Barrio getBarrio() {
        return barrio;
    }


}
