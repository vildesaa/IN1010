
class Narkotisk extends Legemiddel{

  public int styrke;

  public Narkotisk(String navn, int pris, double virkestoff, int styrke){
    super(navn, pris, virkestoff);
    this.styrke = styrke;

  }
  public int hentNarkotiskStyrke(){
    return styrke;
  }
  public String toString() {
    String penStreng = super.toString();
    penStreng += "Narkotisk styrke: " + styrke + "\n";
    return penStreng;
  }
}
