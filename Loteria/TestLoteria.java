package Loteria;

public class TestLoteria {
    public static void main(String[] args) {
        Loteria loteria = new Loteria();
        System.out.println(loteria);
        while (loteria.hayPremiosPendientes()) {
            loteria.sortear();
            System.out.println(loteria.toString());
        }
        System.out.println(loteria.getPremio(1));
    }
}