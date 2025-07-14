public class MethodDiffinitionTest7 {
  public static void main(String[] args) {    // エントリーポイント.

    // メソッドの可変長引数について 続き.
    /* MethodDiffinitionTest6 のプログラムは、以下のように書き換えられる. 動作は同じ.
      ★ 渡した引数の数だけ計算するようなプログラム.
    */ 
  
    System.out.println("mainメソッド開始");
    int intSum = 0;
    int number1 = Integer.parseInt(args[0]);
    int number2 = Integer.parseInt(args[1]);
    int number3 = Integer.parseInt(args[2]);

    // 足し算する処理 → 結果の戻り値をintSumに代入.
    intSum = add(number1, number2, number3, 500);    // この表現によって、引数以外に定数「500」も設定し、配列として扱うことができる.

    // 足し算した結果を画面に表示する処理.
    printSum(intSum);
    System.out.println("mainメソッド終了");
  }

  public static int add (int ... numbers) {   // これを「可変長引数」と呼ぶ.
    // 「int ...」で「int []」と同じ意味. 仮引数numbersは、int型の配列と指定される.
    // こうする意味は、呼び出す側（main側）で変わる.
    // 「int ...」の書き方をすることで、mainメソッドの書き方を「int number1 = ●●」に戻せる.
    // 戻した個々のデータを、int型の配列「{number1, number2, number3}」として扱うことができる.

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
→ これは「MethodDiffinitionTest6」と同じ挙動を示す.
% java MethodDiffinitionTest7 120 130 400
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

実行結果2 intSum = add(number1, number2, number3, 500) とした場合.
もちろん「500」も配列の１要素としてカウントされるし、数値として計算もされる.
anzairyuutou@B6-2B-D3-54-ED-DC Java_Udemy_basic % java MethodDiffinitionTest7 120 130 400
mainメソッド開始
int型[]のaddメソッド開始
numbers[0]の値: 120
numbers[1]の値: 130
numbers[2]の値: 400
numbers[3]の値: 500   ← ★ 配列の要素として 4つ目の「500」が増えている.
int型[] のaddメソッド終了
int型の printSumメソッド開始
sumの値: 1150         ← 計算結果も 500 追加されている.
int型の printSumメソッド終了
mainメソッド終了
 */

 }