- import文について.

- 何回もFQCNを書いて指定するのは冗長のため、importで省略できる.

- import文使用上の注意
- 異なるディレクトリ（a, b）に同じ名前のクラス「PackageZ」がある場合、当然両方をimportで省略はできない.
- → どちらか片方はFQCN フルネームで記述する必要がある. importが可能なのは1つまで.
~~~
anzairyuutou@B6-2B-D3-54-ED-DC Java_Udemy_basic % javac jp/co/anzai/pkgTest/PackageTest.java
jp/co/anzai/pkgTest/PackageTest.java:10: エラー: 同じ単純名の型がPackageZの単一型インポートによってすでに定義されています
import jp.co.anzai.pkgTest.b.PackageZ;
^
jp/co/anzai/pkgTest/PackageTest.java:23: エラー: PackageZの参照はあいまいです
    PackageZ.z();
    ^
  jp.co.anzai.pkgTest.aのクラス jp.co.anzai.pkgTest.a.PackageZとjp.co.anzai.pkgTest.bのクラス jp.co.anzai.pkgTest.b.PackageZの両方が一致します
jp/co/anzai/pkgTest/PackageTest.java:24: エラー: PackageZの参照はあいまいです
    PackageZ.z();
    ^
  jp.co.anzai.pkgTest.aのクラス jp.co.anzai.pkgTest.a.PackageZとjp.co.anzai.pkgTest.bのクラス jp.co.anzai.pkgTest.b.PackageZの両方が一致します
エラー3個
~~~

- 上記のようにエラーが出るため、面倒ではあるが、同じファイルがある場合はそれぞれFQCNで指定して呼び出す方がベターという場合.