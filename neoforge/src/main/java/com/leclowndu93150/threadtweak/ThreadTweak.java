package com.leclowndu93150.threadtweak;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class ThreadTweak {

    public ThreadTweak(IEventBus eventBus) {
        SmoothBoot.init();
    }
}
