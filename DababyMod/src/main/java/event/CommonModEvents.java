package event;

import Dababy.DababyEntityFinal;
import Dababy.DababyMod;
import common.entity.ExampleEntity;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = DababyMod.MODID, bus = Bus.MOD)
public class CommonModEvents {
	
	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(DababyEntityFinal.EXAMPLE_ENTITY.get(), ExampleEntity.createAttributes().build());
	}
}
