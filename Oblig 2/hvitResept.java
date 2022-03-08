
class HvitResept extends Resept{

  public HvitResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit){
    super(legemiddel, utskrivendeLege, pasientId, reit);
    this.legemiddel = legemiddel;
  }
   public String farge(){
     String farge = "Hvit";
     return farge;
   }
   public int prisAbetale(){
     return legemiddel.hentPris();
   }

}
