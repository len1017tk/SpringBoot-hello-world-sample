# Spring Boot Hello World Sample
Hello Worldを出力するSampleプロジェクトです。

本プロジェクトの作成は以下を参考にしました。
参考：https://spring.pleiades.io/quickstart

## 起動方法
### ボリュームの作成
Mavenによってダウンロードされるjarファイルを永続化させるため、Dockerの`m2`ボリュームを使用します。  
`m2`ボリュームが作成されていない場合は、以下のコマンドで作成します。
```
$ docker volume create --name=m2
```

### コンテナの起動
Dockerコンテナを起動する。
```
$ docker compose up
```
`docker-compose up`によって同時にSpringBootの起動も行われます。
`Started HelloWorldSampleApplication`がコンソールに出力されると起動完了です。

## 動作確認方法
次のURLにアクセスし、HelloWorldと表示されていれば問題なく動作しています。
http://localhost:8080/