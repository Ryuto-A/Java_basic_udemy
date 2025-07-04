public class RefVariableTest {
  public static void main(String[] args) {
    // 基本データ型変数の宣言と初期化について.
    int num1 = 1;
    int num2 = 1;   // num1と2は同じ「１」が入っているように見えるが、別々の値として保管されている.
    num2 += 1;
    System.out.println("num1の値:" + num1);
    System.out.println("num1の値:" + num2);

    System.out.println();
  
    // 参照型変数の宣言と初期化について.
/*
    int[] numArray1 = {1, 2};
    int[] numArray2 = {1, 2};   // 同じ配列だが別々の情報.
    numArray2[1] += 1;    // numArray2の「2」に1を加える　→ {1, 3}になる.
 
    // ※ 配列の中身を表示するときは、forループでないと表示できない.

    for (int i = 0; i < numArray1.length; i++) {
    System.out.println("numArray1の[" + i + "]の中身:" + numArray1[i]);
    System.out.println("numArray2の[" + i + "]の中身:" + numArray2[i]);
    // → 表示内容は、
    // numArray1の[0]の中身:1
    // numArray2の[0]の中身:1
    // numArray1の[1]の中身:2
    // numArray2の[1]の中身:3
    // となる.
   }
*/

System.out.println();

// 変数に変数を代入するパターンを考える.
    num1 = 1;
    num2 = num1;   // num1を代入
    num2 += 1;
    System.out.println("num1の値:" + num1);  //「1」が表示される.
    System.out.println("num1の値:" + num2);  //「2」が表示される.

    System.out.println();

    // 配列に配列を代入.
    int[] numArray1 = {1, 2};
    int[] numArray2 = numArray1;   // numArray1を代入？.
    numArray2[1] += 1;    // {1,3}になる？.
 
    // ※ 配列の中身を表示するときは、forループでないと表示できない.

    for (int i = 0; i < numArray1.length; i++) {
    System.out.println("numArray1の[" + i + "]の中身:" + numArray1[i]);  // {1, 2}？.
    System.out.println("numArray2の[" + i + "]の中身:" + numArray2[i]);  // {1, 3}？.
    // → 表示結果は.
    // numArray1の[0]の中身:1
    // numArray2の[0]の中身:1
    // numArray1の[1]の中身:3
    // numArray2の[1]の中身:3
    // となってしまう. → numArray1 = {1, 3} , numArray2 = {1, 3} になっている.
   }
   // 参照型： アドレスで参照している.
   // → 配列は、ロッカーに荷物を入れて鍵をするイメージ.
   // 今回の場合、numArray1というロッカーに{1, 2}という荷物を入れて鍵をした.
   // その鍵を、numArray2のロッカーに入れた.というイメージ.（合鍵を作るイメージ）
   // その後、numArray2の鍵を使ってnumArray1の荷物を取り出し、情報を書き換えた(numArray2[1] +=1した)ため、.
   // 結果としてnumArray1の情報も書き換えられてしまった.
   // 荷物が入っているロッカーの鍵をアドレスという.

   // ★ 具体的な意味.
   // int[] numArray1 = {1, 2}; の記述で、 {1, 2}という情報（本体）を記憶した場所（「アドレス」）を、numArray1 という変数に入れた、という意味.
   // int[] numArray2 = numArray1; の記述で、numArray1の場所（アドレス）をnumArray2にコピーしている.
   // → ★ 場所をコピーしたので、 numArra1 からも numArray2 からも、同時に {1, 2}という配列を見る（操作する）ことができる.
   // 変数に具体的な値ではなく、場所の情報を入れている型を「参照型」という.ロッカーでいう「鍵」のこと.
  }
}
