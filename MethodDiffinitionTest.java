public class MethodDiffinitionTest {
  public static void main(String[] args) {    // プログラムの入り口＝「エントリーポイント」と呼ぶ.
    System.out.println("mainメソッド開始");
    add();      // 左のように、定義したメソッド(); で呼び出すことができる.
                // → 処理が add()メソッドブロックへ飛ぶ.
                // 終了後、またmainメソッドへ戻ってくる.
    add2();
    System.out.println("mainメソッド終了");

    // 下記は、mainのメソッドブロックの中身で、これまで1つのみで記述してきた.
    // mainのクラスブロックの中身を空にすると？.
/*    int number1 = 5;
    int number2 = 10;
    int sum = 0;
    sum = number1 + number2;
    System.out.println("number1の値: " + number1);
    System.out.println("number2の値: " + number2);
    System.out.println("sumの値: " + sum);
*/
    //　★ コンパイル後、javaコマンドを実行しても何も表示されない.
    // addメソッドブロックがあるはずだが、それは実行されない.

  }

  // ここで、メソッドを2個以上作ってみる.
  // 以下のように、addメソッドを定義する場合、動かすにはmainメソッド内で呼び出す必要がある.
  public static void add() {
    System.out.println("addメソッド開始");
    int number1 = 5;
    int number2 = 10;
    int sum = 0;
    sum = number1 + number2;
    System.out.println("number1の値: " + number1);
    System.out.println("number2の値: " + number2);
    System.out.println("sumの値: " + sum);
    add2();   // 別のメソッド内に入れることもできる.
    System.out.println("addメソッド終了");
  }
  public static void add2() {     // ※ 通常、業務ではメソッドに数字を入れるのは好ましくない.
    System.out.println("add2メソッド開始");
    int number1 = 30;
    int number2 = 70;
    int sum = 0;
    sum = number1 + number2;
    System.out.println("number1の値: " + number1);
    System.out.println("number2の値: " + number2);
    System.out.println("sumの値: " + sum);
    System.out.println("add2メソッド終了");
    // → 呼び出した場所へ戻る.
  }

  /* 上記の実行結果.
      mainメソッド開始
      addメソッド開始
      number1の値: 5
      number2の値: 10
      sumの値: 15
      add2メソッド開始
      number1の値: 30
      number2の値: 70
      sumの値: 100
      add2メソッド終了
      addメソッド終了
      mainメソッド終了
  */
}
