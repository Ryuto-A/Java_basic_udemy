public class ForTest {
  public static void main(String[] args){
    for(int i = 0; i < 10; i++) {
      int n = i + 1;
      System.out.println("繰り返し：" + n + "周目");
    }

   // ②の条件式を「i <= 10」とすると？.
    for(int i = 0; i <= 10; i++) {
      int n = i + 1;
      System.out.println("繰り返し：" + n + "周目");
    }
    // 「繰り返し：11周目」が表示されるようになる.

    // nにしなくても良いのでは？.
    for(int i = 0; i <= 10; i++) {
      // int n = i + 1;
      // System.out.println("繰り返し：" + n + "周目");
      System.out.println("繰り返し：" + i + "周目");
    }
    // こうすると「繰り返し：0周目」が表示されてしまう.

    // 以下のようにスッキリさせることができる（①をi=1スタート）.
    for(int i = 1; i <= 10; i++) {
      System.out.println("繰り返し：" + i + "周目");
    } // 「繰り返し：１周目」〜「繰り返し：１0周目」まで表示される.
  }
}