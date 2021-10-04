package TiposComputadoras;

public class Computadora{
    String procesador;
    int ram;
    int discoduro;
    char tipo;

    public Computadora() {
        System.out.println("Los datos del equipo están vacios.");
        System.out.println("Por lo tanto trae las caracteristicas por defecto: ");
        System.out.println("Procesador: i3");
        System.out.println("RAM: 2GB");
        System.out.println("Disco duro: 260GB");
    }
    public Computadora(String procesador,int ram, int discoduro, char tipo) {
        this.procesador = procesador;
        this.ram = ram;
        this.discoduro = discoduro;
        this.tipo = tipo;
    }
    void MostrarConfiguracion(){
        System.out.println("Procesador: "+procesador);
        System.out.println("RAM: "+ram);
        System.out.println("Disco duro: "+discoduro);
    }
    void Encender(){
        System.out.print("Estoy encendiendo mi computadora: ");
        switch (tipo) {
            case 'p':
                System.out.print("portatil\n");
                break;
            case 'm':
                System.out.print("sobre mesa\n");
                break;
            default:
                System.out.print("\nl");
                break;
        }
    }
    void presupuesto(){
        System.out.println("Este equipo te saldría por: ");
    }
    void Apagar() {
        System.out.println("Equipo apagado.");
        System.out.println("");
    }
    
}