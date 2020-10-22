class Test_method2 {
  public static void main(String[] args) {
  //   // 引数に「Kate Jones」を渡してください
  //   printData("Kate Jones");
    
  //   // 引数に「John Christopher Smith」を渡してください
  //   printData("John Christopher Smith");
    
  // }

  // // 引数を受け取るようにしてください
  // public static void printData(String name) {
  //   // 「私の名前は◯◯です」と出力されるように書き換えてください
  //   System.out.println("私の名前は"+name+"です");
  printData("Kate Jones",27);
  printData("John Christopher Smith", 65);
}

// 年齢に関する引数を受け取れるようにしてください
public static void printData(String name , int age) {
  System.out.println("私の名前は" + name + "です");
  // 「年齢は◯◯歳です」と出力してください
  System.out.println("年齢は"+age+"です");
  
  }
}
