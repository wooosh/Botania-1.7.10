/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * 
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 * 
 * File Created @ [Jan 25, 2014, 1:53:32 PM (GMT)]
 */
package vazkii.botania.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelPool extends ModelBase {
	ModelRenderer base;
	ModelRenderer side1;
	ModelRenderer side2;
	ModelRenderer side3;
	ModelRenderer side4;

	public static final float bboxHeight = 8/16F;
	public static final float borderWidth = 2/16F;

	public ModelPool() {
		textureWidth = 64;
		textureHeight = 64;

		base = new ModelRenderer(this, 0, 0);
		base.addBox(0F, 0F, 0F, 16, 2, 16);
		base.setRotationPoint(-8F, 22F, -8F);

		side1 = new ModelRenderer(this, 0, 26);
		side1.addBox(0F, 0F, 0F, 16, 6, 2);
		side1.setRotationPoint(-8F, 16F, 6F);

		side2 = new ModelRenderer(this, 0, 16);
		side2.addBox(0F, 0F, 0F, 16, 6, 2);
		side2.setRotationPoint(-8F, 16F, -8F);

		side3 = new ModelRenderer(this, 0, 36);
		side3.addBox(0F, 0F, 0F, 2, 6, 16);
		side3.setRotationPoint(-8F, 16F, -8F);

		side4 = new ModelRenderer(this, 18, 36);
		side4.addBox(0F, 0F, 0F, 2, 6, 16);
		side4.setRotationPoint(6F, 16F, -8F);
	}

	public void render() {
		float f = 1F / 16F;
		base.render(f);
		side1.render(f);
		side2.render(f);
		side3.render(f);
		side4.render(f);
	}

	public float getMinManaHeight() {
		return 2/16F;
	}

	public float getMaxManaHeight() {
		return 7/16F;
	}
}