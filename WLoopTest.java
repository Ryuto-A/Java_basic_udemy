public class WLoopTest {
  public static void main(String[] args) {
    for(int i = 1; i <= 10; i++) {
      if(i == 5) {
        System.out.println("次のループへ進む");
        continue;
      }
      System.out.println("for繰り返し:" + i + "周目");
    }
    int k = 1;
    int l = 5;
    System.out.println("kの初期値:" + k);
    while(k <= 5) {
      System.out.println("while繰り返し:" + k + "周目");
      k++;
    }
    System.out.println("ブロックを抜けた後のlの値:" + l);
    System.out.println("プログラム終了！");
    System.out.println("kの終了値:" + k);
  }
}
