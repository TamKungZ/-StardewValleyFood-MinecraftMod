
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package th.tamkungz.sdvf.init;

import th.tamkungz.sdvf.SdvfMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SdvfModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SdvfMod.MODID);
	public static final RegistryObject<CreativeModeTab> STARDEW_VALLEY_FOOD = REGISTRY.register("stardew_valley_food",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.sdvf.stardew_valley_food")).icon(() -> new ItemStack(SdvfModItems.FRIED_EGG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SdvfModItems.FRIED_EGG.get());
				tabData.accept(SdvfModItems.OMELET.get());
				tabData.accept(SdvfModItems.SALAD.get());
				tabData.accept(SdvfModItems.CHEESE_CAULIFLOWER.get());
				tabData.accept(SdvfModItems.BAKED_FISH.get());
				tabData.accept(SdvfModItems.PARSNIP_SOUP.get());
				tabData.accept(SdvfModItems.VEGETABLE_MEDLEY.get());
				tabData.accept(SdvfModItems.COMPLETE_BREAKFAST.get());
				tabData.accept(SdvfModItems.FRIED_CALAMARI.get());
				tabData.accept(SdvfModItems.STRANGE_BUN.get());
				tabData.accept(SdvfModItems.LUCKY_LUNCH.get());
				tabData.accept(SdvfModItems.FRIED_MUSHROOM.get());
				tabData.accept(SdvfModItems.PIZZA.get());
				tabData.accept(SdvfModItems.BEAN_HOTPOT.get());
				tabData.accept(SdvfModItems.GLAZED_YAMS.get());
				tabData.accept(SdvfModItems.CARP_SURPRISE.get());
				tabData.accept(SdvfModItems.HASHBROWNS.get());
				tabData.accept(SdvfModItems.PANCAKES.get());
				tabData.accept(SdvfModItems.SALMON_DINNER.get());
				tabData.accept(SdvfModItems.FIS_TACO.get());
				tabData.accept(SdvfModItems.CRISPY_BASS.get());
				tabData.accept(SdvfModItems.PEPPER_POPPERS.get());
				tabData.accept(SdvfModItems.BREAD.get());
				tabData.accept(SdvfModItems.TOM_KHA_SOUP.get());
				tabData.accept(SdvfModItems.TROUT_SOUP.get());
				tabData.accept(SdvfModItems.CHOCOLATE_CAKE.get());
				tabData.accept(SdvfModItems.PINK_CAKE.get());
				tabData.accept(SdvfModItems.RHUBARB_PIE.get());
				tabData.accept(SdvfModItems.COOKIE.get());
				tabData.accept(SdvfModItems.SPAGHETTI.get());
				tabData.accept(SdvfModItems.FRIED_EEL.get());
				tabData.accept(SdvfModItems.SPICY_EEL.get());
				tabData.accept(SdvfModItems.SASHIMI.get());
				tabData.accept(SdvfModItems.MAKI_ROLL.get());
				tabData.accept(SdvfModItems.TORTILLA.get());
				tabData.accept(SdvfModItems.RED_PLATE.get());
				tabData.accept(SdvfModItems.EGGPLANT_PARMESAN.get());
				tabData.accept(SdvfModItems.RICE_PUDDING.get());
				tabData.accept(SdvfModItems.ICE_CREAM.get());
				tabData.accept(SdvfModItems.BLUEBERRY_TART.get());
				tabData.accept(SdvfModItems.AUTUMN_BOUNTY.get());
				tabData.accept(SdvfModItems.PUMPKIN_SOUP.get());
				tabData.accept(SdvfModItems.SUPER_MEAL.get());
				tabData.accept(SdvfModItems.CRANBERRY_SAUCE.get());
				tabData.accept(SdvfModItems.STUFFING.get());
				tabData.accept(SdvfModItems.FARMER_LUNCH.get());
				tabData.accept(SdvfModItems.SURVIVAL_BURGER.get());
				tabData.accept(SdvfModItems.DISH_O_THE_SEA.get());
				tabData.accept(SdvfModItems.MINER_TREAT.get());
				tabData.accept(SdvfModItems.ROOTS_PLATTER.get());
				tabData.accept(SdvfModItems.TRIPLE_SHOT_ESPRESSO.get());
				tabData.accept(SdvfModItems.SEAFOAM_PUDDING.get());
				tabData.accept(SdvfModItems.ALGAE_SOUP.get());
				tabData.accept(SdvfModItems.PALE_BROTH.get());
				tabData.accept(SdvfModItems.PLUM_PUDDING.get());
				tabData.accept(SdvfModItems.ARTICHOKE_DIP.get());
				tabData.accept(SdvfModItems.STIR_FRY.get());
				tabData.accept(SdvfModItems.ROASTED_HAZELNUTS.get());
				tabData.accept(SdvfModItems.PUMPKIN_PIE.get());
				tabData.accept(SdvfModItems.RADISH_SALAD.get());
				tabData.accept(SdvfModItems.FRUIT_SALAD.get());
				tabData.accept(SdvfModItems.BLACKBERRY_COBBLER.get());
				tabData.accept(SdvfModItems.CRANBERRY_CANDY.get());
				tabData.accept(SdvfModItems.BRUSCHETTA.get());
				tabData.accept(SdvfModItems.COLESLAW.get());
				tabData.accept(SdvfModItems.FIDDLEHEAD_RISOTTO.get());
				tabData.accept(SdvfModItems.POPPYSEED_MUFFIN.get());
				tabData.accept(SdvfModItems.CHOWDER.get());
				tabData.accept(SdvfModItems.FISH_STEW.get());
				tabData.accept(SdvfModItems.ESCARGOT.get());
				tabData.accept(SdvfModItems.LOBSTER_BISQUE.get());
				tabData.accept(SdvfModItems.MAPLE_BAR.get());
				tabData.accept(SdvfModItems.CRAB_CAKES.get());
				tabData.accept(SdvfModItems.SHRIMP_COCKTAIL.get());
				tabData.accept(SdvfModItems.GINGER_ALE.get());
				tabData.accept(SdvfModItems.BANANA_PUDDING.get());
				tabData.accept(SdvfModItems.MANGO_STICKY_RICE.get());
				tabData.accept(SdvfModItems.POI.get());
				tabData.accept(SdvfModItems.TROPICAL_CURRY.get());
				tabData.accept(SdvfModItems.SQUID_INK_RAVIOLI.get());
				tabData.accept(SdvfModItems.SUPER_JOJA_COLA.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(SdvfModBlocks.STARDEW_GRASS.get().asItem());
			tabData.accept(SdvfModBlocks.STERDEW_UNDERGROUND.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(SdvfModBlocks.GRASS_BLOCK.get().asItem());
		}
	}
}
