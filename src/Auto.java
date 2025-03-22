public class Auto extends Vehiculo {

    private int Npuertas = 0;

    public Auto(){

    }

    public Auto(int npuertas) {
        Npuertas = npuertas;
    }

    public Auto(String marca, String modelo, String clase, double precio_base, int npuertas) {
        super(marca, modelo, clase, precio_base);
        this.Npuertas = npuertas;
    }

    public int getNpuertas() {
        return Npuertas;
    }

    public void setNpuertas(int npuertas) {
        Npuertas = npuertas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Auto{" +
                "Npuertas=" + Npuertas +
                '}';

    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("NUMERO DE PUERTAS " + Npuertas);
    }

    @Override
    public double calcularPrecioFinal() {

        double impuesto = (precio_base * 10) / 100;
        return impuesto + precio_base;
    }
}

