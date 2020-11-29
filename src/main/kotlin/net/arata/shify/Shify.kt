package net.arata.shify

import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.SidedProxy
import cpw.mods.fml.common.event.FMLInitializationEvent
import cpw.mods.fml.common.event.FMLPostInitializationEvent
import cpw.mods.fml.common.event.FMLPreInitializationEvent
import net.arata.common.CommonProxy
import org.apache.logging.log4j.LogManager

@Mod(modid = Shify.MODID, name = Shify.MODNAME, version = Shify.VERSION)
class Shify {

    companion object {
        const val MODID = "shify"
        const val MODNAME = "Shify"
        const val VERSION = "0.0.1"

        @SidedProxy(clientSide = "net.arata.client.ClientProxy", serverSide = "net.arata.common.CommonProxy")
        lateinit var proxy: CommonProxy

        @Mod.Instance(MODID)
        lateinit var instance: Shify

        val logger = LogManager.getLogger("net.arata.shify.Shify")
    }

    @Mod.EventHandler
    fun preInit(event: FMLPreInitializationEvent) {
        proxy.preInit(event)
    }

    @Mod.EventHandler
    fun init(event: FMLInitializationEvent) {
        proxy.init(event)
    }

    @Mod.EventHandler
    fun postInit(event: FMLPostInitializationEvent) {
        proxy.postInit(event)
    }

}