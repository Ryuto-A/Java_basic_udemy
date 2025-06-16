public class SwitchTest {
  public static void main (String[] args) {
    int myAge = 50;
    switch(myAge) {
      case 5:
        System.out.println("私の年齢は5歳です！");
        break;
      case 15:
        System.out.println("私の年齢は15歳です！");
        break;
      case 25:
        System.out.println("私の年齢は25歳です！");
        break;
      case 35:
        System.out.println("私の年齢は35歳です！");
        break;
      case 45:
        System.out.println("私の年齢は45歳です！");
        break;
      default:
        System.out.println("私の年齢はその他です！");
      // 基本的に各条件分岐でbreak;を入れる必要がある.
      // 入れないと該当するcaseの下が全て実行されてしまう.
      // あえてbreak;を抜くという手法もあるが、状況によりけり.
    }
 }
}
