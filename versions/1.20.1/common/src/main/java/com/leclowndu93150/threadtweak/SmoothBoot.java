package com.leclowndu93150.threadtweak;

import com.leclowndu93150.threadtweak.config.ConfigHandler;
import com.leclowndu93150.threadtweak.config.SmoothBootConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class SmoothBoot {

    public static final Logger LOGGER = LogManager.getLogger(Constants.MOD_NAME);

    public static SmoothBootConfig config;

    public static boolean initConfig = false;
    public static boolean initBootstrap = false;
    public static boolean initMainWorker = false;
    public static boolean initIOWorker = false;

    public static void init() {

    }

    public static void regConfig() {
        try {
            config = ConfigHandler.readConfig();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }

        LOGGER.info(Constants.MOD_NAME + " config initialized");
    }

    public static int getMaxBackgroundThreads() {
        String string = System.getProperty("max.bg.threads");
        if (string != null) {
            try {
                int i = Integer.parseInt(string);
                if (i >= 1 && i <= 255) {
                    return i;
                }
            }
            catch (NumberFormatException ignored) {}
        }
        return 255;
    }
}
