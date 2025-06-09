# Home Automation App

这是一个简单的安卓家庭控制中心示例应用。项目包含 `core` 模块负责设备和自动化逻辑，`app` 模块提供 Android UI。

## 构建

需要安装 JDK17 以及 Android SDK。然后执行：

```bash
./gradlew assembleDebug
```

如果环境缺少 Android SDK，可在 `local.properties` 中指定 `sdk.dir`。

首次运行前请执行 `gradle wrapper` 以生成 `gradle-wrapper.jar` 文件。该二进制文件未包含在仓库中。
