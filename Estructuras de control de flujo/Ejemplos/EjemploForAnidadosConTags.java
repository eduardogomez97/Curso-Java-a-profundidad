class EjemploForAnidadosConTags {
    public static void main(String[] args) {
        outer: for(int j=0;j<=10;j++) {
            System.out.println("\nImprimiendo tabla del "+j);
            inner: for(int i=0;i<=10;i++){
                if(i%2!=0) {
                    break inner; 
                    /*
                        Tanto outer como inner son tags que indican cual de los for quiero romper.
                        Está bien para controlar el funcionamiento del programa y así poder tener 
                        mayor control y especificación sobre las tareas.
                    */
                }
                if (i%2==0){
                    System.out.println(j+"x"+i+"="+(j*i));
                    continue outer;
                }
                
                
            }
        }

    }
}