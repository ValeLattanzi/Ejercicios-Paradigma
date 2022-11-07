public class CuentaGanado {
    private int cuenta;
    private boolean bloqueado;

    public CuentaGanado() { 
        this.cuenta = 0;
        this.bloqueado = false;
    }

    //region Atributos
    public int getCuenta() {
        return this.cuenta;
    }
    //endregion

    //#region Responsabilidades

    /**
     * Establece el contador en 0
     * @return int
     */
    public int Reiniciar() {
        this.cuenta = 0;
        return this.cuenta;
    }
    public int Contar() {
        if (!estaBloqueado()) {
            if (this.cuenta == 9999) {
                Reiniciar();
            }
            else {
                this.cuenta += 1;
            }
            return this.cuenta;
        }
        else {
            return this.cuenta;
        }
    }

    public boolean bloquear() {
        return this.bloqueado = !this.bloqueado;
    }
 
    public boolean estaBloqueado() {
        return this.bloqueado;
    }

    //#endregion
    
}