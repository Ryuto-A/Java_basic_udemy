public class ArrayTest4 {
  public static void main(String [] args) {
        // ArrayIndexOutOfBoundsException の原因と対処法.

        String[] customer;
        customer = new String[3];
        customer[0] = "鈴木太郎";
        customer[1] = "suzuki_taro@xxxx.com";
        customer[2] = "090-0000-9999";

        // 配列内の要素を全て取得する場合は以下のようなコード.
        for (int i = 0; i < customer.length; i++) {
          System.out.println(customer[i]);
        } // 「customer.length」で配列の長さを全て指定できるため、いちいち数字を変えなくて良い.

        // for文内の ② 条件式 を間違えた場合、ArrayIndexOutBoundsExceptionエラーになる.
        for (int i = 0; i < 4; i++) {
          System.out.println(customer[i]);
        }
        /* 上記を実行すると起こるエラー↓.
          Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
          at ArrayTest4.main(ArrayTest4.java:18)

          ★ エラーの読み解き.
          ・「at ArrayTest4.main(ArrayTest4.java:18)」　→ 「ArrayTest4.java の18行目を見てください」.
          ・「Index 3」は「customerの添え字は３」という意味.
          ・「OutOfBounds」は「範囲を超えている」の意味.
          ・「for length 3」は配列の要素の「個数が３」の意味.
          ・「Index 3」は要素の「４番目」を指している　という意味.
          ・「ArrayIndexOutOfBoundsException」の直訳「配列の要素の個数を超えて添え字を指定していますよ」の意味.
          ★ 添え字は「0」から始まるので、添え字の「３」は「４番目」を指している.
          ★ このエラーが出たときは行数を見る＆添え字をいくつを添えているのかをチェックする.
          → 今回の場合は「i < 3」と指定or「customer.length」で指定するのが対処法.
        */
  }
}
