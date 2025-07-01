public class VariableTest2 {
  public static void main(String[] args) {
    int myAge;  //変数宣言
    // myAge = 35;    // 初期化している.
    // myAge = 40;    // 上書きしている.
    // 上記をコメントアウトすると, myAgeに最初の値を入れていないのでエラーになる.
    // myAge += 5;   // これも初期化にはならない.
    // myAge = myAge + 5;    // これも計算してしまっており,初期化ではない.
    myAge = 35;
    myAge = myAge + 5;    // 初期化してからであればもちろんエラーにならない.
    System.out.println(myAge);

    // 単一のデータ型では、初期化（初期値）が与えられないとエラーになる.

    System.out.println( );

    // 配列の場合.
    int[] ourAges = new int[5];
    System.out.println(ourAges[1]);  // 2番目を表示
    // 上記の場合、配列の要素は何も指定していないのでエラーになりそうだが...
    // 実際は「0」が表示される.
    // → 初期値として、元々「0」が代入されている.

    System.out.println( );

    // 代入する前に計算も可能.
    System.out.println(ourAges[1] + 5);   //「0」+ 5 = 5が表示される.
    // ★ 数値（byte, short, int, long, float, double）のデータ型には0が初期値として代入されている.
    
    // まとめ: 配列の各要素は、初期化しなくても良いが、基本データ型の変数は初期化しなければならない.

    System.out.println( );

    // 論理値boolean型の配列の場合？.
    boolean[] isChild = new boolean[5];   // boolean型の場合, falseが初期値.
    System.out.println(isChild[1]);
    // 表示されるのは「false」　→　初期値は「false」が代入されている.


    System.out.println( );

    // char型の場合.
    char[] letter = new char[5];
    System.out.println(letter[1]);
    // 表示されるのは「　」（ブランク）　→ 初期値は「　」が代入されている.

    System.out.println( );

    // String型の場合.
    String[] text = new String[5];
    System.out.println(text[1]);
    // 表示されるのは「null」　→ 初期値は「null」が代入されている.
    // ★変数「text」には、情報の実体のアドレス（場所）が代入される.
    // → アドレスがない状態が「null」という特殊な値が表示される.
    // → String型の配列は【参照型】.
    // nullとは何か？　String型のデータ型がなぜ参照型なのか？ は次の動画で説明.
  }
}
