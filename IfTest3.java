public class IfTest3 {
  public static void main(String[] args) {
    int myAge = 34;
    if(myAge == 35) {
      System.out.println("私の年齢は35歳!");
    } else if(myAge >= 40) {
      System.out.println("私の年齢は40歳以上です！");
    } else {
      System.out.println("私の年齢は35歳でも40歳以上でもないです");
    }
    System.out.println("私の出身地は・・・");

    // 字下げ（インデント）について.
    // 半角スペース2文字分、4文字分、8文字分の下げ方があり、現場によって異なる.
    // 現場のルールによって字下げの仕方を揃える.4文字下げが多いかも？.

    // 4文字分下げた場合
    myAge = 34;
    if(myAge == 35) {
        System.out.println("私の年齢は35歳!");
    } else if(myAge >= 40) {
        System.out.println("私の年齢は40歳以上です！");
    } else {
        System.out.println("私の年齢は35歳でも40歳以上でもないです");
    }
    System.out.println("私の出身地は・・・");

    // 字下げをするのはどこか？.
    // → ブロック（{}で囲まれた部分）で字下げを行う.
    // ① classブロックが最も外側.
    // 　　→ public class IfTest3 { }　の部分.
    // ② classブロックの内側にあるのがメソッドブロック.
    // 　　→ public static void main(String[] args) { }　の部分.
    // ③ メソッドブロックの内側にあるのがifブロック.
    // 　　→ if(my age == 35) { } の部分.
    // ④ else ifブロック、elseブロックはifブロックと並列.
    // ★ それぞれのブロックの処理の中身を示すためにインデントをする.
    // 注意：　字下げを適当にしてもコンパイルは処理できてしまう.
    // 人間が読むことを意識して生産性向上を意識することが大切.
    // ブロックの考え方を大切にする.プログラムを読むスピードが速くなる.
 }
}
