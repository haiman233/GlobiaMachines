package me.fhoz.globiamachines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.fhoz.globiamachines.machines.BudgetDustFabricator;
import me.fhoz.globiamachines.utils.GlobiaItems;

import javax.annotation.Nonnull;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

public final class GlobiaItemSetup {

    // ItemGroup
    private static final NestedItemGroup globiamachines = new NestedItemGroup(
            new NamespacedKey(GlobiaMachines.getInstance(), "globiaslimefun"),
            new CustomItemStack(Material.SMOKER, "&Globia Slimefun")
    );


    private GlobiaItemSetup() {
    }

    public static void setup(@Nonnull GlobiaMachines plugin) {
        new BudgetDustFabricator(globiamachines, GlobiaItems.BUDGET_DUST_FABRICATOR,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.GRINDSTONE), new ItemStack(Material.GRINDSTONE),
                new ItemStack(Material.GRINDSTONE),
                SlimefunItems.GOLD_PAN, new ItemStack(Material.DIAMOND), SlimefunItems.GOLD_PAN,
                SlimefunItems.MAGNET, new ItemStack(Material.WATER_BUCKET), SlimefunItems.MAGNET
        }).register(plugin);
    }

}
