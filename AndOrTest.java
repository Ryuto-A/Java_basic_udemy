public class AndOrTest {
  public static void main(String[] args) {
    // AND文による条件の接続「且つ」.「&&」で表す.
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

    // OR文による条件の接続「または」　「||」で表す.
    myAge = 50;           // 年齢
    myBloodType = 'O';   // 血液型
    if(myAge == 35 || myBloodType == 'B') {    // 年齢と血液型の片方が一致する場合
        System.out.println("私の年齢は35歳または血液型はB型です！");
    } else if (myAge == 35 || myBloodType == 'A') {
        System.out.println("私の年齢は35歳または血液型はA型です！");
    } else if(myAge == 40 || myBloodType == 'O') {
        System.out.println("私の年齢は40歳または血液型はA型です！");
    } else {
        System.out.println("私の年齢と血液型は、あなたの考えていることとは異なります！");
    }
    System.out.println("私の出身地は・・・");
  
    // 補足　String型で比較をする場合は、「＝＝」で繋がない方が良い. 詳細は後の動画.
    // "AB"型で比較するためには、「＝＝」ではなく「.equals("AB")」にする.
    myAge = 40;           // 年齢
    String myBloodType2 = "不明";   // 血液型
    if(myAge == 35 || myBloodType2.equals("B")) {    // 年齢と血液型の片方が一致する場合
        System.out.println("私の年齢は35歳または血液型はB型です！");
    } else if (myAge == 35 || myBloodType2.equals("A")) {
        System.out.println("私の年齢は35歳または血液型はA型です！");
    } else if(myAge == 40 || myBloodType2.equals("O")) {
        System.out.println("私の年齢は40歳または血液型はO型です！");
    } else if(myAge == 40 || myBloodType2.equals("AB")) {
        System.out.println("私の年齢は40歳または血液型はAB型です！");
    } else {
        System.out.println("私の年齢と血液型は、あなたの考えていることとは異なります！");
    }
    System.out.println("私の出身地は・・・");
  }
}
