import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int op;
        Boolean continuar = true;

        List<Vehiculo> lstVehiculo = new ArrayList<>();

        do{
            System.out.println("""
                    -------------------------------------------------
                    1. REGISTRAR AUTO
                    2. REGISTRAR MOTOCICLETA
                    3. MOSTRAR LISTA DE VEHICULOS REGISTRADOS
                    4. MOSTRAR INFORMACION DE VEHICULO EN ESPECIFICO
                    5. CALCULAR PRECIO FINAL DE CADA VEHICULO
                    6. SALIR DEL PROGRAMA
                    -------------------------------------------------
                    """);
            op = teclado.nextInt();
            switch(op){
                case 1 ->{

                    Auto automovil = new Auto();

                    System.out.println("SE VA A REGISTRAR UN AUTOMOVIL");
                    System.out.println(" ");

                    teclado.nextLine();

                    System.out.println("INGRESA MARCA DEL AUTOMOVIL");
                    automovil.setMarca(teclado.next());
                    System.out.println("INGRESE MODELO DEL AUTOMOVIL");
                    automovil.setModelo(teclado.next());
                    System.out.println("INGRESE CLASE DEL AUTOMOVIL");
                    automovil.setClase(teclado.next());
                    System.out.println("INGRESE PRECIO BASE DEL AUTOMOVIL");
                    automovil.setPrecio_base(teclado.nextDouble());
                    System.out.println("INGRESE NUMERO DE PUERTAS DEL AUTOMOVIL");
                    automovil.setNpuertas(teclado.nextInt());

                    Auto AutoMovil = new Auto(automovil.getMarca(),automovil.getModelo(), automovil.getClase(), automovil.getPrecio_base(), automovil.getNpuertas());
                    lstVehiculo.add(AutoMovil);
                }
                case 2 ->{
                    Motocicleta moto = new Motocicleta();

                    System.out.println("SE VA A REGISTRAR UNA MOTOCICLETA");
                    System.out.println(" ");

                    teclado.nextLine();

                    System.out.println("INGRESA MARCA DE LA MOTOCICLETA");
                    moto.setMarca(teclado.nextLine());
                    System.out.println("INGRESE MODELO DE LA MOTOCICLETA");
                    moto.setModelo(teclado.nextLine());
                    System.out.println("INGRESE CLASE DE LA MOTOCICLETA");
                    moto.setClase(teclado.nextLine());
                    System.out.println("INGRESE PRECIO BASE DE LA MOTOCICLETA");
                    moto.setPrecio_base(teclado.nextDouble());
                    System.out.println("INGRESE LA CAPACIDAD DEL CILINDRAJE DE LA MOTOCICLETA");
                    moto.setCilindraje(teclado.next());

                    Motocicleta Moto = new Motocicleta(moto.getMarca(),moto.getModelo(),moto.getClase(),moto.getPrecio_base(),moto.getCilindraje());
                    lstVehiculo.add(Moto);

                }
                case 3 -> {
                    if(lstVehiculo.isEmpty()){
                        System.out.println("LA LISTA NO CUENTA CON VEHICULOS REGISTRADOS");
                    }else{
                        System.out.println(lstVehiculo);
                  }
                }
                case 4 -> {
                    String Nvehiculo;
                    System.out.println("INGRESE MODELO DEL VEHICULO");
                    Nvehiculo = teclado.next();
                    for(int i = 0; i < lstVehiculo.size(); i++) {
                        if (lstVehiculo.get(i).getModelo().equalsIgnoreCase(Nvehiculo)) {
                            System.out.println(lstVehiculo.get(i));
                        }
                    }
                }
                case 5 ->{
                    String ModeloV;
                    System.out.println("INGRESE MODELO DEL VEHICULO PARA CALCULAR EL PRECIO FINAL");
                    ModeloV = teclado.next();
                    boolean encontrado = false;

                    for(Vehiculo vehiculo : lstVehiculo){
                        if (vehiculo.getModelo().equalsIgnoreCase(ModeloV))
                        {
                            System.out.println("PRECIO FINAL DEL VEHICULO " + vehiculo.calcularPrecioFinal());
                            encontrado = true;
                            break;
                        }
                    }

                }
                case 6 ->{
                    System.out.println("SALIENDO...");
                    continuar = false;
                }
                default-> {
                    System.out.println("LA OPCION INGRESADA NO EXISTE");
                }
            }
        }while(continuar);
    }
}