package herencia;

public class EjemploPersonas {
    public static void main(String[] args) {
        Estudiante e=new Estudiante(123456789,"Antonio","18-10-1997");
        e.dormir();
        e.comer();
        e.aprobar();
        Empleado em=new Empleado(11565050,"Edu","12-10-1997");
        em.respirar();
        em.trabajar();
        em.cobrar();
    }
}
