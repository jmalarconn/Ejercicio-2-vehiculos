public class Vehiculo {
    private String marca;
    private String modelo;
    private String clase;
    protected double precio_base;

    public Vehiculo (){

    }
    public Vehiculo(String marca, String modelo, String clase, double precio_base) {
        this.marca = marca;
        this.modelo = modelo;
        this.clase = clase;
        this.precio_base = precio_base;


    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public double getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(double precio_base) {
        this.precio_base = precio_base;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", clase='" + clase + '\'' +
                ", precio_base=" + precio_base +
                '}';
    }
    public void mostrarInformacion(){
        System.out.println("MARCA " + marca);
        System.out.println("MODELO " + modelo);
        System.out.println("CLASE " + clase);
        System.out.println("PRECIO BASE " + precio_base);

    }

    public double calcularPrecioFinal() {
        return precio_base;
    }
}
