class Ejercicio2ControlDeFlujo {
    public static void main(String[] args) {
        for(int j=0;j<=20;j++) {
            System.out.println("\nTabla del "+j);
            for (int i=0;i<=10;i++){
                if(i%2!=0){
                    continue;
                }
                System.out.println(j+"x"+i+"="+(j*i*i));
            }
        }
    }
}