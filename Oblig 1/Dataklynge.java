import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

//lager klassedefinisjon for Dataklynge og en konstruktør med instansvariablene rackHoeyde og rackAntall.
public class Dataklynge {
    private ArrayList<Rack> racks = new ArrayList<Rack>();
    private int rackHoeyde, rackAntall;


    public Dataklynge(int rackHoeyde){
        this.rackHoeyde = rackHoeyde;
        rackAntall = 0;


    }
//lager en anternativ konstruktør som henter informasjon fra en fil for klyngen.
    public Dataklynge(String filename){
        Scanner file = new Scanner(new File(filename));
        try{
            file = new Scanner("filnavn");
        } catch(FileNotFoundException e){
          System.out.println("Filnavn ikke funnet!");
          System.out.println(e);
          throw new FileNotFoundException(e);
          System.exit(1);
        }
//leser inn max antall noder per rack og kaller på konstruktøren
          // til rack for å opprette et nytt rack.
        int maxNoderPerRack = file.nextInt();
        Rack nyttRack = new Rack(maxNoderPerRack);


//leser så av i filen minnestørrelsen og antall prosessorer, og setter noderne
          // med denne informasjonen inn i racket.
        while(file.hasNext()){
          int nodeA, ram, prosessor;
          nodeA = file.nextInt();
          ram = file.nextInt();
          prosessor = file.nextInt();

          for(int i = 0; i < nodeA; i++){
            Node nyNode = new Node (ram, prosessor);
            settInnNode(nyNode);
          }
        }
        }

//en metode for å legge til en node i racket, prøver noden på første ledige plass, dersom det ikke er
    //plass, lager metoden en ny rack og setter noden inn her.
    public void settInnNode(Node node){
        boolean tidligereRack = false;
        for (Rack rack : racks){
            tidligereRack = rack.settInn(node);
        }
        if (!tidligereRack) {
            leggTilRack();
            racks.get(rackAntall - 1).settInn(node);
        }
    }
//metode for å lage en ny rack
    public void leggTilRack(){
        racks.add(new Rack(rackHoeyde));
        rackAntall++;
    }
// metode som henter antall prosessorer og retunerer denne verdien.
    public int antProsessorer(){
        int prosessorAnt = 0;
        for (Rack rack : racks){
            prosessorAnt += rack.hentAntallProsessorer();
        }
        return prosessorAnt;
    }
//metode for å hente antall noder som har det påkrevde minnet, og returnerer det riktige antallet noder.
    public int noderMedMinne(int pakrevdMinne){
        int kvalifiserteNoder = 0;
        for (Rack rack : racks){
            kvalifiserteNoder += rack.noderMedMinne(pakrevdMinne);
        }
        return kvalifiserteNoder;
    }
//metode for å hente antall racks i klyngen og returnerer denne verdien.
    public int antallRacks(){
        return racks.size();
    }
}
