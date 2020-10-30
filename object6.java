class Object6 {
  public static void main(String[] args){
    personObject6 person1 = new personObject6();
    personObject6 person2 = new personObject6();
  }
}

class personObject6 {
  public String name;

  personObject6(){
    System.out.println("インスタンスが生成されました");
  }

  public void hello(){
    System.out.println("こんにちは、私は"+this.name+"です");
  }
}
