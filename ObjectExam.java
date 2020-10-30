class ObjectExam {
  public static void main(String[] args){
    PersonObject person1 = new PersonObject("Kate", "Jones", 27, 1.6, 50.0);

    System.out.println(person1.firstName);
    System.out.println(person1.lastName);
    System.out.println(person1.age);
    System.out.println(person1.height);
    System.out.println(person1.weight);

  }
}

class PersonObject{
  public String firstName;
  public String lastName;
  public int age;
  public double height;
  public double weight;

  PersonObject(String firstName, String lastName, int age, double height, double weight){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }
}
