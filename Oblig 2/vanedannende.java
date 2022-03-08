

class Vanedannende extends Legemiddel{

  public int styrke;

  public Vanedannende(String navn, int pris, double virkestoff, int styrke){
    super(navn, pris, virkestoff);
    this.styrke = styrke;
  }
  public int hentVanedannendeStyrke(){
    return styrke;
  }
  public String toString() {
    String penStreng = super.toString();
    penStreng += "Vanedannende styrke: " + styrke + "\n";
    return penStreng;
  }
}
