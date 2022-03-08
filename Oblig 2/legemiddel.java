
abstract class Legemiddel{

  public String navn;
  public int pris;
  public double virkestoff;
  public static int teller = 1;
  public int id;

  public Legemiddel(String navn, int pris, double virkestoff){
    this.navn = navn;
    this.pris = pris;
    this.virkestoff = virkestoff;
    id = teller++;

  }
  public int hentId(){
    return id;
  }
  public String hentNavn(){
    return navn;
  }
  public int hentPris(){
    return pris;
  }
  public double hentVirkestoff(){
    return virkestoff;
  }

  public int settNyPris(int nyPris){
    pris =  nyPris;
    return pris;
  }


  public String toString() {
      String penStreng = "Navn: " + navn + ", ID: " + id + "\n";
      penStreng += "Pris: " + pris + "\n";
      penStreng += "Virkestoff: " + virkestoff + "\n";
      return penStreng;
    }
}
