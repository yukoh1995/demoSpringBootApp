# demoSpringBootApp
SpringBootを使用したサンプルWebアプリケーション

SpringBoot,Vueその他システムの勉強用

- サーバ起動コマンド
```
mvn spring-boot:run
```
これは`spring-boot-maven-plugin`がpom.xmlのpluginに入っているから叩ける。

- mysql接続コマンド
```
mysql -h127.0.0.1 -uroot -P3306 -p
```
プロジェクト内のdocker-compose.ymlから作られるmysqlコンテナ
