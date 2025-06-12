public class VariableTest {
  public static void main(String[] args) {
    int myAge;    // 「変数宣言」：情報が入る箱の形を決めて、コンピュータに伝える.
    myAge = 35;   // 「変数の初期化」.
    myAge = 40;   // 変数は上書き可能.
//    myAge = "ABC"; ← 不適合なデータ型は変換できない. Javaは静的型付けなので、一度決めたら型の変更はできない.
// JSやRuby,PHPは動的型付け言語であり、変数の型も自由にいじれるが、大規模なプロジェクトには向かない.
    System.out.println(myAge);
  }
}
