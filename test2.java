class Test2 {
  public static void main(String[] args) {
    // // 変数namesに、配列を代入してください
    // String[] names = {"にんじゃわんこ", "ひつじ仙人", "ベイビーわんこ"};
    
    // // インデックス番号が0の要素を出力してください
    // System.out.println(names[0]);
    
    // // インデックス番号が2の要素を出力してください
    // System.out.println(names[2]);


    // String[] languages = {"Ruby", "PHP", "Python"};
    
    //   // インデックス番号が「1」の要素を出力してください
    //   System.out.println(languages[1]);
    
    //   // インデックス番号が「1」の要素を「Java」で上書きしてください
    //   languages[1]="java";
      
    //   // インデックス番号が「1」の要素を出力してください
    //   System.out.println(languages[1]);

    String[] names = {"にんじゃわんこ", "ひつじ仙人", "ベイビーわんこ"};
    
    // for文を用いて、「私の名前は◯◯です」と出力してください
    // for(int i = 0; i < names.length ; i++){
    //   System.out.println("私の名前は"+names[i]+"です");
    // }

    for(String name: names){
      System.out.println("私の名前は"+name+"です");
    }
  }
}