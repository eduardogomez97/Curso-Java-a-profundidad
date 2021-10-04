package herencia;

public class Estudiante extends Persona {
    int numeroDeCuenta;

    Estudiante(int numeroDeCuenta,String nombre, String fechaDeNacimiento){
        super(nombre, fechaDeNacimiento);//invoca al constructor de la clase padre
        this.numeroDeCuenta=numeroDeCuenta;
    }

    @Override
    void dormir() {
        super.dormir(); //Con super nos referimos a la clase padre.
        System.out.println("Soy " + nombre + ", soy estudiante y apenas duermo :(");
    }

    void aprobar(){
        System.out.println("Soy "+nombre+" y aprobé mi examen");
    }
    void suspender(){
        System.out.println("Soy "+nombre+" y suspendí mi examen");
    }
}
