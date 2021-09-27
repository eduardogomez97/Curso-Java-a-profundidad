class EjemploForContinue {
    public static void main(String[] args) {
        int tabla=2;
        for(int i=0;i<=10;i++){
            if(i%2==0) {
                continue; //Rompe solo la interacción de este ciclo, no el ciclo completo.
                // con esto solo imprime los impares.
            }
            System.out.println(tabla+"x"+i+"="+(tabla*i));
        }
    }
}