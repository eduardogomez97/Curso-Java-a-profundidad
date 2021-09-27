class EjemploWhile {
    public static void main(String[] args) {
        // Mientras (La  expresion boolean sea verdadera)
        // Se repetirá el bucle
        int x=0;
        while(x<100) {
            System.out.println(x);
            x++;
        }
        System.out.println("Fin de la ejecución");
        // Otra manera de expresarlo sin necesidad de llaves.
        // Imprimir del 1 al 100
        int y=1;
        while(y<=100)
            System.out.println(y++);
        System.out.println("Fin de la ejecución con System.out.println(x++);");
    }
}