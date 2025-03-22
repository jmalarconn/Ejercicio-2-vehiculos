public class Motocicleta extends Vehiculo {

    private String cilindraje;

    public Motocicleta(){

    }
    public Motocicleta(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public Motocicleta(String marca, String modelo, String clase, double precio_base, String cilindraje) {
        super(marca, modelo, clase, precio_base);
        this.cilindraje = cilindraje;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Motocicleta{" +
                "cilindraje='" + cilindraje + '\'' +
                '}';
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("CILINDRAJE " + cilindraje);
    }

    @Override
    public double calcularPrecioFinal() {

        double impuesto = (precio_base * 10) / 100;
        return impuesto + precio_base;
    }
}
