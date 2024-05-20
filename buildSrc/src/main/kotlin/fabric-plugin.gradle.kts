plugins {
    id("fabric-loom")

    id("java-plugin")
}

dependencies {
    minecraft("com.mojang", "minecraft", "1.20.6")

    mappings(loom.officialMojangMappings())

    modImplementation("net.fabricmc", "fabric-loader", "0.15.11")
    modImplementation("net.fabricmc.fabric-api", "fabric-api", "0.98.0+1.20.6")
}