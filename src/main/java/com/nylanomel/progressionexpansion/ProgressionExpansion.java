package com.nylanomel.progressionexpansion;

import com.nylanomel.progressionexpansion.util.RegistryHandler;
import com.nylanomel.progressionexpansion.world.gen.OreGen;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("progexpansion")
@Mod.EventBusSubscriber(modid = ProgressionExpansion.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ProgressionExpansion {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "progexpansion";

    public ProgressionExpansion() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }
    @SubscribeEvent
    public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
        OreGen.generateOre();
    }

    public static final ItemGroup TAB = new ItemGroup("progExpansion") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.COPPER_BAR.get());
        }
    };
}
