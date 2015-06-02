package com.terminalbit.ContainerFiller;

import org.spongepowered.api.block.tileentity.TileEntity;
import org.spongepowered.api.block.tileentity.TileEntityTypes;
import org.spongepowered.api.block.tileentity.carrier.Dispenser;
import org.spongepowered.api.entity.player.Player;
import org.spongepowered.api.event.Subscribe;
import org.spongepowered.api.event.entity.player.PlayerInteractBlockEvent;
import org.spongepowered.api.item.inventory.Inventory;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.world.Location;

@Plugin(id="ContainerFiller", name="ContainerFiller", version="0.1")
public class ContainerFiller {
	@Subscribe
	public void onBlockInteract(PlayerInteractBlockEvent event){
		Location block = event.getBlock();
		Player caller = event.getUser();

		if (block.getTileEntity().isPresent()) {
			TileEntity clickedEntity = block.getTileEntity().get();
			if (event.getInteractionType().getName().equals("USE")) {
				if (clickedEntity.getType() == TileEntityTypes.DISPENSER) {
					Dispenser D = (Dispenser) clickedEntity.getBlock().getTileEntity().get();
					Inventory DInv = D.getInventory();
					DInv.
				}else if (clickedEntity.getType() == TileEntityTypes.CHEST) {
					
				}
			}
		}
	}
}
