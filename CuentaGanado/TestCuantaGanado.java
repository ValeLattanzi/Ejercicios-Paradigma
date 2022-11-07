public class TestCuantaGanado {
    public static void main(String[] args) {
        CuentaGanado cuentaGanado = new CuentaGanado();
        cuentaGanado.Contar();
        System.out.println(cuentaGanado.getCuenta());
        cuentaGanado.bloquear();
        cuentaGanado.Contar();
        System.out.println(cuentaGanado.getCuenta());
        cuentaGanado.bloquear();
        cuentaGanado.Reiniciar();
        System.out.println(cuentaGanado.getCuenta());
        // for (int i = 0; i < 10005; i++){
        //     cuentaGanado.Contar();
        //     System.out.println(cuentaGanado.getCuenta());
        // }
    }
}