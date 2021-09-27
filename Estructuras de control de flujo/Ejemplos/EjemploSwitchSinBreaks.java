class EjemploSwitchSinBreaks {
    public static void main(String[] args) {
        int opcion=3;
        switch (opcion) {
            // Se pueden tener varios casos que hagan lo mismo 
            // y la syntaxis es así
            case 0:
            case 1:
            case 2:
                System.out.println("Opción 0, 1 y 2");
                break;
            // Puede ocurrir que se olvide poner un break.
            // En este caso si compila, pero se ejecuta
            // la opción 3 y 4
            case 3:
                System.out.println("Opción 3");
            case 4:
                System.out.println("Opción 4... BUG! FALTA UN BREAK");
                break;
            default:
                System.out.println("Opción default");
                break;
        }
    }
}