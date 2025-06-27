public class ArrayTest {
  public static void main(String[] args) {
    // ECサイトの会員情報の名前、メールアドレス、電話番号をイメージ.

    // 配列を使わない場合.
    String name = "鈴木太郎";                   //会員名称.
    String email = "suzuki_taro@xxxx.com";    // E-mailアドレス.
    String phone = "090-0000-9999";           // 電話番号.
    System.out.println(name);
    System.out.println(email);
    System.out.println(phone);

    // 配列で表現する. ↓配列宣言.「String型の配列」.
    String[] customer;    // 宣言時は[]は空っぽのままで宣言.
//    customer = "鈴木太郎";  ← String[]とStringは同じものではない.
//    customer[0] = "鈴木太郎";  ← これだけではエラーになる.配列を宣言した後, 配列の初期化をせずにいきなり値を代入できない.
    customer = new String[3];   // ←これが「配列の初期化」. これ以降値を代入できる.
    customer[0] = "鈴木太郎";   // ※ 配列の1番目は「0」から始まる. これを「添字」または「index」といい，その値を「要素」という.
    customer[1] = "suzuki_taro@xxxx.com";   // [1]で2番目.
    customer[2] = "090-0000-9999";   // [2]で３番目.
  }
}
