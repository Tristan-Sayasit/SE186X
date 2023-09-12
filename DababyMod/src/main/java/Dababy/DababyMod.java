package Dababy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(DababyMod.MODID)
public class DababyMod {
	public static final String MODID = "dababymod";
		
	public DababyMod() {
		var bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		DababyEntityFinal.ENTITIES.register(bus);
	}
}