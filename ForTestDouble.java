public class ForTestDouble {
  public static void main(String[] args) {
    for(int i = 1; i <= 2; i++){    //　外側は2周する
      System.out.print("【iの値: " + i + "周目】");
      for(int j = 1; j <= 3; j++) {    // ここから2重ループ. 内側は3周する.
        System.out.print("jの値:" + j + " ");
      }
      System.out.println();  //　← 内側のループ終了で改行を挿入.
    }
    // 実際の表示： 【iの値: 1周目】jの値:1 jの値:2 jの値:3 
    //　　　　　　　【iの値: 2周目】jの値:1 jの値:2 jの値:3 
    // ↑表示されるのは、「iの値：１」の下に「jの値：１」〜「３」、次に「iの値：２」「jの値：１」〜「３」で終了する.
    // → 外側のループ１周目で　内側のjループを３周分完了（内側のfor文がfalseになるまで）させる.
    // → 外側のループ２周目で　また内側のjループを３周分完了（１周目のiループと同様）させる.
  }
}
