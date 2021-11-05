import com.lambda.client.plugin.api.Plugin

internal object PluginExample: Plugin() {

    override fun onLoad() {
        // Load any modules, commands, or HUD elements here
        modules.add(com.lambda.client.util.TickTimer)
        modules.add(com.lambda.client.event.SafeClientEvent)
        modules.add(com.lambda.client.event.events.ConnectionEvent)
        modules.add(com.lambda.client.util.threads.runSafe)
        modules.add(com.lambda.client.util.threads.safeListener)
        modules.add(com.lambda.commons.interfaces.DisplayEnum)
        modules.add(com.lambda.event.listener.listener)
        modules.add(net.minecraft.util.MovementInputFromOptions)
        modules.add(net.minecraftforge.client.event.InputUpdateEvent)
        modules.add(net.minecraftforge.fml.common.gameevent.TickEvent)
        commands.add(CommandExample)
        hudElements.add(LabelHudExample)
    }

    override fun onUnload() {
        // Here you can unregister threads etc...
    }
}
