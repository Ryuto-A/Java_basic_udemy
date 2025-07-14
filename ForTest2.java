public class ForTest2 {
  // 「ブロック」の考え方、「変数のスコープ」の考え方 について.
  public static void main(String[] args){
    for(int i = 0; i < 10; i++) {
        if(i == 5) {
            System.out.println("次のループ（周）に進む");
            continue;   // ここで次のループ（周）に進む.
      }
      System.out.println("for繰り返し: " + i + "周め");
    }
//    System.out.println(k);   ← ノート（２）k を定義する前に扱うことはできない.
    int k = 1;      // ★ この変数が使えるのは、宣言したここから、メソッドブロックの閉じかっこまで.
    System.out.println("kの初期値: " + k );
    // 当たり前だが、メソッドブロック内の処理に使うことができる.
    while(k <= 5) {
      int l = 5;      // whileループないに変数lを設定するが、使えるのはこのブロック内でしか使えない.
      System.out.println("while繰り返し: " + k + "周め, lの値: " + l);
      k++;
    }
  System.out.println("プログラム終了!");
  System.out.println("kの値: " + k );   // ここで、kは「6」になっている. 理由: while文の条件から,k=5の時も実行されて、インクリメントされてwhileループが終了しているため.
  // System.out.println("lの値: " + l);  ← lはスコープ外のため表示できない. コンパイルエラーになる.
  // 変数k が使えるのはこの閉じかっこの中まで.
  }
}

/* 【ノート】.
（１）ブロックの考え方について.
  * もしもForTest{ }のとじかっこ「}」を消してコンパイルすると？.
実行結果
% javac ForTest2.java                    
ForTest2.java:11: エラー: 構文解析中にファイルの終わりに移りました
  }
   ^
エラー1個

↑のようになる.
→ これは、コンピュータが「classブロックの閉じかっこがないまま終わった」と判定というエラー.

  * 一番外側にあるのは「class ブロック」. その中に「メソッドブロック」がある. 

  * もしclassブロックの外側にメソッドブロックを配置すると？
  → 以下のようにする.

public class ForTest2 {
}
  public static void main(String[] args){
    for(int i = 0; i < 10; i++) {
        if(i == 5) {
            System.out.println("次のループ（周）に進む");
            continue;   // ここで次のループ（周）に進む.
      }
      System.out.println("繰り返し: " + i + "周め");
    }
  }

  実行結果↓
anzairyuutou@B6-2B-D3-54-ED-DC Java_Udemy_basic % javac ForTest2.java
ForTest2.java:4: エラー: 暗黙的に宣言されたクラスはプレビュー機能であり、デフォルトで無効になっています。
  public static void main(String[] args){
                ^
  (暗黙的に宣言されたクラスを有効にするには--enable-previewを使用します)
エラー1個

  * 同様に、処理のブロック（今回で言うと for(){ }）をメソッドブロックの外側に配置すると、当然コンパイルエラーになる.

  * for ループ処理の下に、whileループを作る.
実行結果
% java ForTest2.java 
for繰り返し: 0周め
for繰り返し: 1周め
for繰り返し: 2周め
for繰り返し: 3周め
for繰り返し: 4周め
次のループ（周）に進む      ← 5周目の時だけcontinueとなって処理が飛ばされる.
for繰り返し: 6周め
for繰り返し: 7周め
for繰り返し: 8周め
for繰り返し: 9周め
while繰り返し: 1周め       ← forループが完了後、並列配置されているwhileループが始まる.
while繰り返し: 2周め
while繰り返し: 3周め
while繰り返し: 4周め
while繰り返し: 5周め
プログラム終了!

（２）変数のスコープについて.
① kの変数宣言の前に「System.out.println(k);」を配置しても、表示されない.
コンパイル結果
% javac ForTest2.java
ForTest2.java:11: エラー: シンボルを見つけられません
    System.out.println(k);      // ← ノート（２）k を定義する前に扱うことはできない.
                       ^
  シンボル:   変数 k
  場所: クラス ForTest2
エラー1個

　↑　コンピュータは上から順に１行ずつ処理していく


② lがスコープ外の場合、コンパイルエラーが起こる.
% javac ForTest2.java
ForTest2.java:23: エラー: シンボルを見つけられません
  System.out.println("lの値: " + l);
                               ^
  シンボル:   変数 l
  場所: クラス ForTest2
エラー1個

③ はwhileループのブロック内で使える.
% java ForTest2.java 
for繰り返し: 0周め
for繰り返し: 1周め
for繰り返し: 2周め
for繰り返し: 3周め
for繰り返し: 4周め
次のループ（周）に進む
for繰り返し: 6周め
for繰り返し: 7周め
for繰り返し: 8周め
for繰り返し: 9周め
kの初期値: 1
while繰り返し: 1周め, lの値: 5
while繰り返し: 2周め, lの値: 5
while繰り返し: 3周め, lの値: 5
while繰り返し: 4周め, lの値: 5
while繰り返し: 5周め, lの値: 5
プログラム終了!
kの値: 6

★ 変数には必ず目的があり、なんでも大外のブロックに定義すれば良いと言うものではない.
→ なんのために使うのか、は明確なため、「変数はどこからどこまで使いたいのか？」を考えておく必要がある.
→ スコープは使用する部分に限定する方が良い.

★ あまりスコープを広くし過ぎると、誤って使用される場合もあるため、用途に合わせてスコープを限る.

*/
