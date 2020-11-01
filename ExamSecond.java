import java.util.Scanner;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;

class ExamSecond {
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    Bicycle bicycle1 = new Bicycle("ビアンキ", "緑", 0);

    System.out.println("【自転車の情報】");
    bicycle1.printData();

    System.out.println("-----------------");
    System.out.print("走る距離を入力してください：");
    int mileage = scanner.nextInt();
    bicycle1.run(mileage);


    System.out.println("=================");

    Car car1 = new Car("フェラーリ", "赤", 0, 100);
    
    System.out.println("【車の情報】");
    car1.printData();

    System.out.println("-----------------");
    System.out.print("走る距離を入力してください：");
    int carMileage = scanner.nextInt();
    car1.run(carMileage);

    System.out.println("-----------------");
    System.out.print("給油する量を入力してください：");
    int refueling = scanner.nextInt();
    car1.charge(refueling);

  }
}

class Bicycle {
  private String name;
  private String color;
  private int distance = 0;

  Bicycle(String name, String color, int distance){
    this.name = name;
    this.color = color;
    this.distance = distance;
  }

  public void printData(){
    System.out.println("名前："+this.name);
    System.out.println("色："+this.color);
    System.out.println("走行距離："+ this.distance + "km");
  }

  public void run(int mileage){
    System.out.println(mileage + "km走ります");
    this.distance += mileage;
    System.out.println("走行距離："+this.distance+"km");
  }
  
}

class Car {
  private String name;
  private String color;
  private int distance = 0;
  private int fuel = 100;

  Car(String name, String color, int distance, int fuel){
    this.name = name;
    this.color = color;
    this.distance = distance;
    this.fuel = fuel;
  }

  public void printData(){
    System.out.println("名前："+this.name);
    System.out.println("色："+this.color);
    System.out.println("走行距離："+this.distance+"km");
    System.out.println("ガソリン量："+this.fuel+"L");
  }

  public void run(int mileage){
    System.out.println(mileage + "km走ります");
    if(mileage <= this.fuel){
      this.distance += mileage;
      this.fuel -= mileage;
      System.out.println("走行距離："+this.distance+"km");
      System.out.println("ガソリン量："+this.fuel+"L");
    }else if(mileage > this.fuel){
      System.out.println("ガソリンが足りません");
      System.out.println("走行距離："+this.distance+"km");
      System.out.println("ガソリン量："+this.fuel+"L");
    }
  }

  public void charge(int refueling){
    System.out.println(refueling+"L給油します");
    if(refueling <= 0){
      System.out.println("給油できません");
    }else if((refueling+this.fuel) >= 100){
      System.out.println("満タンまで給油します");
      this.fuel = 100;
    }else{
      this.fuel += refueling;
      
    }
    System.out.println("ガソリン量："+this.fuel+"L");
  }
}
