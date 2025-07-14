package jp.co.anzai.pkgTest;    // パッケージ宣言. 「ここに、以下のPackagetestというクラスを入れる」という意味.
// ★ パッケージを利用するためには、フォルダを作成し、そこへ格納しておく必要がある.

// 下記のように、importでファイルを指定できる.
// 全てのクラスをimportしたい場合、「*」を用いる.

import jp.co.anzai.pkgTest.a.*;
import jp.co.anzai.pkgTest.b.*;

import jp.co.anzai.pkgTest.a.PackageZ;

public class PackageTest {
  public static void main(String[] args) {
    jp.co.anzai.pkgTest.a.PackageA.a();   // ←「jp.co.anzai.pkgTest.a の　PackageA クラスの a() メソッド」という意味.場所し示さなければならない.
    jp.co.anzai.pkgTest.b.PackageB.b();   // FQCN で指定する. フルネームで指定しないといけない.

    //import文で省略可能.
    PackageA.a();
    PackageB.b();

    // 異なるフォルダにある同じファイル名を実行する場合.
    PackageZ.z();
    jp.co.anzai.pkgTest.b.PackageZ.z();  // どちらか片方はフルネームにしなければならない.

    // たくさんのクラスを呼び出す場合.
    PackageA.a();
    PackageA1.a();
    PackageA2.a();
    PackageA3.a();
    PackageA4.a();
    PackageA5.a();

    PackageB.b();
    PackageB1.b();
    PackageB2.b();
    PackageB3.b();
    PackageB4.b();
    PackageB5.b();
  }
}

/* 実行結果1
% java jp/co/anzai/pkgTest/PackageTest.java

PackageA.a() が実行されました
PackageB.b() が実行されました
PackageA.a() が実行されました   ← import文で省略可能. 実行できる.
PackageB.b() が実行されました

実行結果2 *でフォルダ内のクラスを全てimportできる.
% java jp/co/anzai/pkgTest/PackageTest.java 
PackageA.a() が実行されました
PackageB.b() が実行されました
PackageA.a() が実行されました
PackageB.b() が実行されました
PackageA.z() が実行されました
PackageB.z() が実行されました
PackageA.a() が実行されました
PackageA1.a() が実行されました
PackageA2.a() が実行されました
PackageA3.a() が実行されました
PackageA4.a() が実行されました
PackageA5.a() が実行されました
PackageB.b() が実行されました
PackageB1.a() が実行されました
PackageB2.a() が実行されました
PackageB3.a() が実行されました
PackageB4.a() が実行されました
PackageB5.a() が実行されました
*/