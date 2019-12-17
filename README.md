# RepluginSourceDemo

1. 新建android项目  
2. import module 分别引入
replugin-host-gradle、replugin-host-library、replugin-plugin-gradle、replugin-plugin-library

（注意：  
引入replugin-host-library时会自动引入子目录replugin-host-lib，同理replugin-plugin-library，带来的影响是需要同步修改replugin-host-lib下的build.gradle文件
由原来的
```
apply from: '../../rp-publish.gradle'

```
改为
```
apply from: '../rp-publish.gradle'

```
）

3. import module引入replugin-sample\host  自动引入app和utils 分别重命名吧（！！！）改为appSample utilsSample（名字随意 不冲突就行）
更改appSample的build.gradle（改为本地module依赖）

```
compile "com.qihoo360.replugin:replugin-host-lib:${RP_VERSION}"
```
改为

```
implementation project(path: ':replugin-host-lib')
```

（==注：gradle本地插件调试还需要修改配置==）

4.同理导入replugin-sample\plugin下的各个plugin 分别重命名  

5.运行appSample就可以源码调试了（只要可以正确依赖并且apk和源码匹配既可调试）  

源码更新于20191216 17：14  
replugin源码：  
https://github.com/Qihoo360/RePlugin  
参考  
https://www.jianshu.com/p/2244bab4b2d5
