package com.leclowndu93150.threadtweak.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.leclowndu93150.threadtweak.Constants;
import com.leclowndu93150.threadtweak.SmoothBoot;
import net.minecraft.Util;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConfigHandler {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static SmoothBootConfig readConfig() throws IOException {
        String configPath = System.getProperty("user.dir") + "/config/" + Constants.MOD_ID + ".json";
        SmoothBoot.LOGGER.debug("Config path: " + configPath);

        SmoothBootConfig config;
        try (FileReader reader = new FileReader(configPath)) {
            config = GSON.fromJson(reader, SmoothBootConfig.class);
            if (config == null) {
                throw new NullPointerException();
            }
            config.validate();
            try (FileWriter writer = new FileWriter(configPath)) {
                GSON.toJson(config, writer);
            }

            SmoothBoot.LOGGER.debug("Config: " + config);
        } catch (NullPointerException | JsonParseException | IOException e) {
            config = new SmoothBootConfig();
            File file = new File(configPath);
            file.getParentFile().mkdirs();
            try (FileWriter writer = new FileWriter(configPath)) {
                GSON.toJson(config, writer);
                SmoothBoot.LOGGER.debug("New config file created");
            }
        }
        return config;
    }

    public static void openConfigFile() {
        String configPath = System.getProperty("user.dir") + "/config/" + Constants.MOD_ID + ".json";

        Util.getPlatform().openFile(new File(configPath));
    }
}
