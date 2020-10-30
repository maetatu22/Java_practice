class ObjectExam3 {
  public stacic void main(String[] args){
    PersonObject3 person1 = new PersonObject3("Kate", "Jones", 27, 1.6, 50.0);
    person1.printData();
  }
}

class PersonObject3 {
  public String firstName;
  public String lastName;
  public int age;
  public double height;
  public double weight;

  PersonObject3(String firstName, String lastName, int age, double height, double weight){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  public String fullName(){
    return this.firstName + " " + this.lastName;
  }

  public double bmi(){
    return this.weight / this.height / this.height;
  }

  public 
}
