package com.leclowndu93150.threadtweak.fabric;

import com.leclowndu93150.threadtweak.SmoothBoot;
import net.fabricmc.api.ModInitializer;

public class ThreadTweakFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        SmoothBoot.init();
    }
}
