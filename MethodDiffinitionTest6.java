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
    double doubleSum = 0;
    int number1 = Integer.parseInt(args[0]);
    int number2 = Integer.parseInt(args[1]);
    int number3 = Integer.parseInt(args[2]);

    // 足し算する処理 → 結果の戻り値をintSumに代入.
    intSum = add(number1, number2, number3);

    // 足し算した結果を画面に表示する処理.
    printSum(intSum);

    // ここでコマンドライン引数に関わらず、number1に30.5, number2に70.7を入れてみる.
    // → 自動的にdouble型のaddメソッド処理が行われる.
    doubleSum = add(30.5, 70.7);

    // 足し算した結果を画面に表示する処理.
    printSum(doubleSum);
    System.out.println("mainメソッド終了");
  }

  public static int add (int[] numbers) {
    System.out.println("int型[]のaddメソッド開始");
  }

/*
public static int add(int number1, int number2) {
  System.out.println("int型×2 のaddメソッド開始");
  System.out.println("number1の値: " + number1);
  System.out.println("number2の値: " + number2);
  int sum = 0;
  sum = number1 + number2;
  System.out.println("int型×2 のaddメソッド終了");
  return sum;
}

// ② int型×3のaddメソッド.
public static int add(int number1, int number2, int number3) {
  System.out.println("int型×3 のaddメソッド開始");
  System.out.println("number1の値: " + number1);
  System.out.println("number2の値: " + number2);
  System.out.println("number3の値: " + number3);

  int sum = 0;
  sum = number1 + number2 + number3;
  System.out.println("int型×3 のaddメソッド終了");
  return sum;
}
*/

// ③ double型のaddメソッド.
// double型の方がint型に対して容量が大きい.
  public static double add(double number1, double number2) {
    System.out.println("double型×2 のaddメソッド開始");
    System.out.println("number1の値: " + number1);
    System.out.println("number2の値: " + number2);

    double sum = 0;  // double型をint型に入れようとするとコンパイルエラーになってしまう.　また、double型（小数）の足し算なので、結果も少数で表示させるためにdouble型を指定する.
    sum = number1 + number2;
    System.out.println("double型×2 のaddメソッド終了");
    return sum;
  }

  // int型とdouble型で表示のプログラムを変える. これもオーバーロード.
  // ① 整数int型の場合
    public static void printSum(int sum) {
      System.out.println("int型の printSumメソッド開始");
      System.out.println("sumの値: " + sum);
      System.out.println("int型の printSumメソッド終了");
    }

  // ② 小数double型の場合
    public static void printSum(double sum) {
      System.out.println("double型の printSumメソッド開始");
      System.out.println("sumの値: " + sum);
      System.out.println("double型の printSumメソッド終了");
    }

/* 実行結果1 int型のコマンドライン引数を2つ入れた場合.
% java MethodDiffinitionTest5 150 200
mainメソッド開始
int型×2 のaddメソッド開始
number1の値: 150
number2の値: 200
int型×2 のaddメソッド終了
int型の printSumメソッド開始
sumの値: 350
int型の printSumメソッド終了
double型 のaddメソッド開始
number1の値: 30.5
number2の値: 70.7
double型 のaddメソッド終了
double型の printSumメソッド開始
sumの値: 101.2
double型の printSumメソッド終了
mainメソッド終了

実行結果2 int型のコマンドライン引数を3つ入れた場合.
          → 自動的にint型のコマンドライン変数が3つの場合の処理が行われる.
% java MethodDiffinitionTest5 150 200 100
mainメソッド開始
int型×3 のaddメソッド開始
number1の値: 150
number2の値: 200
number3の値: 100
int型×3 のaddメソッド終了
int型の printSumメソッド開始
sumの値: 450
int型の printSumメソッド終了
double型×2 のaddメソッド開始
number1の値: 30.5
number2の値: 70.7
double型×2 のaddメソッド終了
double型の printSumメソッド開始
sumの値: 101.2
double型の printSumメソッド終了
mainメソッド終了

 */


 }