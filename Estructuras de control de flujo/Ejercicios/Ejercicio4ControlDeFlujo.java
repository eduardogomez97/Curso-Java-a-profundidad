class Ejercicio4ControlDeFlujo {
    public static void main(String[] args) {
        /*Cuadrado*/
        System.out.println("\nEjercicio1");
        int simbolos =10;
        for(int filas = 4;filas>=1;filas--) {
            while(simbolos>=1){
               System.out.print("*");
               simbolos--;
            }
        simbolos = 10;
        System.out.print("\n");
        }
        /*Triangulo*/
        System.out.println("\nEjercicio2");
        for(int longitud = 1;longitud<=5;longitud++){
            for(int asteriscos = 1;asteriscos<=longitud;asteriscos++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
        /* Triangulo del reves */ 
        System.out.println("\nEjercicio3");
        for(int longitudmax =5;longitudmax>=0;longitudmax--){
            for(int asteriscosbase = 1; asteriscosbase<=longitudmax;asteriscosbase++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        /* Triangulo invertido */ 
        System.out.println("\nEjercicio 4");
        int espacio = 0;
        //int asteriscos = 0;
        for(int filas = 6; filas>=0;filas--) {
            for (int count = 0; count<=6; count++){
                if (espacio<=filas) {
                    System.out.print(" ");
                    espacio++;
                } else {
                    System.out.print("*");
                }
            }     
            espacio = 0;
            System.out.println("");  
        }
    }
}