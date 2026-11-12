package com.example.fusionfrontier;

import com.mojang.brigadier.Command;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(FusionFrontierMod.MOD_ID)
public final class FusionFrontierMod {
    public static final String MOD_ID = "fusion_frontier";

    public FusionFrontierMod() {
        MinecraftForge.EVENT_BUS.addListener(this::registerCommands);
    }

    private void registerCommands(RegisterCommandsEvent event) {
        event.getDispatcher().register(Commands.literal("fusionfrontier")
            .then(Commands.literal("guide")
                .executes(context -> {
                    context.getSource().sendSuccess(() -> Component.literal(
                        "Fusion Frontier progression: explore for resources, build basic power, " +
                        "advance through Create and Mekanism, then prepare for dimension and hero content."
                    ), false);
                    context.getSource().sendSuccess(() -> Component.literal(
                        "Balance tip: use early-tier machines and crafted gear before pursuing high-tier " +
                        "armor or superhero abilities. Check JEI for recipes and pack quest guidance."
                    ), false);
                    return Command.SINGLE_SUCCESS;
                }))
            .then(Commands.literal("about")
                .executes(context -> {
                    context.getSource().sendSuccess(() -> Component.literal(
                        "Fusion Frontier Companion for Minecraft 1.20.1 on Forge."
                    ), false);
                    return Command.SINGLE_SUCCESS;
                })));
    }
}
