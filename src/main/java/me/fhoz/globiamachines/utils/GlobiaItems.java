package me.fhoz.globiamachines.utils;

import dev.j3fftw.extrautils.utils.LoreBuilderDynamic;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun4.utils.itemstack.ColoredFireworkStar;
import me.fhoz.globiamachines.machines.BudgetDustFabricator;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

/**
 * Specifies all plugin items
 */
public class GlobiaItems {

    private GlobiaItems() {
    }

    public static final SlimefunItemStack BUDGET_DUST_FABRICATOR = new SlimefunItemStack("BUDGET_DUST_FABRICATOR",
            Material.SMOKER,
            "&Budget Dust Fabricator",
            "",
            "&7An all-in-one machine that grinds, pans, and washes but in a budget way",
            LoreBuilder.machine(MachineTier.GOOD, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilderDynamic.powerBuffer(BudgetDustFabricator.CAPACITY),
            LoreBuilderDynamic.powerPerTick(BudgetDustFabricator.ENERGY_CONSUMPTION)
    );
}
