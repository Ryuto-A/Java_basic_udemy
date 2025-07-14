package jp.co.anzai.pkgTest;    // パッケージ宣言. 「ここに、以下のPackagetestというクラスを入れる」という意味.
// ★ パッケージを利用するためには、フォルダを作成し、そこへ格納しておく必要がある.

public class PackageTest {
  public static void main(String[] args) {
    jp.co.anzai.pkgTest.a.PackageA.a();   // ←「jp.co.anzai.pkgTest.a の　PackageA クラスの a() メソッド」という意味.場所し示さなければならない.
    jp.co.anzai.pkgTest.b.PackageB.b();   // FQCN で指定する. フルネームで指定しないといけない.
  }
  
}
