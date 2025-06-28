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

    System.out.println();   // （）のみにすると空行で改行を表示できる.

    // 配列で表現する. ↓配列宣言.「String型の配列」.
    String[] customer;    // 宣言時は[]は空っぽのままで宣言.
//    customer = "鈴木太郎";  ← String[]とStringは同じものではない.
//    customer[0] = "鈴木太郎";  ← これだけではエラーになる.配列を宣言した後, 配列の初期化をせずにいきなり値を代入できない.
    customer = new String[3];   // ←これが「配列の初期化」. これ以降値を代入できる.
    customer[0] = "鈴木太郎";   // ※ 配列の1番目は「0」から始まる. これを「添字」または「index」といい，その値が入っている箱を「要素」という.
    customer[1] = "suzuki_taro@xxxx.com";   // [1]で2番目.
    customer[2] = "090-0000-9999";   // [2]で３番目.
    System.out.println(customer[0]);
    System.out.println(customer[1]);
    System.out.println(customer[2]);

    // 表示上は同じものが表示される.

    System.out.println();   // （）のみにすると空行で改行を表示できる.

    // 違う配列宣言のパターン.

//    String[] customer2;
//    customer2 = {"鈴木太郎", "suzuki_taro@xxxx.com", "090-0000-9999"}; 
    //↑これだとエラーになる. ★ { }で初期化する場合、宣言と初期化を分けることができない.

    // 以下のように、new 型名[] {} で初期化する場合、宣言と初期化を分けられる.
//    String[] customer2;
//    customer2 = new String[] {"鈴木太郎", "suzuki_taro@xxxx.com", "090-0000-9999"};

    // 実際の現場では、以下のように new String[] を省略して、宣言と初期化を同時に記述するのが普通.
    String[] customer2 = {"鈴木太郎", "suzuki_taro@xxxx.com", "090-0000-9999"};
    // ↑ { }の中で配列の個数が決まっているため、[3]のような宣言が要らなくなる.
    System.out.println(customer[0]);
    System.out.println(customer[1]);
    System.out.println(customer[2]);
    // これでも同じように表示される.

    // 配列の個数が少ない場合はこのように書くのが現場では一般的.
    // 配列の個数があまりにも多い場合は別の方法がある.
  }
}
