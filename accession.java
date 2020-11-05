import java.util.Scanner;

class  Accession {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    CarAccession car = new CarAccession();
    car.setName("フェラーリ");
    car.setColor("赤");

    BicycleAccession bicycle = new BicycleAccession();
    bicycle.setName("ビアンキ");
    bicycle.setColor("緑");

    System.out.println("【車の情報】");
    car.printData();

    

    System.out.println("-----------------");
    System.out.print("給油する量を入力してください：");
    int litre = scanner.nextInt();
    car.charge(litre);
  }
}

class BicycleAccession extends Vehicle{
 
  
  
}


class CarAccession extends Vehicle{
  private int fuel = 50;
  public int getFuel(){
    return this.fuel;
  }

  public void printData(){
    System.out.println("名前：" + this.getName());
    System.out.println("色：" + this.getColor());
    System.out.println("走行距離：" + this.getDistance() + "km");
    System.out.println("ガソリン量："+ this.fuel + "L");
  }

  public void charge(int litre) {
    System.out.println(litre + "L給油します");
    if (litre <= 0) {
      System.out.println("給油できません");
    } else if (litre + this.fuel >= 100) {
      System.out.println("満タンまで給油します");
      this.fuel = 100;
    } else {
      this.fuel += litre;
    }
    System.out.println("ガソリン量：" + this.fuel + "L");
  }
  
}

class Vehicle{
  private String name;
  private String color;
  private int distance = 0;

  public String getName() {
    return this.name;
  }
  public String getColor() {
    return this.color;
  }
  public int getDistance() {
    return this.distance;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public void printData() {
    System.out.println("名前：" + this.name);
    System.out.println("色：" + this.color);
    System.out.println("走行距離：" + this.distance + "km");
  }
}

