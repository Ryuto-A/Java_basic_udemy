public class IfTest4 {
  public static void main(String[] args) {
    // If文中の{ }は、処理が１行のみの場合、省略してもよいというルールがある
    int myAge = 34;
    if(myAge == 35) 
      System.out.println("私の年齢は35歳！");
    else
      System.out.println("私の年齢は35歳ではないです！");
  
    System.out.println("私の出身地は・・・");

    // 処理が2行にまたがると、処理のブロックとして認識されない
    // 以下の場合は次のようなエラーが出る.
    // IfTest4.java:17: エラー: 'else'への'if'がありません.
    // myAge = 35;
    // if(myAge == 35) 
      // System.out.println("私の年齢は35歳！");
      // System.out.println("!!!");
    // else
      // System.out.println("私の年齢は35歳ではないです！");
  
    // System.out.println("私の出身地は・・・");

    // 2行以上の処理の場合は{ }で囲む必要がある.
    myAge = 35;
    if(myAge == 35) {
      System.out.println("私の年齢は35歳！");
      System.out.println("!!!");
    } else
      System.out.println("私の年齢は35歳ではないです！");
  
    System.out.println("私の出身地は・・・");

    // 注意が必要なパターン：　elseブロックにも{}が必要
    myAge = 35;
    if(myAge == 35) {
      System.out.println("私の年齢は35歳！");
      System.out.println("!!!");
    } else
      System.out.println("私の年齢は35歳ではないです！");
      System.out.println("???");
  
    System.out.println("私の出身地は・・・");

    // 上記の場合、コンパイルは通るが
    // elseの1行目のみがelseブロックとみなされており、
    // 「???」はただのプリントアウト処理として出てきてしまう.
    // → ２行以上の処理は必ず{}で囲む.
    // 可読性を考えて、1行の処理でも{ }は省略しない方が良い
    // 俗にいうクソコードになってしまう. 読みやすさを大切に.
 }
}
