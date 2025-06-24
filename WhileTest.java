public class WhileTest {
  public static  void main(String[] args) {
    System.out.println("番号！");
    int number = 1;   // 番号（1から始まる）
    while(number <= 10) { 
      // （）の中の条件判定結果がtrueの場合：falseになるまでブロック内を実行.
      // falseの場合：ブロック内の処理をスキップ.
      System.out.println(number + "番！");
      number++;   // numberに1を加算する.
    }
  }
}
