public class MethodDiffinitionTest3 {
  public static void main(String[] args) {

    // 引数と戻り値について　（MethodDiffinitionTest2.java の続き）.

    // MethodDiffinitionTest2.java でsum: 0 と表示されることを戻り値で解消.
    // ★「void」とは「戻り値を戻さない」という意味で用いられる.

    System.out.println("mainメソッド開始");
    int number1 = 5;
    int number2 = 10;
    int sum = 0;

    // 足し算する処理. addメソッドの計算結果（戻り値）を mainメソッドでのsumに代入する.
    sum = add(number1, number2);    //引数として渡すときの書き方.
    // add()の中のリテラルは直接入力しても良い.
    // 今回の場合、 add(5, 10) と整数を入れたら自動的に型が決定する.
    // ※ もしも「add(5.0, 10)」と小数型にしたい場合、受け取り先ではint型が指定されているため、コンパイルエラーが起こる.
    // → 無理やりキャストすれば引数として利用可能になる.
    // sum = add ((int)5.0, 10) とかく/

    // 足し算した結果を画面に表示する処理.
    printSum(sum);    // sumの戻り値がmainメソッドへ戻ってきているので、printsumメソッドへ渡すことで表示される.
    
    //　代入する値は、以下のように上書きが可能.
    // → add2メソッドは不要になる.
    sum = add(30, 70);
    printSum(sum);
    System.out.println("mainメソッド終了");

    // メソッドを変えるとは、同じプログラムのルールで値だけ変えて処理をできる.
  }

    // addメソッドの void を変更し、型を指定する（intにする） + メソッドの最後に　return 変数名　で戻り値が返ってくる.
    // 補足: 戻り値のデータ型に合わせて public static のあとはdoubleやStringに変更する.
  public static int add(int number1, int number2) {
    System.out.println("addメソッド開始");
    System.out.println("number1の値: " + number1);
    System.out.println("number2の値: " + number2);

    int sum = 0;
    sum = number1 + number2;
    System.out.println("addメソッド終了");
    return sum;   // メソッドの最後に return 変数　で戻り値を返す.
  }
    
    public static void printSum(int sum) {
      System.out.println("printSumメソッド開始");
      System.out.println("sumの値: " + sum);
      System.out.println("printSumメソッド終了");
    }
/* 実行結果1 
    mainメソッド開始
    addメソッド開始
    number1の値: 5
    number2の値: 10
    addメソッド終了
    printSumメソッド開始
    sumの値: 15     // ← addメソッドの計算結果がmainメソッドへ戻り、printSumメソッドへ渡されている.
    printSumメソッド終了
    mainメソッド終了

  実行結果2
    mainメソッド開始
    addメソッド開始
    number1の値: 5
    number2の値: 10 
    addメソッド終了
    printSumメソッド開始
    sumの値: 15
    printSumメソッド終了
    addメソッド開始   // 値が変わっただけで、ルールは同じ.
    number1の値: 30
    number2の値: 70
    addメソッド終了
    printSumメソッド開始
    sumの値: 100
    printSumメソッド終了
    mainメソッド終了
*/
}