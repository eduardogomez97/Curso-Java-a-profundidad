package Introducción;
class IncrementoDecremento {
    public static void main(String[] args) {
        int counter = 0;
        System.out.println("Counter vale 0");
        counter++;
        System.out.println("Se Incrementa con counter++: "+counter);
        counter--;
        System.out.println("Se Decrementa con counter++: "+counter);
        System.out.print("Se Incrementa con ++counter en el print: ");
        System.out.println(++counter);
        counter*=7;
        System.out.println("counter*=7 Equivale a counter = counter*7 : "+counter);
    }
}