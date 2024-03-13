package bdmajora.backport.mixin;

import net.minecraft.client.render.entity.PlayerRenderer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = PlayerRenderer.class, remap = false)
public class PlayerRendererMixin {
}
