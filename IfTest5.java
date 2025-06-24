public class IfTest5 {
  public static void main(String[] args) {
    int a = 5;
    int b = 10;
    if(a == 6 || --b == 10) { // 前置デクリメントでは「--b」は「9」になるため「9 == 10」は不成立になる.
      System.out.println("1つ目条件成立！");
    } else {
      System.out.println("1つ目条件不成立！");
    }

    // 後置デクリメントの場合. 前置と後置で比較する.
    a = 5;
    b = 10;
    if(a == 6 || b-- == 10) {
      // 後置デクリメントでは「--b」は「10」のままになってしまい（デクリメントされていない）、成立してしまう.
      System.out.println("2つ目条件成立！");
    } else {
      System.out.println("2つ目条件不成立！");
    }

    // 短略評価とは？.
    a = 5;
    b = 11;
    if(++a == 6 || --b == 10) {
      // --前置インクリメント、デクリメントのため、a=6、b=10となり成立する.
      System.out.println("3つ目条件成立！");
      System.out.println("a:" + a);
      System.out.println("b:" + b);   // 成立する場合、a,bの値を表示する.この場合「a:6」、「b:11」と表示される.
    } else {
      System.out.println("3つ目条件不成立！");
    }
  
    // 後置デクリメントの場合.
    a = 5;
    b = 11;
    if(a++ == 6 || b-- == 10) { // --前置インクリメント、デクリメントのため「a=6, b=10」となり成立する.
      System.out.println("4つ目条件成立！");
      System.out.println("a:" + a);
      System.out.println("b:" + b);
    } else {
      System.out.println("4つ目条件不成立！");
    }

    // 「OR」における短略評価：　条件が成立するのに計算されないパターン.
    a = 5;
    b = 11;
    if(++a == 6 || --b == 10) {   // 前置インクリメントのため、「a=6、b=10」となり成立する.
      System.out.println("5つ目条件成立！");
      System.out.println("a:" + a);
      System.out.println("b:" + b); // しかし、表示された数値は「a:6, b:11」となっている.
    } else {
      System.out.println("5つ目条件不成立！");
      // ORの場合、「左の条件||右の場合」として、「左の条件式」が成立すると、「右の条件式」を無視する.
    }

    // 「AND」における短略評価１：　ANDの場合は両方の条件し成立を吟味する.
    a = 5;
    b = 11;
    if(++a == 6 && --b == 10) {   // 前置インクリメントのため、「a=6、b=10」となり成立する.
      System.out.println("6つ目条件成立！");
      System.out.println("a:" + a);
      System.out.println("b:" + b); // 表示された数値は「a:6, b:10」とbも正しく計算されている.
    } else {
      System.out.println("6つ目条件不成立！");
      // 
    }
    // 「AND」における短略評価２：　後置インクリメントで、「左の条件式」が成立しない場合、「右の条件式」を評価しなくなる.
    a = 5;
    b = 11;
    if(a++ == 6 && --b == 10) {   // 後置インクリメントのため、「a=5、b=10」となり不成立となるはず.
      System.out.println("6つ目条件成立！");
    } else {
      System.out.println("6つ目条件不成立！");
      System.out.println("a:" + a);
      System.out.println("b:" + b);
      //実際には「a:6、b:11」となり、前置で計算されるはずだったbの計算（右の条件式の吟味）がされていない.
    }
    // まとめ： 短絡評価とは　ORの場合：左が成立すると右を評価しない. ANDの場合：左が成立しないと右を評価しない.
    
    // 実際にはインクリメント・デクリメントを条件式に入れることはコードが煩雑になるため書かない.
    a = 5;
    b = 11;
    a++;
    b--;
    if(a == 6 && b == 10) {
      System.out.println("7つ目条件成立！");
      System.out.println("a:" + a);
      System.out.println("b:" + b);
    } else {
      System.out.println("7つ目条件不成立！");
      // 「a:6、b:10」となる。　このほうがクリーンでわかりやすく、見やすいコードを心がける.
      // Javaのブロンズ試験などでは演算子の処理は問われることがある.
    }
    // 重要：　後置インクリメントについての確認.
    int x = 5;
    int y =x++;
    System.out.println("x="+ x + ",y=" + y);    // 「x=6,y=5」と出力される.
    // 後置インクリメントは、変数の現在の値を返した後に、変数の値を１増やす.
    // そのため、yにはxの下の値「5」が代入され、その後にxにインクリメントされて表示される.
 }
}
