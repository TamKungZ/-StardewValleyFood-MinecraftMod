
package th.tamkungz.sdvf.potion;

import th.tamkungz.sdvf.procedures.EnergyOnEffectActiveTickProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class EnergyEffectMobEffect extends MobEffect {
	public EnergyEffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16738048);
	}

	@Override
	public String getDescriptionId() {
		return "effect.sdvf.energy_effect";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		EnergyOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
