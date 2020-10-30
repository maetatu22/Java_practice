class ObjectExam7 {
  public static void main(String[] args){
    PersonObject7 person1 = new PersonObject7("Kate", "Jones", 27, 1.6, 50.0);
    person1.printData();

    PersonObject7 person2 = new PersonObject7("John", "Christopher","Smith", 65, 1.75, 80.0);
    person2.printData();

    PersonObject7.printCount();

    System.out.println("----------------------");
    System.out.println("person2のミドルネームは"+person2.getMiddleName()+"です");
  }
}

class PersonObject7 {
  private static int count = 0;

  private String firstName;
  private String middleName;
  private String lastName;
  private int age; 
  private double height, weight;

  PersonObject7(String firstName, String lastName, int age, double height, double weight){
    PersonObject7.count++;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  PersonObject7(String firstName, String middleName, String lastName, int age, double height, double weight){
    this(firstName, lastName, age, height, weight);
    this.middleName = middleName;
  }

  public String getMiddleName(){
    return this.middleName;
  }

  public String fullName(){
    if(this.middleName == null){
      return this.firstName + " " + this.lastName;
    }else{
      return this.firstName + " " + this.middleName + " " + this.lastName;
    }
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
    System.out.println("合計"+PersonObject7.count+"人です");
  }
}
