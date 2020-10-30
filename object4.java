class Object4 {
  public static void main(String[] args){
    personObject4 person1 = new personObject4();
    person1.hello();

    person1.name = "Kate Jones";
    System.out.println(person1.name);

    personObject4 person2 = new personObject4();
    person2.hello();
    
    person2.name = "John Christopher Smith";
    System.out.println(person2.name);

  }
}

class personObject4 {
  public String name;

  public void hello(){
    System.out.println("こんにちは");
  }
}
