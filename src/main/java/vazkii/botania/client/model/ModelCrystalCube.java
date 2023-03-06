/**
 * This class was created by <wiiv>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * 
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 * 
 * File Created @ [? (GMT)]
 */
package vazkii.botania.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelCrystalCube extends ModelBase {
	public ModelRenderer cube;
	public ModelRenderer base1;
	public ModelRenderer base2;
	public ModelRenderer base3;

	public ModelCrystalCube() {
		textureWidth = 48;
		textureHeight = 48;
		cube = new ModelRenderer(this, 0, 0);
		cube.setRotationPoint(0.0F, 12.0F, 0.0F);
		cube.addBox(-4.0F, -4.0F, -4.0F, 8, 8, 8, 0.0F);
		base1 = new ModelRenderer(this, 24, 0);
		base1.setRotationPoint(0.0F, 16.0F, 0.0F);
		base1.addBox(-3.0F, 7.0F, -3.0F, 6, 2, 6, 0.0F);
		base2 = new ModelRenderer(this, 0, 16);
		base2.setRotationPoint(0.0F, 0.0F, 0.0F);
		base2.addBox(-5.0F, 3.0F, -5.0F, 10, 4, 10, 0.0F);
		base1.addChild(base2);
		base3 = new ModelRenderer(this, 0, 30);
		base3.setRotationPoint(0.0F, 0.0F, 0.0F);
		base3.addBox(-5.0F, 3.0F, -5.0F, 10, 5, 10, 0.0F);
		base1.addChild(base3);
	}

	public void renderBase() {
		float f5 = 1F / 16F;
		base1.render(f5);
	}

	public void renderCube() {
		float f5 = 1F / 16F;
		cube.render(f5);
	}

	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
