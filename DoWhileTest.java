public class DoWhileTest {
  public static void main (String[] args) {
    // 「do { } while 」というブロックになる.
    // 「do」は「ループの始まり」という意味.
    // １周目は無条件でブロックの処理（{}の中）を行う.
    // １周目の処理が終わり、while()の中身がtrueだったらループする.
    // falseの場合：　ブロック内の処理を終えてループが終了する.
  
    System.out.println("番号！");
    int number = 1;   // 番号（1から始まる）
    do {
      System.out.println(number + "番！");
      number++;   // numberに1を加算する.
    } while(number <= 10); 
    // ()内の条件判定結果が　trueの場合：doに戻って繰り返す. falseの場合：そのまま下の処理へ行く.
  }
    // 現場では圧倒的にwhileループが多く用いられる.
    // 最初に無条件に行いことがあるかどうかで使うかどうかを判断する.
}
