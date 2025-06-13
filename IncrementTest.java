public class IncrementTest {
  public static void main(String[] args) {
    int number = 11;
    // number++ としても, ++number としても,12になる.
    System.out.println(number++ +2);    // 右側にインクリメントすると,プリント処理の後に加算される.
    // ↑注意が必要.処理に時差が生じるため、「13」が表示される.
    // 具体的には、「number++を表示させる処理」の後、「number + 2」が行われている.
    System.out.println(number +2);    // numberはこの時点で「12」になっているため、「14」が表示される.

    // 他の演算子と組み合わせる場合、左側にインクリメントをかくことが好ましい.
    number = 11;
    System.out.println(++number +2); //インクリメント（11+1）を計算してから+2をしているため、「14」が表示される.
    System.out.println(number +2);  //これも「14」(インクリメント後の12 +2)が表示される.
    // ただし、この後学ぶforループでは右側にインクリメントをつけている.なぜか処理に問題はない.
    //用語：左側につけるインクリメントを「前置インクリメント（--はデクリメント）」という.
    // 右側につけるインクリメントを「後置インクリメント」という.
  }
  
}