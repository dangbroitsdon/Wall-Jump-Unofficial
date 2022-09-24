package genandnic.walljump.util.registry.config;

import genandnic.walljump.WallJump;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

import java.util.Collections;
import java.util.List;

@Config(name = WallJump.MOD_ID)
public class WallJumpConfigEntries implements ConfigData {
    @Comment("Allows you to wall cling and wall jump.")
    public boolean enableWallJump = true;

    @Comment("If you disable Wall Jump, it enables the enchantment automagically, this option disables the enchantment.")
    @ConfigEntry.Gui.RequiresRestart
    public boolean enableWallJumpEnchantment = false;

    @Comment("Blacklists block inputted; can't Wall Jump off it, format is 'block.(mod name or minecraft).(name)', use underscores as spaces")
    public List<String> blockBlacklist = Collections.emptyList();

    @Comment("Enables Elytra Wall Cling: Clinging to the Wall with Elytra Deployed.")
    public boolean enableElytraWallCling = false;

    @Comment("Classic Wall Cling which allows Crouch, the reason this can't be keybinded is because Fabric doesn't support Multi Mapping.")
    @ConfigEntry.Gui.RequiresRestart
    public boolean enableClassicWallCling = false;

    @Comment("Allows you to climb up without alternating walls.")
    public boolean enableReclinging = false;

    @Comment("Automagically turn the player when wall clinging.")
    public boolean enableAutoRotation = false;

    @Comment("Height of Wall Jumps")
    public double heightWallJump = 0.55;

    @Comment("Ticks wall clinged before starting wall slide.")
    public int delayWallClingSlide = 35;

    @Comment("Exhaustion gained per wall jump.")
    public double exhaustionWallJump = 0.8;

    @Comment("Allows you to jump in mid-air")
    public boolean enableDoubleJump = true;

    @Comment("If you disable Double Jump, it enables the enchantment automagically, this option disables the enchantment.")
    @ConfigEntry.Gui.RequiresRestart
    public boolean enableDoubleJumpEnchantment = false;

    @Comment("Changes the Jump Count for Double Jump so you can instead have a Triple Jump or even a Quadruple Jump.")
    public int countDoubleJump = 1;

    @Comment("Exhaustion gained per double jump.")
    public double exhaustionDoubleJump = 1.2;

    @Comment("Play a rush of wind as you fall to your doom.")
    public boolean playFallingSound = true;

    @Comment("Minimum distance for fall damage sound to play; set to 3.0 to disable.")
    public double minFallDistance = 7.5;

    @Comment("Elytra speed boost; set to 0.0 to disable.")
    public double elytraSpeedBoost = 0.0;

    @Comment("Sprint speed boost; set to 0.0 to disable.")
    public double sprintSpeedBoost = 0.0;

    @Comment("If you disable Speed Boost, it enables the enchantment automagically, this option disables the enchantment.")
    @ConfigEntry.Gui.RequiresRestart
    public boolean enableSpeedBoostEnchantment = false;

    @Comment("Walk up steps even while airborne, also jump over fences.")
    public boolean enableStepAssist = true;
}
