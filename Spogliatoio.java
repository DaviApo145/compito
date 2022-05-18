public class Spogliatoio extends Thread{
    
    public void usa(String nome){
        
    System.out.println(nome+" è entrato nello spogliatoio");
    System.out.println(" ");
    try {
        Thread.sleep((long)(Math.random() * 1000));
    } catch (Exception e) { 
    }
    System.out.println(nome+" è uscito dallo spogliatoio");
    System.out.println(" ");
    }

}
