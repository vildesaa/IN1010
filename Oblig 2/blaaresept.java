
class Blaaresept extends Resept{

  public Blaaresept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit){
    super(legemiddel, utskrivendeLege, pasientId, reit);
    this.legemiddel = legemiddel;
  }
  public String farge(){
    String farge = "Blaa";
    return farge;
  }
  public int prisAbetale(){
    int pris = legemiddel.hentPris();
    int blaaPris = legemiddel.settNyPris(pris * 25 / 100);
    return blaaPris;
  }
  public String toString() {
     String penStreng = "Legemiddel: " + legemiddel + "\n";
     penStreng += "Utskrivende lege: " + utskrivendeLege + "\n";
     penStreng += "Pasient ID: " + pasientId + "\n";
     penStreng += "Reit: " + reit + "\n";
     return penStreng;
  }
}
