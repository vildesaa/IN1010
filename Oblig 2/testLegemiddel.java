
class TestLegemiddel{

  public static void main(String[] args){

    Narkotisk narkostiskLegemiddel = new Narkotisk("Morfin", 200, 10, 5);
    System.out.println("ID: " + narkostiskLegemiddel.hentId());
    System.out.println("Navn; " + narkostiskLegemiddel.hentNavn());
    System.out.println("Pris: " + narkostiskLegemiddel.hentPris());
    System.out.println("Mengde virkestoff: " + narkostiskLegemiddel.hentVirkestoff());
    narkostiskLegemiddel.settNyPris(500);
    System.out.println("Ny pris: " + narkostiskLegemiddel.hentPris());
    System.out.println("Narkotisk styrke: " + narkostiskLegemiddel.hentNarkotiskStyrke());

    Vanedannende vanedannendeLegemiddel = new Vanedannende("Oxynorm", 158, 10, 9);
    System.out.println("ID: " + vanedannendeLegemiddel.hentId());
    System.out.println("Navn; " + vanedannendeLegemiddel.hentNavn());
    System.out.println("Pris: " + vanedannendeLegemiddel.hentPris());
    System.out.println("Mengde virkestoff: " + vanedannendeLegemiddel.hentVirkestoff());
    vanedannendeLegemiddel.settNyPris(200);
    System.out.println("Ny pris: " + vanedannendeLegemiddel.hentPris());
    System.out.println("Narkotisk styrke: " + vanedannendeLegemiddel.hentVanedannendeStyrke());

    Vanlig vanligLegemiddel = new Vanlig("Ibux", 49, 400);
    System.out.println("ID: " + vanligLegemiddel.hentId());
    System.out.println("Navn; " + vanligLegemiddel.hentNavn());
    System.out.println("Pris: " + vanligLegemiddel.hentPris());
    System.out.println("Mengde virkestoff: " + vanligLegemiddel.hentVirkestoff());
    vanligLegemiddel.settNyPris(99);
    System.out.println("Ny pris: " + vanligLegemiddel.hentPris());
  }
}
