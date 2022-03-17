package me.divine.viewmodel;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.Toml4jConfigSerializer;
import net.fabricmc.api.ModInitializer;

public class ViewModel implements ModInitializer {
    public static final ViewModelConfig CONFIG = AutoConfig.register(ViewModelConfig.class, Toml4jConfigSerializer::new).getConfig();

    @Override
    public void onInitialize() {
        System.out.println("the ViewModel mod has been initialized");
    }
}
