package TiposComputadoras;

public class CalculaPC {
    public static void main(String[] args) {
        Portatil p1 = new Portatil(true, "TrackPad Pro", true, "i5", 4, 260, 'p' );
        p1.Encender();
        p1.presupuesto();
        p1.Apagar();

        Sobremesa m1 = new Sobremesa(true,true, "i9", 64, 2024, 'm');
        m1.Encender();
        m1.presupuesto();
        m1.Apagar();

    }
}
