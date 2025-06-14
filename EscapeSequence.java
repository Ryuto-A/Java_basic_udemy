public class EscapeSequence {
  public static void main(String[] args) {
    // 通常の文字列.
    System.out.println("Hello!!");
    System.out.println("Double quote");

    // ↓の場合エラーになる.
    // System.out.println("Double quote(") is displayed.");
    // エラー内容: エラー: 文字列リテラルが閉じられていません.
    
    // 「"」を表示したい場合、バックスラッシュでエスケープさせる(macの場合は「optionキー」を押しながら「￥」キー).
    System.out.println("Double quote(\") is displayed.");
    // ↑（）の中身を無効にする操作.
    // 補足：Windowsの場合は「￥」のみ付ければ良い

    // シングルクォーテーションの場合
    char c = '\'';
    System.out.println(c);

    // 「バックスラッシュ」を表示させたい場合、さらにバックスラッシュでエスケープさせる.
    System.out.println("\\ is displayed.");

    // 制御文字について.
    System.out.println("Hello! World!!");

    // 改行させたい場合 「\n」で囲む.
    System.out.println("Hello!\n World!!");

    // tabで一定の余白を文字列に入れる場合「\t」で囲む.
    System.out.println("Hello!\t World!!");


    // 制御文字のメリット、使い方について.
    String str = null;    // 初期値はnullに設定
    System.out.println("Hello!\t World!!");

    boolean test = true;
    if (test == true) {
        str = "Hello!\n World!!";
    } else {
        str = "Hello! World!";
    }
    System.out.println(str);    // メリット：System.out.println１回で改行を表示できる.
  
  }
  
}
