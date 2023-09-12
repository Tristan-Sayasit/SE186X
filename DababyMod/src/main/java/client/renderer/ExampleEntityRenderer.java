package client.renderer;

import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import common.entity.ExampleEntity;
import Dababy.DababyMod;
import client.model.ExampleEntityModel;

public class ExampleEntityRenderer<Type extends ExampleEntity> extends MobRenderer<Type, ExampleEntityModel<Type>> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(DababyMod.MODID, 
			"textures/entities/example_entity.png");
	public ExampleEntityRenderer(Context context) {
		super(context, new ExampleEntityModel<>(), 0.5f);
		}	

	@Override
	public ResourceLocation getTextureLocation(Type entity) {
		return TEXTURE;
	}
	
}