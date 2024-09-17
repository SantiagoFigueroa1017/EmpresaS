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
        System.out.println("ingrese numero de calle");
        System.out.println("ingrese numero de casa");


    }

    public String visualizar(){

    }

}
