package com.example.examplemod.mixin;

import net.minecraft.client.gui.screen.MainMenuScreen;
import org.apache.logging.log4j.LogManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MainMenuScreen.class)
public class ExampleMixin {
    @Inject(method = "init", at = @At("HEAD"))
    private void ExampleMixin(CallbackInfo ci) {
        LogManager.getLogger().info("Hello from an example mixin!");
    }
}
