package valeri.beatwave;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import valeri.beatwave.block.ModBlocks;
import valeri.beatwave.item.ModItems;

public class Beatwave implements ModInitializer {
	public static final String MOD_ID = "beatwave";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}