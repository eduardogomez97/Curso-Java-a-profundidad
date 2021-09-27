class EjemploDoWhile {
    public static void main(String[] args) {
        /*Al menos ejecuta una vez el do
        a diferencia del while que no 
        ejecuta nada si no se cumple la condicón*/
        int x=1;
        do {
            System.out.println(x);
            x++;
        } while(x<=100) ;
            System.out.println("Fin de la ejecución");
    }
}