
package net.cruleglare.outletcraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Checkbox;
import net.minecraft.client.Minecraft;

import net.cruleglare.outletcraft.world.inventory.MinephoneGUIMenu;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class MinephoneGUIScreen extends AbstractContainerScreen<MinephoneGUIMenu> {
	private final static HashMap<String, Object> guistate = MinephoneGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Checkbox EPod_Purchase;
	Checkbox Purchase_TV;

	public MinephoneGUIScreen(MinephoneGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 120;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("outletcraft:textures/minephone_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("outletcraft:textures/outlet.png"));
		this.blit(ms, this.leftPos + 93, this.topPos + 145, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Welcome to spamazon!", 7, 7, -12829636);
		this.font.draw(poseStack, "What would you like", 7, 34, -12829636);
		this.font.draw(poseStack, "to purchase?", 7, 43, -12829636);
		this.font.draw(poseStack, "By Crule-Glare", 12, 148, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		EPod_Purchase = new Checkbox(this.leftPos + 7, this.topPos + 70, 150, 20, new TextComponent("Purchase EPod"), false);
		guistate.put("checkbox:EPod_Purchase", EPod_Purchase);
		this.addRenderableWidget(EPod_Purchase);
		Purchase_TV = new Checkbox(this.leftPos + 7, this.topPos + 106, 150, 20, new TextComponent("Purchase TV"), false);
		guistate.put("checkbox:Purchase_TV", Purchase_TV);
		this.addRenderableWidget(Purchase_TV);
	}
}
