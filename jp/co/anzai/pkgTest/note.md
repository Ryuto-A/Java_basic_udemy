- パッケージに関するノート.

- パッケージはディレクトリの階層.

- 以下のように、カレントディレクトリの下の階層の場合はコンパイル前に指定する.
~~~
% pwd
/Users/anzairyuutou/workspace/Java_Udemy_basic
% javac jp/co/anzai/pkgTest/PackageTest.java
% java jp/co/anzai/pkgTest/PackageTest.java 
PackageA.a() が実行されました
PackageB.b() が実行されました
~~~

- 上記のように、PackageTest全体を実行すると、PackageTest.javaで呼んでいるファイルもコンパイルされ、実行される.

- 実行するときの注意
- 実行の際、カレントディレクトリにないファイルは実行できない.
~~~
anzairyuutou@B6-2B-D3-54-ED-DC Java_Udemy_basic % java PackageTest.java 
エラー: メイン・クラスPackageTest.javaを検出およびロードできませんでした
原因: java.lang.ClassNotFoundException: PackageTest.java
~~~
- 用語「FQCN」：　「.」で繋がったカレントディレクトリ以下のファイルの名前（フルネーム）のこと.


- FQCNで指定する必要がある.
~~~
anzairyuutou@B6-2B-D3-54-ED-DC Java_Udemy_basic % java jp/co/anzai/pkgTest/PackageTest.java

PackageA.a() が実行されました
PackageB.b() が実行されました
~~~

- ポイント: PackageTestA.java, PackageTestB.java にはmainメソッドがないため、javaコマンドで実行しても何も起きない.

- 用語「クラスパス」：　パッケージを指定する（クラスを探しに行く）スタート地点（カレントディレクトリ）の位置（パス）のこと.

- ★ javaコマンドは、コンピュータ全体から検索して実行するコマンドではない.

- 用語「クラスローダー」：　クラスパスを起点として、パッケージを辿ってクラスを見つけに行く仕組みのこと. JDKの中に組み込まれている.全てのJava環境に組み込まれている.

- ★ コード内の「.」で区切られたファイル名（階層）と、UI上の「/」で区切られたファイル名は同等のもの.

- クラスパスはカレントディレクトリに移動しなくても実行することは指定できる.
