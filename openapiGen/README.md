


スケルトン生成
---
1. `gradlew genApi:generate`

-  genAPi/build/gen にgradle projectが生成される

スケルトンをプロジェクトに取り込み
---

1. genAPi/build/gen を Projectにコピー  
   例: `./gen/ `
   
2. projectに依存関係を生成  
   settings.gradle.ktsに `include("gen:xxx")`  
   build.gradle.ktsに `dependencies {implementation(project("gen:xxx"))}`
   を追加
   
3. Windows環境ではエラーが出る場合があるのでgen/xxx/build.gradle.ktsを下記のように削除
```
//    iosArm64() { binaries { framework { freeCompilerArgs.add("-Xobjc-generics") } } }
//    iosX64() { binaries { framework { freeCompilerArgs.add("-Xobjc-generics") } } }
```

スケルトンの使用
---
```

```


参照
---
- OpenAPI Generator: https://openapi-generator.tech/
