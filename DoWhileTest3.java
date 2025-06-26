public class DoWhileTest3 {
  public static void main(String[] args) {
    int n = 0;
    String result = "";
    do {
        result += "B";
        n++;
    } while (n < 2);
    System.out.println(result);
  }
}
// BBB が表示される. 