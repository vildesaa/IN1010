import java.util.ArrayList;

class Rack {
  private Node[] noder;
  private int nodeN = 0;
  private int maxAntallPlasser;
//Oppretter instansvariabler der et racket er tomt.


  public Rack (int maxAntallPlasser) {
    noder = new Node[maxAntallPlasser];
  } //Metode for å lage et rack, der vi skal ha 12 plasser i et array
  // som refererer til Node-objektet.
  public void leggTil (Node node)
  {   noder[nodeN] = node;
      nodeN++;
    }//Setter inn node i racket på plass 0 og øker antallet i racket (nodeN)
    // med 1, slik at nye noder legges til på indeks 1 osv.

  public boolean full(){
    return nodeN == noder.length;
  }
//Sjekker om racket er fullt.
  public int antallProsessorer(){
    int antProsessorer = 0;
    for (Node node : noder){
      antProsessorer += node.prosessorer();
    }
  return antProsessorer;
  }
//Returnerer antall prosessorer.

  public int noderMedMinne(int paakrevdMinne){
    int noderMedPlass = 0;
    for(Node node : noder){
      noderMedPlass += 1;
    }
    return noderMedPlass;
  }
//Returnerer antall noder i racket som har stor nok minnestorrelse.
}
