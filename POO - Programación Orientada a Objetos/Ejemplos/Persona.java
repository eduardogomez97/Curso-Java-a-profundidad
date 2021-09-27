class Persona{
    //Atributos
    String nombre;
    int edad;
    char genero;

    //Constructor por defecto
    Persona(){
        //Si creamos otro constructor java entiende que lo rechazas.
        //Si queremos mantenerlo tenemos que tenerlo definido
        this("Nombre defecto",32,'M'); // Puedes llamar a un constructor desde otro. 
        //Invoca al contructor que reciba esta cantidad de parámetros.
        // REGLA IMPORTANTE: SE DEBE COLOCAR EN LA PRIMERA LÍNEA
        System.out.println("Constructor por defecto");
    }
    //Constructor
    Persona(String n, int ed, char genero){
        nombre=n;
        edad=ed;
        this.genero=genero; 
        //Remover ambiguedades
            //Si tiene el mismo nombre el parámetro y la clase java se confunde
            // Domina el parámtro con un scope menor. Se puede solucionar con la palabra reservada this.
    }

    //Metodos
    void imprimirImformacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Género: "+genero);
    }
    void jugarVideojuegos(Persona p){
        System.out.println(nombre+" esta jugando con "+p.nombre);
    }
    public static void main(String[] args) {
        Persona p= new Persona("Edu",24,'M');
        p.imprimirImformacion();

        System.out.println("");

        Persona p1= new Persona("Juan", 34,'M');
        p1.imprimirImformacion();

        System.out.println("");

        new Persona().imprimirImformacion();

        System.out.println("");
        
        p.jugarVideojuegos(p1);


    }
}