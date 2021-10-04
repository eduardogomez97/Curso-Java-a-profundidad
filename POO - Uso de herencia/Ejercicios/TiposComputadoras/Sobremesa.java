package TiposComputadoras;

public class Sobremesa extends Computadora {
    boolean refrigeracionLiquida;
    boolean perifericos;

    Sobremesa(){
        super();
        System.out.println("Batería: agotada");
        System.out.println("Trackpad: Rii K18 Plus");
        System.out.println("Cargador: No incluido");
    }
    Sobremesa(boolean refrigeracionLiquida, boolean perifericos,String procesador,int ram, int discoduro, char tipo){
        super(procesador, ram, discoduro, tipo);
        this.refrigeracionLiquida = refrigeracionLiquida;
        this.perifericos = perifericos;
    }
    @Override
    void Encender(){
        super.Encender();
        super.MostrarConfiguracion();
        if (refrigeracionLiquida){
            System.out.println("Refrigeración líquida incluida");
        }
        if (perifericos){
            System.out.println("Perifericos incluidos");
        } 

    }
    @Override 
    void presupuesto(){
        super.presupuesto();
        double presupuesto = 800;
        if(refrigeracionLiquida){
            presupuesto+=75;
        } 
        if(perifericos){
            presupuesto+=55;
        }
        System.out.println(presupuesto+"€");
    }
}
