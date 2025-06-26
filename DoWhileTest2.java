public class DoWhileTest2 {
  public static  void main(String[] args) {
    // WhileループとDoWhileループの比較.
  
    int number = 11; // 11番スタート.

    // Whileループの場合.
    System.out.println("番号を多い順番からWhileループで！");
    while(number <= 10 && number >= 1) {  // 条件は1以上10以下の時.
      System.out.println(number + "番！");
      number--;   // numberから1を減算する.
      // この場合、条件がfalseのため何も表示されない.
    }

      // DoWhileループの場合.
      System.out.println("番号を多い順番からDoWhileループで！");
      do {
        System.out.println(number + "番！");
        number--;   // numberに1を減算する.
      } while(number <= 10 && number >= 1); 
      // 「11番！」から「1番！」まで表示される.
    }
  } 
