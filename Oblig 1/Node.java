

class Node{
//instansvariabler
  public int prosessorer;
  public int minnestoerrelse;

  public Node(int prosessorer, int minnestoerrelse){
    this.prosessorer = prosessorer;
}
  public int prosessorer(){
    return prosessorer;
//Metode for å returnere antall prosessorer i noden.
  }
  public boolean plassMinne(int paakrevdMinne){
  return(paakrevdMinne <= minnestoerrelse);
  }
//Metode for å sjekke om en paakrevd minnestorrelse er mindre eller lik nodens
//minnestorrelse.
}
