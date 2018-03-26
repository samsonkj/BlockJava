/*
* Blocks => previous hash and current hash
current hash = > transactions array
*/

import java.util.*;

class Blocks{
  int currentHash;
  int previousHash;
  List<String> transactions;

  public Blocks(List<String> transactions, int previousHash){
    this.transactions = transactions;
    this.previousHash = previousHash;
    Object[] obj = {transactions.hashCode(),previousHash};
    this.currentHash = Arrays.hashCode(obj);
  }

  public int getHashCode(){
    return this.currentHash;
  }

}
class Block{
  public static void main(String args[]){

    Blocks genesis = new Blocks(Arrays.asList("personA","personB","2000"),0);
    Blocks b1 = new Blocks(Arrays.asList("personB","personC", "2000"), genesis.getHashCode());
    Blocks b2 = new Blocks(Arrays.asList("personC","personD", "4000"), b1.getHashCode());

    System.out.println(genesis.getHashCode());
    System.out.println(b1.getHashCode());
    System.out.println(b2.getHashCode());
  }
}
