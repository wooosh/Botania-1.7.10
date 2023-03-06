/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * 
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 * 
 * File Created @ [Jan 25, 2014, 1:55:05 PM (GMT)]
 */
package vazkii.botania.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelSpreader extends ModelBase {

	ModelRenderer cubeSide1;
	ModelRenderer cubeSide2;
	ModelRenderer cubeSide3;
	ModelRenderer cubeSide4;
	ModelRenderer cubeSide5;
	ModelRenderer cubeHole1;
	ModelRenderer cubeHole2;
	ModelRenderer cubeHole3;
	ModelRenderer cubeHole4;
	ModelRenderer cubeInside;

	// TODO: the wool model needs to be updates to fit the spreader more tightly 	
	public ModelSpreader() {
		textureWidth = 64;
		textureHeight = 80;

		// Directions are given as if from a player standing in front of the
		// path of the mana spreader.

		// Bottom face
		cubeSide1 = new ModelRenderer(this, 0, 0);
		cubeSide1.addBox(0F, 0F, 0F, 12, 1, 12);
		cubeSide1.setRotationPoint(-6F, 21F, -6F);

		// Top face
		cubeSide5 = new ModelRenderer(this, 0, 13);
		cubeSide5.addBox(0F, 0F, 0F, 12, 1, 12);
		cubeSide5.setRotationPoint(-6F, 10F, -6F);

		// Back face
		cubeSide3 = new ModelRenderer(this, 0, 26);
		cubeSide3.addBox(0F, 0F, 0F, 12, 12, 1);
		cubeSide3.setRotationPoint(-6F, 10F, -6F);

		// Right face
		cubeSide4 = new ModelRenderer(this, 0, 39);
		cubeSide4.addBox(0F, 0F, 0F, 1, 12, 12);
		cubeSide4.setRotationPoint(-6F, 10F, -6F);

		// Left face
		cubeSide2 = new ModelRenderer(this, 25, 39);
		cubeSide2.addBox(0F, 0F, 0F, 1, 12, 12);
		cubeSide2.setRotationPoint(5F, 10F, -6F);

		// Front left face
		cubeHole1 = new ModelRenderer(this, 0, 63);
		cubeHole1.addBox(0F, 0F, 0F, 4, 12, 1);
		cubeHole1.setRotationPoint(2F, 10F, 5F);

		// Front right face
		cubeHole2 = new ModelRenderer(this, 11, 63);
		cubeHole2.addBox(0F, 0F, 0F, 4, 12, 1);
		cubeHole2.setRotationPoint(-6F, 10F, 5F);

		// Front top face
		cubeHole3 = new ModelRenderer(this, 24, 63);
		cubeHole3.addBox(0F, 0F, 0F, 4, 4, 1);
		cubeHole3.setRotationPoint(-2F, 10F, 5F);

		// Front bottom face
		cubeHole4 = new ModelRenderer(this, 37, 63);
		cubeHole4.addBox(0F, 0F, 0F, 4, 12, 1);
		cubeHole4.setRotationPoint(-2F, 18F, 5F);


		cubeInside = new ModelRenderer(this, 32, 27);
		cubeInside.addBox(0F, 0F, 0F, 6, 6, 6);
		cubeInside.setRotationPoint(-3F, 13F, -3F);
	}

	public void render() {
		float f = 1F / 16F;
		cubeSide1.render(f);
		cubeSide2.render(f);
		cubeSide3.render(f);
		cubeSide4.render(f);
		cubeSide5.render(f);
		cubeHole1.render(f);
		cubeHole2.render(f);
		cubeHole3.render(f);
		cubeHole4.render(f);
	}

	public void renderCube() {
		float f = 1F / 16F;
		cubeInside.render(f);
	}
}