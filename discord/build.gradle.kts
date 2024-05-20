plugins {
    `kotlin-plugin`

    application
}

dependencies {
    api("com.github.Carleslc.Simple-YAML", "Simple-Yaml", "1.8.4")

    api("ch.qos.logback", "logback-classic", "1.2.3")

    api("club.minnced", "jda-ktx", "0.11.0-beta.20")

    api("net.dv8tion", "JDA", "5.0.0-beta.22")

    api("ch.jalu", "configme", "1.4.1")
}

tasks {
    application {
        mainClass.set("bot.BeidouKt")
    }
}