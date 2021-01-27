
開発手順
---
1. Intellij で File > New > Project
2. project m1 を作成
3. File > New > Module
4. project m2 を作成
5. m1/build.gradle.kts の kotlin("jvm") からversionを削除
```
plugins {
    kotlin("jvm") //version "1.4.21"
}
```

ビルド
---
gradlew build

-  関連ファイルがダウンロードされるだけ

