abstract class Resept{
  public Legemiddel legemiddel;
  public Lege utskrivendeLege;
  public int pasientId;
  public int reit;
  public int rteller = 1;
  public int reseptID;

 public Resept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit) {
    this.legemiddel = legemiddel;
    this.utskrivendeLege = utskrivendeLege;
    this.pasientId = pasientId;
    this.reit = reit;
    reseptID = rteller++;
  }
  public int hentId(){
    return reseptID;
  }
  public Legemiddel hentLegemiddel(){
    return legemiddel;
  }
  public Lege hentLege(){
    return utskrivendeLege;
  }
  public int hentPasientId(){
    return pasientId;
  }
  public int hentReit(){
    return reit;
  }
  public boolean bruk(){
    if (reit > 0){
      reit -= 1;
      return true;
    }else{
      return false;
    }
  }
   abstract public String farge();

   abstract public int prisAbetale();

   public String toString() {
      String penStreng = "Legemiddel: " + legemiddel + "\n";
      penStreng += "Utskrivende lege: " + utskrivendeLege + "\n";
      penStreng += "Pasient ID: " + pasientId + "\n";
      penStreng += "Reit: " + reit + "\n";
      return penStreng;
   }
}
