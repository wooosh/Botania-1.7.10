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

public class ModelDilutedPool extends ModelPool {
	public static final float bboxHeight = 6/16F;
	public static final float borderWidth = 1/16F;

	public ModelDilutedPool() {
		textureWidth = 64;
		textureHeight = 64;

		base = new ModelRenderer(this, 0, 0);
		base.addBox(0F, 0F, 0F, 16, 1, 16);
		base.setRotationPoint(-8F, 23F, -8F);

		side1 = new ModelRenderer(this, 0, 27);
		side1.addBox(0F, 0F, 0F, 16, 5, 1);
		side1.setRotationPoint(-8F, 18F, 7F);

		side2 = new ModelRenderer(this, 0, 17);
		side2.addBox(0F, 0F, 0F, 16, 5, 1);
		side2.setRotationPoint(-8F, 18F, -8F);

		side3 = new ModelRenderer(this, 0, 36);
		side3.addBox(0F, 0F, 0F, 1, 5, 16);
		side3.setRotationPoint(-8F, 18F, -8F);

		side4 = new ModelRenderer(this, 17, 36);
		side4.addBox(0F, 0F, 0F, 1, 5, 16);
		side4.setRotationPoint(7F, 18F, -8F);
	}

	public float getMinManaHeight() {
		return 1/16F;
	}

	public float getMaxManaHeight() {
		return 5/16F;
	}
}