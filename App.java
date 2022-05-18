//computer 11
public class App {
    public static void main(String[] args) throws Exception {

        Semaforo semaforo = new Semaforo(2);
        Spogliatoio s = new Spogliatoio();
        Persona p1 = new Persona("gigi", s, semaforo);
        Persona p2 = new Persona("roberto",s, semaforo);
        Persona p3 = new Persona("davide",s, semaforo);
        Persona p4 = new Persona("alberto",s, semaforo);
        Persona p5 = new Persona("mirko",s, semaforo);
        Persona p6 = new Persona("lorenzo",s, semaforo);
        Persona p7 = new Persona("alessandro",s, semaforo);
        Persona p8 = new Persona("gabriele",s, semaforo);

        System.out.println("inizio");
        System.out.println(" ");
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();

        p1.join();
        p2.join();
        p3.join();
        p4.join();
        p5.join();
        p6.join();
        p7.join();
        p8.join();

        System.out.println("fine");
    }
}
