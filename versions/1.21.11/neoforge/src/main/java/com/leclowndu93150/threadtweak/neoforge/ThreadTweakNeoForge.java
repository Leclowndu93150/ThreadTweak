package com.leclowndu93150.threadtweak.neoforge;

import com.leclowndu93150.threadtweak.Constants;
import com.leclowndu93150.threadtweak.SmoothBoot;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class ThreadTweakNeoForge {

    public ThreadTweakNeoForge(IEventBus eventBus) {
        SmoothBoot.init();
    }
}
