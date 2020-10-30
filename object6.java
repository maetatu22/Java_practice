class Object6 {
  public static void main(String[] args){
    personObject6 person1 = new personObject6("Kate Jones");
    person1.hello();

    personObject6 person2 = new personObject6("John Christopher Smith");
    person2.hello();
  }
}

class personObject6 {
  public String name;

  personObject6(String name){
    System.out.println("インスタンスが生成されました");
    this.name = name;
  }

  public void hello(){
    System.out.println("こんにちは、私は"+this.name+"です");
  }
}
