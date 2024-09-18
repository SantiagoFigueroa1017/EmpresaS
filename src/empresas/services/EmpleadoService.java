package empresas.services;

import empresas.models.Direccion;
import empresas.models.Empleado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EmpleadoService {

    private Scanner sc;
    private Empleado empleado;
    private HashMap<String, Empleado> listaEmpleados;
    private DireccionService direccionService;
    private Direccion direccion;

    public EmpleadoService() {
        sc = new Scanner(System.in);
        listaEmpleados = new HashMap<>();
        direccionService = new DireccionService();
    }


    public void menu() {
        int opcion;
        do {
            System.out.println("::MENU:: = ");
            System.out.println("1 - CREAR EMPLEADO");
            System.out.println("2 - MODIFICAR EMPLEADO");
            System.out.println("3 - BUSCAR EMPLEADO");
            System.out.println("4 - LISTAR EMPLEADOS");
            System.out.println("5 - ELIMINAR EMPLEADOS");
            System.out.println("0 - SALIR");
            System.out.println("Ingrese una opcion del menu");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    crearEmpleado();
                    break;
                case 2:
                    modificarEmpleado();
                    break;
                case 3:
                    buscarEmpleado();
                    break;
                case 4:
                    listarEmpleados();
                    break;
                case 5:
                    eliminarEmpleado();
                    break;
                default:
                    opcion = 0;
                    System.out.println("Gracias por usar este menu");
            }
        } while (opcion != 0);
    }

    private void crearEmpleado() {
        System.out.println("::CREAR EMPLEADOS::");

        System.out.println("::CREAR EMPLEADO::");

        System.out.println("Ingrese el documento del empleado");
        String documento;
        do {
            documento = sc.next();
        } while (documentoExistente(documento));

        System.out.println("Ingrese el nombre del empleado");
        String nombre = sc.next();

        System.out.println("Ingrese el numero de horas trabajadas");
        int horas = sc.nextInt();

        System.out.println("Ingrese el valor de la hora");
        double valor = sc.nextDouble();

        direccion = direccionService.crear();


        listaEmpleados.put(documento, new Empleado(documento, nombre, horas, valor, calcularSueldo(horas, valor), direccion));

    }

    private void modificarEmpleado() {
        empleado = buscarEmpleado();

        if(empleado != null){
            System.out.println("::MODIFICAR EMPLEADO::");

            System.out.println("Ingrese el nombre del empleado");
            String nombre = sc.next();
            empleado.setNombre(nombre);

            System.out.println("Ingrese el numero de horas");
            int horas = sc.nextInt();
            empleado.setHorasTrab(horas);

            System.out.println("Ingrese el valor de la hora");
            double valor = sc.nextDouble();
            empleado.setValorHora(valor);

            empleado.setSueldo(calcularSueldo(horas, valor));
            listaEmpleados.put(empleado.getDocumento(), empleado);
        }else {
            System.out.println("No se encontró el empleado buscado");
        }


    }

    private Empleado buscarEmpleado() {
        System.out.println("::Buscar empleado::");
        System.out.println("Ingrese el numero de documento del empleado");
        String documento = sc.next();


        return listaEmpleados.get(documento);
    }

    private void listarEmpleados() {
        System.out.println("::Listar empleados::");
        for (String documento : listaEmpleados.keySet()) {
            Empleado empleado = listaEmpleados.get(documento);
            imprimirEmpleado(empleado);
        }
    }

    private double calcularSueldo(int horas, double valorHora) {
        return horas * valorHora;
    }

    private void imprimirEmpleado(Empleado empleado) {
        System.out.println(empleado.getDocumento() + " | " + empleado.getNombre() + " | "
                + empleado.getSueldo() + " | " + empleado.getDireccion());

    }

    private boolean documentoExistente(String documento) {
        for (String clave : listaEmpleados.keySet()) {
            Empleado empleado = listaEmpleados.get(clave);
            if (empleado != null && empleado.getDocumento().equals(documento)) {
                System.out.println("El documento ya existe, Ingrese un documento diferente");
                return true;
            }
        }
        return false;

    }

    private void eliminarEmpleado() {

        System.out.println("Buscar Empleado a eliminar");
        empleado = buscarEmpleado();

        if (empleado != null) {
            listaEmpleados.remove(empleado.getDocumento());
            System.out.println("El empleado ha sido eliminado");
        }else {
            System.out.println("::El empleado no existe::");
        }
    }

}
