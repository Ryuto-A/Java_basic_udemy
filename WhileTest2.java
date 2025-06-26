public class WhileTest2 {
  public static void main(String[] args) {
    int n = 2;
    String result = "";
    while (n > 0) {
        result += "A";
        n--;
    }
    System.out.println(result);
  }
}
// AA が表示される.