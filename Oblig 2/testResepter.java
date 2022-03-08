
class TestResepter{

  public static void main(String[] args){

    Narkotisk narkostiskLegemiddel = new Narkotisk("Morfin", 200, 10, 5);
    Vanedannende vanedannendeLegemiddel = new Vanedannende("Oxynorm", 158, 10, 9);
    Vanlig vanligLegemiddel = new Vanlig("Ibux", 49, 400);

    Lege lege1 = new Lege("Ola Nordmann");
    Lege lege2 = new Lege("Kari Nordmann");
  //testen skriver ikke ut navnene til legen, kun legeID og "lege".


    MilResept mResept = new MilResept(narkostiskLegemiddel, lege1, 123, 2);
    PResept rResept = new PResept(vanligLegemiddel, lege2, 321, 5);
    Blaaresept bResept = new Blaaresept(vanedannendeLegemiddel, lege1, 213, 5);

    mResept.bruk();
    rResept.bruk();
    bResept.bruk();

    System.out.println(mResept.toString() + "\nFarge: " + mResept.farge() + "\nPris aa betale: " + mResept.prisAbetale() + "\n");
    System.out.println(rResept.toString() + "\nFarge: " + rResept.farge() + "\nPris aa betale: " + rResept.prisAbetale() + "\n");
    System.out.println(bResept.toString() + "\nFarge: " + bResept.farge() + "\nPris aa betale: " + bResept.prisAbetale() + "\n");


  }
}
