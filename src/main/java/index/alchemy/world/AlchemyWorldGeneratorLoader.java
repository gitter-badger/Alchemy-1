package index.alchemy.world;

import net.minecraftforge.fml.common.LoaderState.ModState;
import index.alchemy.core.Init;

//@Init(state = ModState.PREINITIALIZED)
public class AlchemyWorldGeneratorLoader {
	
	public static final AlchemyWorldGenerator
			red_dragon_nest = new WorldGeneratorRedDragonNest();
	
	public static void init() {}

}