package bot

import VitalDiscord

class Beidou(token: String) : VitalDiscord(token) {

    override fun apply() {

    }
}

fun main() {
    Beidou(System.getenv("staging_discord_token")).apply()
}