package Auto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Auto {

    //Atribuetos privados
    private String marca;
    private String modelo;
    private int año;
    private double precio;

    public Auto(String marca, String modelo, int año, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
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

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String mostrarDatos() {
        return "Auto{" + "marca=" + marca + ", modelo=" + modelo + ", a\u00f1o=" + año + ", precio=" + precio + '}';
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Auto> autos = new ArrayList<>();
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("\n1. Agregar automovil");
            System.out.println("2. Mostrar lista automoviles");
            System.out.println("3. Salir");
            System.out.println("\n Ingrese una opción");
            opcion = entrada.nextInt();

            switch (opcion) {

                case 1: //Agregar el automovil
                    System.out.println("\n Ingrese la marca: ");
                    String marca = entrada.next();
                    System.out.println("\n Ingrese el modelo: ");
                    String modelo = entrada.next();
                    System.out.println("\n Ingrese el año");
                    int año = entrada.nextInt();
                    System.out.println("\n Ingrese el precio: ");
                    double precio = entrada.nextDouble();

                    Auto auto = new Auto(marca, modelo, año, precio);
                    autos.add(auto);
                    break;

                case 2://Mostrar la lista 
                    //recorrer la lista dinamica con un for each
                    for (Auto i : autos) {
                        System.out.println(i.mostrarDatos());
                    }
                    break;

                case 3://salir
                    System.out.println("Hasta la proxima");
                    break;

                default:
                    System.out.println("Opción invalida");
                    break;
            }
        }
    }

}
