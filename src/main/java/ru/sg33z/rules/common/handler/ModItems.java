package ru.sg33z.rules.common.handler;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import ru.sg33z.rules.common.items.WandItem;

public class ModItems {
    public static final WandItem WAND = new WandItem();


    public static final Item.ToolMaterial RUBY_TOOL_MATERIAL = EnumHelper.addToolMaterial("ruby", 4, 1800, 16F, 5F, 30);

    public static void register() {
        GameRegistry.registerItem(WAND, "wand");


    }
}
