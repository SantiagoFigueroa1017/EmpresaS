package empresas;

import empresas.services.DireccionService;
import empresas.services.EmpleadoService;

public class EmpresaS {
    

    public static void main(String[] args) {
        EmpleadoService service = new EmpleadoService();
        service.menu();

        DireccionService direccion = new DireccionService();
        direccion.crear();
    }
    
}