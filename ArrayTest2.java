public class ArrayTest2 {
  public static void main(String [] args) {
        // 表示させるときに、通常のfor文を用いるパターン.
        String[] customer = {"鈴木太郎", "suzuki_taro@xxxx.com", "090-0000-9999"};

        for (int i = 0; i < 3; i++) {
            System.out.println(customer[i]);
        }
            // 以下のコードと同じものが表示される.
//            System.out.println(customer[0]);
//            System.out.println(customer[1]);
//            System.out.println(customer[2]);        

        System.out.println();
        
        // for文内の ② 条件式　をシンプルにできる.かつミスが減る.
        for (int i = 0; i < customer.length; i++) {
          System.out.println(customer[i]);
        }// 「customer.length」で配列の長さを全て指定できるため、いちいち数字を変えなくて良い.

        System.out.println();

        // for文内の ② 条件式　をミスした場合はエラーになる.
//        for (int i = 0; i < 5; i++) {
//          System.out.println(customer[i]);
//        }
//上記の場合のエラー.
// →、Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3at ArrayTest2.main(ArrayTest2.java:25).

        System.out.println();

        // 拡張for文を用いる.　→  これは配列にしか使えない構文.
        // 拡張for文は、「（新しい変数）：（代入する変数）」で定義する.
        // 代入なので「＝」かと思うが、慣例上「：」になっている.
        // 「：の右側の値」を「：の左側の変数」に１つずつ順番に代入していく　という意味構文.
 
        for (String customerValue : customer) {
          System.out.println(customerValue);    // ループして配列の要素が無くなるまで表示される.
        }
        // 表示としては上記と同じ内容.
        // メリット：数を数えて条件を考えることがなくて良い. デメリット：「１つずつ全て」実行する場合にしか使えない.
  }
}
