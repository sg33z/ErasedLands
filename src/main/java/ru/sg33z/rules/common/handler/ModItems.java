package ru.sg33z.rules.common.handler;

import cpw.mods.fml.common.registry.GameRegistry;
import ru.sg33z.rules.common.items.WandItem;

public class ModItems {
    public static final WandItem WAND = new WandItem();

    public static void register() {
        GameRegistry.registerItem(WAND, "wand");
    }
}
