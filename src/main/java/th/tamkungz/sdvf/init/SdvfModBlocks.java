
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package th.tamkungz.sdvf.init;

import th.tamkungz.sdvf.block.SterdewUndergroundBlock;
import th.tamkungz.sdvf.block.StardewGrassBlock;
import th.tamkungz.sdvf.block.GrassBlockBlock;
import th.tamkungz.sdvf.SdvfMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

public class SdvfModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SdvfMod.MODID);
	public static final RegistryObject<Block> STARDEW_GRASS = REGISTRY.register("stardew_grass", () -> new StardewGrassBlock());
	public static final RegistryObject<Block> STERDEW_UNDERGROUND = REGISTRY.register("sterdew_underground", () -> new SterdewUndergroundBlock());
	public static final RegistryObject<Block> GRASS_BLOCK = REGISTRY.register("grass_block", () -> new GrassBlockBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			StardewGrassBlock.blockColorLoad(event);
			SterdewUndergroundBlock.blockColorLoad(event);
		}
	}
}
