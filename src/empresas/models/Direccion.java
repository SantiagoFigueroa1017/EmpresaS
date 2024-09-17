package empresas.models;

public class Direccion {

    private String calle;
    private String numeroCasa;
    private String barrio;
    private String ciudad;
    private String codigoPostal;

    public Direccion() {
        this.calle = "";
        this.numeroCasa = "";
        this.barrio = "";
        this.ciudad = "";
        this.codigoPostal = "";
    }

    public Direccion(String calle, String numeroCasa, String barrio, String ciudad, String codigoPostal) {
        this.calle = calle;
        this.numeroCasa = numeroCasa;
        this.barrio = barrio;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "calle='" + calle + '\'' +
                ", numeroCasa='" + numeroCasa + '\'' +
                ", barrio='" + barrio + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                '}';
    }

}
