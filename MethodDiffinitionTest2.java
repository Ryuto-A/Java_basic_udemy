public class MethodDiffinitionTest2 {
  public static void main(String[] args) {

    // 引数と戻り値について　（MethodDiffinitionTest3.java に続く）.

    System.out.println("mainメソッド開始");
    int number1 = 5;
    int number2 = 10;
    int sum = 0;

    // 足し算する処理.
    add(number1, number2);    //引数として渡すときの書き方.

    // 足し算した結果を画面に表示する処理.
    printSum(sum);
    System.out.println("mainメソッド終了");
  }

  public static void add(int number1, int number2) {    // 引数としてmainメソッドから受け取る時の書き方.
    System.out.println("addメソッド開始");
    System.out.println("number1の値: " + number1);
    System.out.println("number2の値: " + number2);

    int sum = 0;    // int sumを戻り値として用いていない（mainもaddもvoid指定している）ため黄色く表示されている.
    sum = number1 + number2;
    System.out.println("addメソッド終了");
  }
    
    public static void printSum(int sum) {
      System.out.println("printSumメソッド開始");
      System.out.println("sumの値: " + sum);
      System.out.println("printSumメソッド終了");
    }
/* 実行結果
    mainメソッド開始
    addメソッド開始
    number1の値: 5
    number2の値: 10
    addメソッド終了
    printSumメソッド開始
    sumの値: 0 ★　←　printSumメソッドでの変数sumの値は0 (初期値のまま).
                    → addメソッドの中では15になっているが、printSumメソッドの中では0 (2つのsumは別物).
                    → addメソッド終了後、mainメソッドの処理に戻るとsum=15は引き継がれない.
                    → そのため、7行目の int sum = 0; がprintsumメソッドへ引き渡されている.
                    → 解決方法（戻り値について）は、次の MethodDiffinitionTest3.java に記述
    printSumメソッド終了
    mainメソッド終了
*/
}