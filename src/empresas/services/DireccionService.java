package empresas.services;

import empresas.models.Direccion;

import java.util.Scanner;

public class DireccionService {

    private Scanner sc;
    private Direccion direccion;


    public DireccionService() {
        sc = new Scanner(System.in);
    }

    public Direccion crear(){
        System.out.println("--CREAR DIRECCION--");

        System.out.println("Ingrese el número de calle");
        String calle = sc.next();

        System.out.println("Ingrese el número de la casa");
        String numeroCasa = sc.next();

        System.out.println("Ingrese el barrio");
        String barrio = sc.next();

        System.out.println("Ingrese la ciudad");
        String ciudad = sc.next();

        System.out.println("Ingrese el codigo Postal");
        String codigoPostal = sc.next();

        Direccion direccion = new Direccion(calle, numeroCasa, barrio, ciudad, codigoPostal);

        return direccion;
    }

}
