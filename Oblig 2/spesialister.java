
class Spesialister extends Lege implements Godkjenningsfritak{

  public String kontrollID;

  public Spesialister(String legeNavn, String kontrollID){
    super(legeNavn);
    this.kontrollID = kontrollID;
  }
  public String hentKontrollID(){
    return kontrollID;
  }
}
