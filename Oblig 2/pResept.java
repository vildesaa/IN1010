
class PResept extends HvitResept{
  public PResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit){
    super(legemiddel, utskrivendeLege, pasientId, reit);
    this.legemiddel = legemiddel;
    }
  public String farge(){
    String farge = "Hvit";
    return farge;
    }
  public int prisAbetale(){
    int pris = legemiddel.hentPris();
    if (pris < 108 && pris > 0){
      pris = legemiddel.settNyPris(0);
    }else{
      pris = legemiddel.settNyPris(pris - 108);
    }
    return pris;
  }
  public String toString() {
     String penStreng = "Legemiddel: " + legemiddel + "\n";
     penStreng += "Utskrivende lege: " + utskrivendeLege + "\n";
     penStreng += "Pasient ID: " + pasientId + "\n";
     penStreng += "Reit: " + reit + "\n";
     return penStreng;
  }
}
