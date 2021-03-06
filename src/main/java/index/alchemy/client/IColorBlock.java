package index.alchemy.client;

import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public interface IColorBlock {
	
    @SideOnly(Side.CLIENT)
    public IBlockColor getBlockColor();
    
}