class  Accession {
  public static void main(String[] args) {
    CarAccession car = new CarAccession();
    car.setName("フェラーリ");
    car.setColor("赤");

    BicycleAccession bicycle = new BicycleAccession();
    bicycle.setName("ビアンキ");
    bicycle.setColor("緑");
  }
}

class BicycleAccession extends Vehicle{
  
  
}


class CarAccession extends Vehicle{
  
  
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

