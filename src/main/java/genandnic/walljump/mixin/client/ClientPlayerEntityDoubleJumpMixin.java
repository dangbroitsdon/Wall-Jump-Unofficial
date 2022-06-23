package genandnic.walljump.mixin.client;

import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static genandnic.walljump.client.DoubleJumpLogic.doDoubleJump;

@Mixin(ClientPlayerEntity.class)
public abstract class ClientPlayerEntityDoubleJumpMixin{
    @Inject(method = "tickMovement", at = @At("TAIL"))
    private void doubleJumpTickMovement(CallbackInfo ci) {doDoubleJump();}
}
