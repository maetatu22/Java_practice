class ObjectExams6 {
  public static void main(String[] args){
    PersonObject6 person1 = new PersonObject6("Kate", "Jones", 27, 1.6, 50.0);
    person1.printData();

    PersonObject6 person2 = new PersonObject6("John", "Christopher","Smith", 65, 1.75, 80.0);
    person2.printData();

    PersonObject6.printCount();
  }
}

class PersonObject6 {
  public static int count = 0;

  public String firstName;
  public String middleName;
  public String lastName;
  public int age; 
  public double height, weight;

  PersonObject6(String firstName, String lastName, int age, double height, double weight){
    PersonObject6.count++;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  PersonObject6(String firstName, String middleName, String lastName, int age, double height, double weight){
    PersonObject6.count++;
    this.firstName = firstName;
    this.middleName = middleName;
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

  public static void printCount(){
    System.out.println("合計"+PersonObject6.count+"人です");
  }
}
