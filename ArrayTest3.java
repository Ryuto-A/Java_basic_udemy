public class ArrayTest3 {
  public static void main(String [] args) {

  // 配列の初期化の仕方の使い分けについて.

    // 一つ一つ要素を入れるパターン.
    // → 条件分岐をさせてその都度、値（中身）が変わっていく場合に用いると良い.
    // 例：後付けで要素が追加される場合　など.
  
    System.out.println("パターン１");

    int a = 3;
    String[] customer;
    customer = new String[3];
    switch(a) {
      case 1:
          customer[0] = "鈴木太郎";
          customer[1] = "suzuki_taro@xxxx.com";
          customer[2] = "090-0000-9999";
          break;
          // ３つとも入れる.
      case 2:
          customer[0] = "鈴木太郎";
          customer[1] = "suzuki_taro@xxxx.com";
          break;
          // 名前とメールアドレスのみ.
          // → 3つ目は「null」になる.
      case 3:
          customer[0] = "鈴木太郎";
          break;
          // 名前のみ.
          // → 2つ目、3つ目が「null」になる.

//      default: 今回はなし.
    }

    for (int i = 0; i < customer.length; i++) {
      if (customer[i] != null) {      // if文を用いて、nullじゃないときにのみ表示させる.
      System.out.println(customer[i]);
      // 「a=2や3の時」に、「null」が出なくなる.
      }
    }

    System.out.println();   // （）のみにすると空行で改行を表示できる.

// パターン２
//　配列の変数を宣言して、要素の初期化と中身の決定を同時に行うパターン.
// → 最初から配列の中身が決まっている場合に使える.
// ※ 上のパターンのように、配列の要素の中身が変わる場合には向かない.

// 以下のように、switch caseを用いて配列の要素を入れることはできない.
/*    String[] customer2 = {"鈴木太郎", "suzuki_taro@xxxx.com", "090-0000-9999"};
      switch(a) {
      case 1:
          customer2 = {"鈴木太郎", "suzuki_taro@xxxx.com", "090-0000-9999"};
      case 2:
      customer2 = {"鈴木太郎", "suzuki_taro@xxxx.com"};

      case 3:
      customer2 = {"鈴木太郎"};
  }
*/
// しかし、以下のようにnew String[]{ };で指定すればコンパイルできる.
    System.out.println("パターン２");
    a = 1;
    String[] customer2;   // breakを忘れると一番下まで行ってしまうので注意.
        switch(a) {
          case 1:
              customer2 = new String[] {"鈴木太郎", "suzuki_taro@xxxx.com", "090-0000-9999"};
              break;
          case 2:
              customer2 =new String[] {"鈴木太郎", "suzuki_taro@xxxx.com"};
              break;
          default:
              customer2 = new String[] {"鈴木太郎"};
              break;
         }
         for(String customer2Value : customer2){
            System.out.println(customer2Value);
         }

 }
}