package caleb.keep.xp.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.entity.player.PlayerEntity;

@Mixin(PlayerEntity.class)
public class NoXpDropMixin {

	@Inject(method = "getXpToDrop", at = @At("RETURN"), cancellable = true)
	private void noXpToDrop(CallbackInfoReturnable<Integer> info) {
		info.setReturnValue(0);
	}
}
