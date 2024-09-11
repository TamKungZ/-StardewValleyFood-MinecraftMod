
package th.tamkungz.sdvf.potion;

import th.tamkungz.sdvf.procedures.HealthOnEffectActiveTickProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class HealthEffectMobEffect extends MobEffect {
	public HealthEffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -3407872);
	}

	@Override
	public String getDescriptionId() {
		return "effect.sdvf.health_effect";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		HealthOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
