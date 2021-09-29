class Animal {
    String nombre;
    int edad;
    String raza;
    String color;
    char sexo;

    public void mostrarAnimal(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Raza: "+raza);
        System.out.println("Color: "+color);
        System.out.println("Sexo: "+sexo);
    }
    static void relacionBuena(Caballo c, Perro p){
        c.mostrarCaballoPuraSangre();
        System.out.println("");
        p.mostrarPerroPeligro();   
        System.out.println("Ambos intentan dominarse y ganar terreno");
    }
    static void caballoDomina(Caballo c, Perro p){
        c.mostrarCaballoPuraSangre();
        System.out.println("");
        p.mostrarAnimal();
        System.out.println(c.nombre+" domina en los juegos a "+p.nombre);
    }
    static void perroDomina(Caballo c, Perro p){
        c.mostrarCaballo();
        System.out.println("");
        p.mostrarPerroPeligro();
        System.out.println(p.nombre+" domina en los juegos a "+c.nombre);
    }
}
class Caballo extends Animal {
    String crin;
    boolean purasangre;

    Caballo(){
        System.out.println("Campos de datos vacío.");
    }
    Caballo(String n, int ed, String r, String clr, String crn, char s, boolean pr){
        nombre=n;
        edad=ed;
        raza=r;
        color=clr;
        crin=crn;
        sexo=s;
        purasangre=pr;
    }

    void mostrarCaballo(){
        mostrarAnimal();
        System.out.println("Crin: "+crin);
    }
    void mostrarCaballoPuraSangre(){
        mostrarCaballo();
        System.out.println("Es pura sangre");

    }
}
class Perro extends Animal{

    boolean peligro;

    Perro(){
        System.out.println("Campo de datos vacío.");
    }

    Perro(String n, int ed, String r, String clr, char s, boolean pr){
        nombre=n;
        edad=ed;
        raza=r;
        color=clr;
        sexo=s;
        peligro=pr;
    }

    
    void mostrarPerroPeligro(){
        mostrarAnimal();
        System.out.println("Es peligroso.");

    }
}
public class MascotasMejorado {
    public static void main(String[] args) {
        boolean espuro = true;
        boolean espeligro = true;
        Caballo c1= new Caballo("Spirit",6,"Frisón","Negro","Trenzada",'M',espuro);
        Perro p1= new Perro("Jacky",3,"Rottweiler","Blanco",'M',espeligro);
        if(espuro && espeligro){
            Animal.relacionBuena(c1,p1);
        } else if(espuro && !espeligro){
            Animal.caballoDomina(c1,p1);
        } else if(!espuro && espeligro) {
            Animal.perroDomina(c1,p1);
        } else {
            System.out.println("");
            System.out.println("Ninguno domina y juegan tranquilamente.");
        }
    }
}