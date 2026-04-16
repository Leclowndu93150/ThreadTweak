package com.leclowndu93150.threadtweak.forge;

import com.leclowndu93150.threadtweak.Constants;
import com.leclowndu93150.threadtweak.SmoothBoot;
import net.minecraftforge.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class ThreadTweakForge {

    public ThreadTweakForge() {
        SmoothBoot.init();
    }
}
