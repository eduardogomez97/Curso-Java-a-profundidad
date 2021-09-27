class EjemploForBreak {
    public static void main(String[] args) {
        int tabla=2;
        for(int i=0;i<=10;i++){
            if(i%2!=0) {
                break; //Rompe el ciclo completo y sale del for.
                // con esto solo imprime los pares.
            }
            System.out.println(tabla+"x"+i+"="+(tabla*i));
        }
    }
}