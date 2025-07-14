public class MethodDiffinitionTest6 {
  public static void main(String[] args) {    // エントリーポイント.

    // メソッドの可変長引数について.
    /* MethodDiffinitionTest5 でオーバーロードを学習した.
    　→ 変数の個数を4〜　と変更するとき、その分だけプログラムを作らないといけない？.
    　→　流石にキリがない.
      →　★ 渡した引数の数だけ計算するようなプログラムを考える.
    */ 
  
    System.out.println("mainメソッド開始");
    int intSum = 0;
    int[] numbers = new int [3];
    numbers[0] = Integer.parseInt(args[0]);
    numbers[1] = Integer.parseInt(args[1]);
    numbers[2] = Integer.parseInt(args[2]);

    // 足し算する処理 → 結果の戻り値をintSumに代入.
    intSum = add(numbers);

    // 足し算した結果を画面に表示する処理.
    printSum(intSum);
    System.out.println("mainメソッド終了");
  }

  public static int add (int[] numbers) {   // 複数の整数を配列で渡す.
    System.out.println("int型[]のaddメソッド開始");
    int sum = 0;
    // ループにしてiを表示、どんどん足しこむループ.
    for(int i = 0; i < numbers.length; i ++ ){
      System.out.println("numbers[" + i + "]の値: " + numbers[i]);
      sum += numbers[i];
    }
    System.out.println("int型[] のaddメソッド終了");
    return sum;
  }

  //  変数sumの表示.
    public static void printSum(int sum) {
      System.out.println("int型の printSumメソッド開始");
      System.out.println("sumの値: " + sum);
      System.out.println("int型の printSumメソッド終了");
    }

/* 実行結果 forループでaddメソッドにコマンドライン引数120 130 400 の3つを入れた場合.
% java MethodDiffinitionTest6 120 130 400
mainメソッド開始
int型[]のaddメソッド開始
numbers[0]の値: 120
numbers[1]の値: 130
numbers[2]の値: 400
int型[] のaddメソッド終了
int型の printSumメソッド開始
sumの値: 650
int型の printSumメソッド終了
mainメソッド終了

→ これと同じ動きを「...」として可変長引数で考えることができる.
→ MethodDiffinitionTest7.java で確認.
 */

 }