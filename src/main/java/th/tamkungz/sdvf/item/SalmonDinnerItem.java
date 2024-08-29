
package th.tamkungz.sdvf.item;

import th.tamkungz.sdvf.procedures.FriedEggFoodEatenProcedure;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import java.util.List;

public class SalmonDinnerItem extends Item {
	public SalmonDinnerItem() {
		super(new Item.Properties().stacksTo(42).rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(16).saturationMod(0.5f).build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 38;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0f;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("The lemon spritz makes it special."));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		FriedEggFoodEatenProcedure.execute();
		return retval;
	}
}
