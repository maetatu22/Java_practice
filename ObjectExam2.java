class ObjectExam2 {
  public static void main(String[] args){
    PersonObject2 person1 = new PersonObject2("Kate", "Jones", 27, 1.6, 50.0);
    System.out.println(person1.fullName());
    System.out.println(person1.age);
    System.out.println(person1.bmi());
    

  }
}

class PersonObject2{
  public String firstName;
  public String lastName;
  public int age;
  public double height;
  public double weight;

  PersonObject2(String firstName, String lastName, int age, double height, double weight){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  public String fullName(){
    return this.firstName + "" + this.lastName;
  }

  public double bmi(){
    return this.weight/this.height/this.height;
  }
}