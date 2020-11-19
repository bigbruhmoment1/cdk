package com.example.examplemod2.mixin;

import net.minecraft.client.Minecraft;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public abstract class MixinMinecraft {
    @Shadow
    @Final
    private static Logger LOGGER; //expect to be remapped to srg when compiled

    @Inject(method = "init", at = @At("HEAD"))
    public void init(CallbackInfo ci) {
        LOGGER.info("Example2 Mixin injected!");
    }
}
