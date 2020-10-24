class Method4 {
  public static void main(String[] args){

    String name = fullName("Kate","Jones");

    printData(name,27);

    printData("John Christopher Smith", 65);
  }

  public static void printData(String name, int age){
    System.out.println("私の名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
  }

  public static String fullName(String firstName, String lastName){
    return firstName+""+lastName;
  }
  
}
