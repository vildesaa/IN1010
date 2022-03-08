class Integrasjonstest{

  public static void main(String[] args){

    Narkotisk narkostiskLegemiddel = new Narkotisk("Morfin", 200, 10, 5);
    Vanedannende vanedannendeLegemiddel = new Vanedannende("Oxynorm", 158, 10, 9);
    Vanlig vanligLegemiddel = new Vanlig("Ibux", 49, 400);

    Spesialister lege1 = new Spesialister("Ola Nordmann", "ABAB");
    Lege lege2 = new Lege("Kari Nordmann");

    MilResept mResept = new MilResept(narkostiskLegemiddel, lege1, 123, 2);
    PResept rResept = new PResept(vanligLegemiddel, lege2, 321, 5);
    Blaaresept bResept = new Blaaresept(vanedannendeLegemiddel, lege1, 213, 5);

    System.out.println(mResept.toString() + "\nFarge: " + mResept.farge() + "\nPris aa betale: " + mResept.prisAbetale() + "\n");
    System.out.println(rResept.toString() + "\nFarge: " + rResept.farge() + "\nPris aa betale: " + rResept.prisAbetale() + "\n");
    System.out.println(bResept.toString() + "\nFarge: " + bResept.farge() + "\nPris aa betale: " + bResept.prisAbetale() + "\n");

  }
}
