class MilResept extends HvitResept{

  public MilResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit){
    super(legemiddel, utskrivendeLege, pasientId, reit);
    this.legemiddel = legemiddel;
    this.reit = 3;
    }

    public String farge(){
      String farge = "Hvit";
      return farge;
    }
    public int prisAbetale(){
      int pris = legemiddel.settNyPris(0);
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
