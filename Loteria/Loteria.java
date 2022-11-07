package Loteria;

import Loteria.Bolillero.Model.Bolillero;

public class Loteria {

    private Bolillero unidad;
    private Bolillero decena;
    private Bolillero centena;
    private Bolillero millares;
    private BolilleroPremio premio;
    private String[] listOf_ValoresPremios;
    
    public Loteria() {
        inicializarObjetos();
    }

    //region Atributos
    public Bolillero getUnidad() {
        return unidad;
    }

    public Bolillero getDecena() {
        return decena;
    }

    public Bolillero getCentena() {
        return centena;
    }

    public Bolillero getMillares() {
        return millares;
    }

    public BolilleroPremio getPremio() {
        return premio;
    }
    //endregion

    //region Metodos

    //region Procedimientos
    private void inicializarObjetos() {
        this.unidad = new Bolillero();
        this.decena = new Bolillero();
        this.centena = new Bolillero();
        this.millares = new Bolillero();
        this.premio = new BolilleroPremio();
        this.listOf_ValoresPremios = new String[20];

        for (int i = 0; i < 20; i++) {
            listOf_ValoresPremios[i] = "----";
        }
    }

    public void sortear() {
        // Verifica que haya bolillas
        if (premio.tieneBolilla()) {
            // 1.- Obtiene los valores de cada digito
            unidad.rodarBolillero();
            decena.rodarBolillero();
            centena.rodarBolillero();
            millares.rodarBolillero();
            // 2.- Asociar el numero obtenido conformado por las variables anteriormente ->
            // asignadas con un numero de premio
            premio.sortear();
            listOf_ValoresPremios[premio.getValor() - 1] = obtenerNumero();
        }
    }
    //endregion
    
    //region Funciones

    /**
     * Otorga valores a unidad, decena, centena y millares
     */
    // Devuelve el número que ganó el premio
    public String getPremio(int numero) {
        return "El primer premio es: " + listOf_ValoresPremios[numero - 1];
    }

    @Override
    public String toString() {
        String outPrint = "-------------------";
        for (int i = 0; i < listOf_ValoresPremios.length; i++) {
            outPrint += "\n\r" + ((i+1)<10?"0"+(i+1):(i+1)) + ": " + listOf_ValoresPremios[i];
        }
        return outPrint;
    }

    private String obtenerNumero() {
        return getMillares().getValor() + getCentena().getValor() +
         getDecena().getValor() + getUnidad().getValor();
    }

    /**
     * Pregunta al Bolilero Premio si aún hay numeros que sortear
     * @return boolean
     */
    public boolean hayPremiosPendientes() {
        return premio.tieneBolilla();
    }
    //endregion
    
    //endregion

}