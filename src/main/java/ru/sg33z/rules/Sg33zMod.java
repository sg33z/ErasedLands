package ru.sg33z.rules;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import ru.sg33z.rules.common.CommonProxy;

@Mod(modid = "erasedlands", version = "0.1")
public class Sg33zMod
{
    public static final String MOD_ID = "erasedlands";
    @SidedProxy(
            clientSide = "ru.sg33z.rules.client.ClientProxy",
            serverSide = "ru.sg33z.rules.common.CommonProxy"
    )
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

}
