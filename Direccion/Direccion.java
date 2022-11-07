package Direccion;

public class Direccion {

    //region Variables De Instancia
    private String calle;
    private String numero;
    private String localidad;
    private String codigoPostal;
    //endregion

    //region Constructores
    public Direccion() {
    }

    public Direccion(String calle, String numero, String localidad, String codigoPostal) {
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
        this.codigoPostal = codigoPostal;
    }
    //endregion 

    //region Getters&Setters
    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getLocalidad() {
        return localidad;
    }
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    public String getCodigoPostal() {
        return codigoPostal;
    }
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    //endregion

    //region toString
    public String toString() {
        return "[" + this.getClass().getName() + ": (Calle = " + getCalle() + "); (Numero = " +
        getNumero() + "); (Localidad = " + getLocalidad() + "); (Codigo Postal = " + getCodigoPostal() + ")]";
    }
    //endregion

}