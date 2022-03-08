import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

class Hovedprogram{
//Hovedprogram fra oppgave D
  public static void main(String[] args){
     Dataklynge saga = new Dataklynge(12);
     for (int i = 0; i < 450; i++){
       Node nyNode = new Node(4, 512);
       saga.plasser(nyNode);
     }
     for (int i = 0; i < 16; i++){
       Node flereNoder = new Node(8, 1024);
       saga.plasser(flereNoder);
     }
   }
  private void klyngeInfo(Dataklynge kl){
    System.out.println("Noder med minst 128 GB:" + kl.noderMedNokMinne(128));
    System.out.println("Noder med minst 512 GB:" + kl.noderMedNokMinne(512));
    System.out.println("Noder med minst 1024 GB:" + kl.noderMedNokMinne(1024));

    System.out.println("Antall prosessorer:" + kl.antProsessorer());
    //System.out.println("Antall rack:" + kl.antallRacks());
  }
//Fra oppgave E
  public static void lesFil(String filNavn) throws FileNotFoundException{
    filNavn = "dataklynge2.txt";
    Scanner filen = new Scanner(new File(filNavn));
    Dataklynge klynge = new Dataklynge(12);
    int ant;
    int pros;
    int minn;
    while(filen.hasNextInt()){
      ant = filen.nextInt();
      pros = filen.nextInt();
      minn = filen.nextInt();
      Node x = new Node(pros, minn);
      klynge.plasser(x);
    }
  }
}
