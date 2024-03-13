package bdmajora.backport.mixin.Entity;

import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.world.Dimension;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = EntityPlayer.class, remap = false)
public class EntityPlayerMixin {
	@Unique
	private double[] lastOverworldCoords = null;
	@Unique
	private EntityPlayer thisAs = (EntityPlayer)(Object)this;
	@Inject(method = "tick()V", at = @At("TAIL"))
	private void addAchievement(CallbackInfo ci){
		if (thisAs.world.getWorldTime() / thisAs.world.worldType.getDayNightCycleLengthTicks() >= 100){
		}
		if (lastOverworldCoords != null && thisAs.distanceToSqr(lastOverworldCoords[0], lastOverworldCoords[1], lastOverworldCoords[2]) > 10000 && thisAs.dimension == Dimension.overworld.id){ // Not actually the proper way to implement this
		}
	}
	@Inject(method = "handlePortal(I)V", at = @At("TAIL"))
	private void portal(int portalTileId, CallbackInfo ci){
		if (thisAs.dimension == Dimension.overworld.id){
			lastOverworldCoords = new double[3];
			lastOverworldCoords[0] = thisAs.x;
			lastOverworldCoords[1] = thisAs.y;
			lastOverworldCoords[2] = thisAs.z;
		}
	}
}

