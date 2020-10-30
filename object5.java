class Object5 {
  public static void main(String [] args){
    personObject5 person1 = new personObject5();
    person1.name = "Kate Jones";
    person1.hello();

    personObject5 person2 = new personObject5();
    person2.name = "John Christopher Smith";
    person2.hello();
  }
}

class personObject5 {
  public String name;

  public void hello(){
    System.out.println("こんにちは");
  }
}
