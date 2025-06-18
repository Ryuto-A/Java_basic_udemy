public class AndOrTest {
  public static void main(String[] args) {
    // AND文による条件の接続「且つ」.
    int myAge = 35;           // 年齢
    char myBloodType = 'O';   // 血液型
    if(myAge == 35 && myBloodType == 'B') {    // 年齢と血液型の両方が一致する場合
        System.out.println("私の年齢は35歳で血液型はB型です！");
    } else if (myAge == 35 && myBloodType == 'A') {
        System.out.println("私の年齢は35歳で血液型はA型です！");
    } else if(myAge == 40 && myBloodType == 'A') {
        System.out.println("私の年齢は40歳で血液型はA型です！");
    } else {
        System.out.println("私の年齢と血液型は、あなたの考えていることとは異なります！");
    }
    System.out.println("私の出身地は・・・");

    // OR「または」
  }
}
