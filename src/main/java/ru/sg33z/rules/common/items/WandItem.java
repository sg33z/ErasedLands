package ru.sg33z.rules.common.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import ru.sg33z.rules.Sg33zMod;

    public class WandItem extends ItemFood {
        public WandItem() {
            super(10, 5F, false);
            setPotionEffect(1, 30, 50, 0.9f);

            setUnlocalizedName("erasedlands:wand");
            setTextureName(Sg33zMod.MOD_ID + ":wand");
            setMaxStackSize(64);
            setHasSubtypes(true);


        }
        @Override
        protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
            super.onFoodEaten(stack, world, player);

            if (!world.isRemote) {
                ItemStack newItemStack = new ItemStack(this);
                world.setWorldTime(world.getWorldTime() + 50000);
            }

    }}
