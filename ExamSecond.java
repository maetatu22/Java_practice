class ExamSecond  {
  public static void main(String[] args){
    Bicycle bicycle1 = new Bicycle("ビアンキ", "緑", 0);

    System.out.println("【自転車の情報】");
    bicycle1.printData();
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
  
}
