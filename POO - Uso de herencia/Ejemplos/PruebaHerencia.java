class AnimalHerencia {
    String nombre;

    public void respirar(){
        System.out.println("Soy un animal y respiro.");
    }
}
class PerroHerencia extends AnimalHerencia {

}
class Gato extends AnimalHerencia{

}
public class PruebaHerencia {
    public static void main(String[] args) {

        AnimalHerencia a = new AnimalHerencia();
        Gato g= new Gato();
        PerroHerencia p= new PerroHerencia();
        p.nombre="Rocky";

        p.respirar();
        g.respirar();

        System.out.println(a instanceof AnimalHerencia);
        System.out.println(a instanceof Object); //Esto imprime true porque todos los objetos heredan de Object. Es como la clase padre(interna de java).

        // Polimorfismo: Capacidad de los objetos para ser identificados como otros.
        System.out.println(p instanceof AnimalHerencia);
        System.out.println(p instanceof PerroHerencia);
    }
}