package com.dorasuzublog.simpleoreexpansion;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.RegisterEvent;
import net.neoforged.neoforge.registries.RegisterEvent.RegisterHelper;

@Mod(SimpleOreExpansion.MODID)
public class SimpleOreExpansion {
    public static final String MODID = "simpleoreexpansion";

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventsSubscriber {
        
        @SubscribeEvent
        public void onEvent() {
            
        }
    }
}