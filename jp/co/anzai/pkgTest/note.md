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


