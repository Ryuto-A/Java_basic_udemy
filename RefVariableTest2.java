public class RefVariableTest2 {
  public static void main(String[] args) {
    // nullとは？　NullPointerExceptionが発生する理由とは？.

    // 配列に配列を代入.
    int[] numArray1 = {1, 2};
    int[] numArray2 = numArray1;   // 参照型.
    numArray2[1] += 1;    // {1,3}になる？.
    numArray2 = null;  // numArray2に入れた鍵を捨てさせる → アドレスがなくなる.
    // ここで、numArray1の鍵（アドレス）は捨てていないので、参照できる.
 
    // ※ 配列の中身を表示するときは、forループでないと表示できない.

    for (int i = 0; i < numArray1.length; i++) {
    System.out.println("numArray1の[" + i + "]の中身:" + numArray1[i]);  // {1, 3}を取り出せる.
    // System.out.println("numArray2の[" + i + "]の中身:" + numArray2[i]);  ←これは鍵がないためエラーになる.

    /*エラー結果： anzairyuutou@B6-2B-D3-54-ED-DC Java_Udemy_basic % java RefVariableTest2.java 
                  numArray1の[0]の中身:1
                  Exception in thread "main" java.lang.NullPointerException: Cannot load from int array because "<local2>" is nullat RefVariableTest2.main(RefVariableTest2.java:16)
                    → "Cannot load from int array" 「int型配列から読み込めなかった」.
                    →「null」 とは、「参照するもの（鍵）がない」状態のこと.
                    → 「Pointer」は「参照」≒「アドレス」のこと.
                    ★ nullPointerException はよく出る（１位２位）エラーの一つ.
                    ＝ いわゆる「ぬるぽ」が出た状態.
                    ★ クライアントへの納品には非常に気をつけないといけない.
                  */

  }
 }
}
