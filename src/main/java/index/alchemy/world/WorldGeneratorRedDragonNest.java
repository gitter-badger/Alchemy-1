package index.alchemy.world;

import index.alchemy.api.Alway;
import index.alchemy.core.AlchemyModLoader;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.structure.StructureBoundingBox;

public class WorldGeneratorRedDragonNest extends AlchemyWorldGenerator {
	
	private BiomeGenBase ocean = BiomeGenBase.getBiome(0);
	private StructureBoundingBox need = new StructureBoundingBox(0, 0, 0, 16 * 9, 0, 16 * 9);
	private boolean start;

	@Override
	public void generate(Random random, int x, int z, World world,
			IChunkGenerator generator, IChunkProvider provider) {
		x *= 16;
		z *= 16;
		AlchemyModLoader.logger.info(Alway.getCurrentBiome(world, x, z));
		if (!start && Alway.getCurrentBiome(world, x, z) == ocean && should(world, x, z, need) && random.nextInt() > 900) {
			
		}
		
	}
	
	protected WorldGeneratorRedDragonNest() {
		super(10);
	}
	
	private boolean should(World world, int x, int z, StructureBoundingBox box) {
		for (int i = 0, xlen = box.getXSize(); i < xlen; i++) {
			for (int k = 0, zlen = box.getZSize(); k < zlen; k++) {
				if (world.getBlockState(new BlockPos(x + i, Alway.SEA_LEVEL, z + k)).getBlock() != Blocks.WATER) 
					return false;
			}
		}
		return true;
	}

}
