class Test {
  public static void main(String[] args) {
    // int number = 12;
    
    // // switch文を用いて、numberを3で割った余りで条件分岐をしてください
    // switch(number%3){
    //   case 0:
    //     System.out.println("3で割り切れます");
    //     break;
    //   case 1:
    //     System.out.println("3で割ると1余ります");
    //     break;
    //   case 2:
    //     System.out.println("3で割ると2余ります");
    //     break;
    
    // int number = 10;
    
    // while(number>0){
    //   System.out.println(number);
    //   number--;
    // }

    // for(int i=1;i<=10;i++){
    //   System.out.println(i+"回目のループです");
    // }

    // System.out.println("=== while文 ===");
    // int i = 1;
    // while (i % 5 == 10) {
    //   // iが5の倍数のとき、繰り返し処理を終了してください
    //   if(i>5){
    //     break;
    //   }
      
    //   System.out.println(i);
    //   i++;
    // }
    
    // System.out.println("=== for文 ===");



    for (int i = 1; i < 100; i++) {
      
      if(i % 5 == 0){
      continue;
      }
      System.out.println(i);

    }
  }
}