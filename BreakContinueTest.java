public class BreakContinueTest {
  public static void main(String[] args){
    for(int i = 1; i <= 10; i++) {
      if(i == 5) {
        break;  // ループ処理を中断する.
      }
      System.out.println("繰り返し：" + i + "周目");
    }
    // この場合だと、「繰り返し：４周目」で処理が止まってしまう.

    // breakをprintlnの下に配置すれば「５周目」が表示される.
    for(int i = 1; i <= 10; i++) {
      System.out.println("繰り返し：" + i + "周目");
      if(i == 5) {
        break;
      }
    }
    // breakは無限ループとの組み合わせでよく用いられる.

    // continueとは？.
    // → 特定の条件（if文）のときに、continue以下の処理を行わず、ループ処理に戻る.
    for(int i = 1; i <= 10; i++) {
      if(i == 5) {
        System.out.println("次のループへ進む");
        continue;  // これ以下の処理を行わず、次のループへ進む. for文の{ }を終えたととらえている.
      }
      System.out.println("繰り返し：" + i + "周目");
    }
    // こうした場合、全体の処理は「10周」まで表示されるが、「繰り返し：５周目」だけは中断される.
  }
}
