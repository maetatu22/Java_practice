class ExamSecond  {
  public static void main(String[] args){
    Bicycle bicycle1 = new Bicycle("ビアンキ");

    System.out.println("【自転車の情報】");
    bicycle1.printData();
  }
}

class Bicycle {
  private String name;

  Bicycle(String name){
    this.name = name;
  }

  public void printData(){
    System.out.println("名前："+this.name);
  }
  
}
