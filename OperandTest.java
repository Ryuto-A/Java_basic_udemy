public class OperandTest {
  public static void main(String[] args) {
    int number1 = 1 + 1;    // 「1」というリテラルはint型として自動的に認識.
    System.out.println(number1);
    //int number2 = 1 + 1l; ← 「1l」というリテラルにすると、大きい方に自動的に合わされ、long型として保存されてしまう.
    
    int number2 = (int)(1 + 1l);   //int型にキャストするとコンパイルできる.
    System.out.println(number2);
    
    long number3 = 1 + 1;
    System.out.println(number3);    // 「l」はPCに認識させるだけであり、表示される際は「2」になる.

    double number4 = 1.0 + 1;   // 片方少数にすると、「1」も少数として扱われる.
    System.out.println(number4);

    float number5 = 1.0F + 1;       // float型はあまり使わない.
    System.out.println(number5);

    boolean torf = true;    // 真偽値はtrueかfalseしか入らない.
    System.out.println(torf);

    char number6 = '1';   // ''はchar型として認識される.
    System.out.println(number6);

    String number7 = "1";   // ""で囲む時点でString型として認識される.
    System.out.println(number7);

    // ここから演算子の説明
    int number8 = 1;
    number8 += 1;    // 初期化の後に代入演算子を用いてインクリメントできる.
    System.out.println(number8);

    int number9 = 1;
    number9 -= 1;    // 1-1=0になる.
    System.out.println(number9);

    int number10 = 1;
    number10 *= 1;    // 1*1=1になる.
    System.out.println(number10);

    int number11 = 1;
    number11 /= 1;    // 1/1=1になる.
    System.out.println(number11);

    int number12 = 1;
    number12 %= 1;    // 割り算したあまりを返す(今回は0) → 偶数or奇数の判定に活用する.
    System.out.println(number12);

    // インクリメントの説明. これも代入と考えられる.
    int number13 = 11;
    ++number13;    // 「11」に1を加える 11 + 1 = 12になる.
    System.out.println(number13);

    int number14 = 11;
    --number14;    //  11 - 1 = 10になる.
    System.out.println(number14);
  }
}
