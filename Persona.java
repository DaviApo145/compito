public class Persona extends Thread{
   
    String nome;
    Spogliatoio s;
    Semaforo semaforo;
    long inizio;
    long fine;
    long tempo;
    public Persona (String nome,Spogliatoio s, Semaforo semaforo){
    this.nome = nome;
    this.s = s;
    this.semaforo = semaforo;
    }
    
    public void run(){

        semaforo.P();
        s.usa(nome);
        semaforo.V();
        
        System.out.println(nome+" è entrato in pista");
        System.out.println(" ");
        inizio = System.nanoTime();
            for(int i = 0; i < 15; i++){
            try {
            Thread.sleep((long)(Math.random() * 1000));
            } catch (Exception e) {}
            }
    fine = System.nanoTime();

    
    System.out.println(nome+" è uscito dalla pista");
    System.out.println(" ");
    
        semaforo.P();
        s.usa(nome);
        semaforo.V();

    tempo = (fine-inizio) / 1000000;
    
    }

}
