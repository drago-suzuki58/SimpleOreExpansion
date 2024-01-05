package com.dorasuzublog.simpleoreexpansion;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;

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