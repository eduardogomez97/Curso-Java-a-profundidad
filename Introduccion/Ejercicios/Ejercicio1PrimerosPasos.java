class Ejercicio1PrimerosPasos {
    public static void main(String[] args) {
        final int lado1= 5;
        int areacuadrado = lado1*lado1;
        System.out.println("El area de un cuadrado cuyo lado mide 5 cm es de: "+areacuadrado+"cm");
        final int base=10;
        final int altura=8;
        int areatriangulo = (base*altura)/2;
        System.out.println("El area de un triangulo cuya base mide 10 cm y la altura de sus lados es de 8cm da una rea de: "+areatriangulo+"cm");
        final int baserectangulo=20;
        final int alturarectangulo=10;
        int arearectangulo = baserectangulo*alturarectangulo;
        System.out.println("El area de un rectangulo cuya base mide 20 cm y la altura de sus lados es de 10cm da una rea de: "+arearectangulo+"cm");
    }
}