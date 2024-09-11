package empresas.models;

public class Empleado {
    private String documento;
    private String nombreEmp;
    private int horasTrab;
    private double valorHora;
    private double sueldo;

    public Empleado() {
        this.documento = "";
        this.nombreEmp = "No definido";
        this.horasTrab= 0;
        this.valorHora = 0.0;
        this.sueldo= 0.0;
    }

    public Empleado(String documento, String nombreEmp, int horasTrab, 
            double valorHora, double sueldo) {
        this.documento = documento;
        this.nombreEmp = nombreEmp;
        this.horasTrab = horasTrab;
        this.valorHora = valorHora;
        this.sueldo = sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setNombre(String nombre){
        this.nombreEmp = nombre;
    }
    
    public void setHorasTrab(int horas){
        this.horasTrab = horas;
    }
    
    public void setValorHora(double valor){
        this.valorHora = valor;
    }
    
    
    public String getNombre(){
        return this.nombreEmp;
    }
    
    public double getSueldo (){
        return this.sueldo;
    }

    public String getDocumento() {
        return documento;
    }
    
}