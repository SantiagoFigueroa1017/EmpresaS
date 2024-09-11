package empresas;

import empresas.services.EmpleadoService;

public class EmpresaS {
    

    public static void main(String[] args) {
        EmpleadoService service = new EmpleadoService();
        service.menu();
    }
    
}