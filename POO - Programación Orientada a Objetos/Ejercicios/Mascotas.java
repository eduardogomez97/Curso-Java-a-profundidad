class Mascotas {
    
    static class Caballo{
        String nombre;
        int edad;
        String raza;
        String color;
        String crin;
        char sexo;
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
            System.out.println("Nombre: "+nombre);
            System.out.println("Edad: "+edad);
            System.out.println("Raza: "+raza);
            System.out.println("Color: "+color);
            System.out.println("Crin: "+crin);
            System.out.println("Sexo: "+sexo);
        }
        void mostrarCaballoPuraSangre(){
            mostrarCaballo();
            System.out.println("Es pura sangre");

        }
    }
    static class Perro{
        String nombre;
        int edad;
        String raza;
        String color;
        char sexo;
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

        void mostrarPerro(){
            System.out.println("Nombre: "+nombre);
            System.out.println("Edad: "+edad);
            System.out.println("Raza: "+raza);
            System.out.println("Color: "+color);
            System.out.println("Sexo: "+sexo);
        }
        void mostrarPerroPeligro(){
            mostrarPerro();
            System.out.println("Es peligroso.");

        }
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
        p.mostrarPerro();
        System.out.println(c.nombre+" domina en los juegos a "+p.nombre);
    }
    static void perroDomina(Caballo c, Perro p){
        c.mostrarCaballo();
        System.out.println("");
        p.mostrarPerroPeligro();
        System.out.println(p.nombre+" domina en los juegos a "+c.nombre);
    }
    public static void main(String[] args) {
        boolean espuro = false;
        boolean espeligro = true;
        Caballo c1= new Mascotas.Caballo("Spirit",6,"Frisón","Negro","Trenzada",'M',espuro);
        Perro p1= new Mascotas.Perro("Jacky",3,"Rottweiler","Blanco",'M',espeligro);
        if(espuro && espeligro){
            Mascotas.relacionBuena(c1,p1);
        } else if(espuro && !espeligro){
            Mascotas.caballoDomina(c1,p1);
        } else if(!espuro && espeligro) {
            Mascotas.perroDomina(c1,p1);
        } else {
            System.out.println("");
            System.out.println("Ninguno domina y juegan tranquilamente.");
        }
    }
}

