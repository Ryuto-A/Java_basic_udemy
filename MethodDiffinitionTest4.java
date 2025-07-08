public class MethodDiffinitionTest4 {
  public static void main(String[] args) {

    // mainメソッドについて. String[] args とは？
    // javaコマンドの実行で、mainメソッドが必ず実行される.
  
    // mainメソッドについて.
    /*
    ・main は小文字でなければならない. (public static についてはオブジェクト指向の時に説明.)
    ・「void」は戻り値を戻さないという意味.(前回の復習)
    　→ mainメソッドは戻り値を返さない　というルールを守らないとならない.
    ・(String[] args) 「読み: ストリング配列　アーグス」は配列引数.
    ・どこかから渡される情報を示している.

    　→　どこから？.
    ・mainメソッドはjavaコマンドで実行する配列の値を、mainメソッドに送り込むことができる.
　    → javaコマンドを実行する際、MethodDiffinitionTest4 というクラスに何かしらの情報を送り込むことができる.
　　　【例】ターミナルで、以下のように実行することができる
          % java MethodDiffinitionTest4 5 10
          ↑ args という配列の変数　の1番目([0],[1])に「5」「10」を代入できる.
          → mainメソッド内で使用できる.
      */ 

    System.out.println("mainメソッド開始");
    int sum = 0;
    int number1 = Integer.parseInt(args[0]);  // 「Integer.parseInt(文字列型の数字)」で、文字列の数字を整数に変換できる.
    int number2 = Integer.parseInt(args[1]);  // これは、変数argsがString型で指定されているため.
    // 実際には、以下のようにまとめて記述する.
    // sum = add(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

    sum = add(number1, number2);
    //　↑ こうすることで、ターミナルで　% java MethodDiffinitionTest4 5 10　とした値が整数として代入される.
    // % java MethodDiffinitionTest4 5 10 のことを「コマンドライン引数」と呼ぶ.

    printSum(sum);
    System.out.println("mainメソッド終了");
  }

 
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

    /* 
    実行結果1 コマンドライン変数を　100 200　で入れた場合
    anzairyuutou@B6-2B-D3-54-ED-DC Java_Udemy_basic % java MethodDiffinitionTest4 100 200
    mainメソッド開始
    addメソッド開始
    number1の値: 100
    number2の値: 200
    addメソッド終了
    printSumメソッド開始
    sumの値: 300
    printSumメソッド終了
    mainメソッド終了

    実行結果2　コマンド変数を 100 のみにした場合.
    anzairyuutou@B6-2B-D3-54-ED-DC Java_Udemy_basic % java MethodDiffinitionTest4 100    
    mainメソッド開始
    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
        at MethodDiffinitionTest4.main(MethodDiffinitionTest4.java:27)
    
    上記のように、ArrayIndexOutOfBoundsExceptionエラーが発生する.
    → 「Index 1 out of bounds for length 1」より.
    要素は String[] args = {100};
    となっているはずだが、27行目で args[1] と指定（２個）しており、
    要素数を超えてインデックス数を指定しているというエラー.


    実行結果3　コマンド変数を 100 200 500 に（使う数よりも配列要素の数を多く）した場合.
    anzairyuutou@B6-2B-D3-54-ED-DC Java_Udemy_basic % java MethodDiffinitionTest4 100 200 500
    mainメソッド開始
    addメソッド開始
    number1の値: 100
    number2の値: 200
    addメソッド終了
    printSumメソッド開始
    sumの値: 300
    printSumメソッド終了
    mainメソッド終了

    この場合は配列の要素が多いだけであり、プログラム内で用いていないだけになり、エラーにならない.

*/
}