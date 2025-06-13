public class ConvertVar {
  public static void main(String[] args) {
    int number1 = 100;    //int型はおよそ21億桁はいる箱
    long number2 = 200;   //long型はおよそ900京はいる箱
    System.out.println("number1:" + number1);
    System.out.println("number2:" + number2);
    number2 = number1;    //int型の100をlong型のnumber2に代入.
    // longの変数にint値を代入（long > int）.
    System.out.println("long number2 ← int number1;");
    System.out.println("number1:" + number1);
    System.out.println("number2:" + number2); //number2も100になる.

    // 逆をやってみる
    number1 = 100; 
    number2 = 200;
    // number1 = number2;  // intの箱にlongを入れようとするとコンパイルエラーが起こる.
    number1 = (int)number2; // 桁数を削るので、21億よりも多いデータの場合は注意
    // 強制的な型変換を「キャスト（削る）」という.
    System.out.println("long number1 ← int number2;");
    System.out.println("number1:" + number1);
    System.out.println("number2:" + number2); //number2も100になる.

    // 少数と整数の大小関係
    double number3 = 10.5;
    number3 = number2;    // double > long の大小関係
    System.out.println("double number3 ← long number2;");
    System.out.println("number2:" + number2);
    System.out.println("number3:" + number3); //「200.0」と表示される.

    // 逆をやってみる
    number3 = 10.5;
    // number2 = number3;    // これではコンパイルエラーが発生する.
    //↑エラー: 不適合な型: 精度が失われる可能性があるdoubleからlongへの変換.

    number2 = (long)number3;  // longの変数にdoubleの値をキャストして代入.
    System.out.println("int number3 ← int number2;");
    System.out.println("number2:" + number2); // 「10」と表示される.
    System.out.println("number3:" + number3); //「10.5」と表示される.

    //キャストをすることはあまりない.

  }  
}
