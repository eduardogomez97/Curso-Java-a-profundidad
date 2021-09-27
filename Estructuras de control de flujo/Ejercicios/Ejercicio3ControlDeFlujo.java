class Ejercicio3ControlDeFlujo {
    public static void main(String[] args) { 
        int factorial = 4;
        int resultado = 1;
        System.out.print(factorial+"! = ");
        for(;factorial>=1;factorial--) {
            if(factorial==1) {
                System.out.print(factorial+" = ");
                resultado*=factorial;
            } else {
                System.out.print(factorial+" x ");
                resultado*=factorial;
            }
        }
        System.out.print(resultado+"\n");

        // Otro para mostrar solo el resultado
        int factorialoptimo = 1;
        int numero=4;
        while ( numero!=0) {
            factorialoptimo=factorialoptimo*numero;
            numero--;
        }
        System.out.println("El factorial es "+factorialoptimo);
    }
}