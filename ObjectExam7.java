class ObjectExam7 {
  public static void main(String[] args){
    PersonObject7 person1 = new PersonObject7("Kate", "Jones", 27, 1.6, 50.0, "医者");
    person1.setMiddleName("Claire");

    PersonObject7 person2 = new PersonObject7("John", "Christopher","Smith", 65, 1.75, 80.0, "教師");
    person2.printData();
    System.out.println("------------------");
    person1.setJob("獣医");

    PersonObject7.printCount();

    System.out.println("person1の仕事を" + person1.getJob() + "に変更しました");
    person1.printData();
  }
}

class PersonObject7 {
  private static int count = 0;

  private String firstName;
  private String middleName;
  private String lastName;
  private int age; 
  private double height, weight;
  private String job;

  PersonObject7(String firstName, String lastName, int age, double height, double weight, String job){
    PersonObject7.count++;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.job = job;
  }

  PersonObject7(String firstName, String middleName, String lastName, int age, double height, double weight, String job){
    this(firstName, lastName, age, height, weight, job);
    this.middleName = middleName;
  }

  public String getMiddleName(){
    return this.middleName;
  }

  public String getJob(){
    return this.job;
  }

  public void setMiddleName(String middleName){
    this.middleName = middleName;
  }

  public String setJob(String job){
    return this.job = job;
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
    System.out.println("仕事は"+this.job+"です");
  }

  public static void printCount(){
    System.out.println("合計"+PersonObject7.count+"人です");
  }
}
