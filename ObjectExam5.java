class ObjectExam5 {
  public static void main(String[] args){
    PersonObject5 person1 = new PersonObject5("Kate", "Jones", 27, 1.6, 50.0);
    person1.printData();

    PersonObject5 person2 = new PersonObject5("John", "Smith", 65, 1.75, 80.0);
    person2.printData();

    System.out.println("合計"+PersonObject4.count+"人です");
  }
}

class PersonObject5 {
  public static int count = 0;

  public String firstName;
  public String lastName;
  public int age; 
  public double height, weight;

  PersonObject5(String firstName, String lastName, int age, double height, double weight){
    PersonObject5.count++;

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

  public void printData(){
    System.out.println("私の名前は" + this.fullName() + "です");
    System.out.println("年齢は" + this.age + "歳です");
    System.out.println("BMIは" + Math.round(this.bmi()) + "です");

  }
}
