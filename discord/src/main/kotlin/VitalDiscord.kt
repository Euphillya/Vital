import dev.minn.jda.ktx.jdabuilder.light
import net.dv8tion.jda.api.JDA

abstract class VitalDiscord(token: String) {

    protected val jda: JDA = light(token, enableCoroutines = true)

    abstract fun apply()

}