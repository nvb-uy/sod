package elocindev.grassoverhaul.blocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;

public class SodStair extends StairsBlock {
	public SodStair(Block blockType) {
		super(blockType.getDefaultState(), FabricBlockSettings.copyOf(blockType));
	}
}