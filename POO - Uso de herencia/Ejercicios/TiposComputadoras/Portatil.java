package TiposComputadoras;

public class Portatil extends Computadora{
    boolean bateria;
    String trackpad;
    boolean cargador;

    Portatil(){
        super();
        System.out.println("Batería: agotada");
        System.out.println("Trackpad: Rii K18 Plus");
        System.out.println("Cargador: No incluido");
    }
    Portatil(boolean bateria, String procesador,int ram, int discoduro, char tipo){
        super(procesador, ram, discoduro, tipo);
        this.bateria = bateria;
    }
    Portatil(boolean bateria, String trackpad, boolean cargador, String procesador,int ram, int discoduro, char tipo){
        super(procesador, ram, discoduro, tipo);
        this.bateria = bateria;
        this.trackpad = trackpad;
        this.cargador = cargador;
    }

    @Override
    void MostrarConfiguracion(){
        super.MostrarConfiguracion();
        System.out.println("Trackpad: "+trackpad);
        if (cargador){
            System.out.print("Cargador Incluido");
        } else {
            System.out.println("");
        }
    }
    @Override
    void Encender() {
        super.Encender();
        if(bateria){
            System.out.println("Ha podido iniciar sesión. Ahora mostrará su configuración.");
            MostrarConfiguracion();
        } else {
            System.out.println("BATERÍA INSUFICIENTE. CONECTE EL CARGADOR");
        }
        
    }
    
    @Override 
    void presupuesto(){
        super.presupuesto();
        double presupuesto = 600;
        if(cargador){
            presupuesto+=35;
        }
        System.out.println(presupuesto+"€");
    }
}
