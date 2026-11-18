package com.cart3r;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;

public class CART3RCivilizations implements ModInitializer {

    @Override
    public void onInitialize() {
        CommandRegistrationCallback.EVENT.register(
            (dispatcher, registryAccess, environment) -> {
                dispatcher.register(
                    Commands.literal("cart3r")
                        .then(Commands.literal("status")
                            .executes(context -> {
                                context.getSource().sendSuccess(
                                    () -> Component.literal(
                                        "CART3R Civilizations v0.2.0 is online!"
                                    ),
                                    false
                                );
                                return 1;
                            })
                        )
                );
            }
        );

        System.out.println("[CART3R] Civilizations initialized!");
    }
}
