package valeri.beatwave.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import valeri.beatwave.Beatwave;

public class ModItems {

    public static final Item RADIO = registerItem("radio", new Item(new Item.Settings()));
    public static final Item MP3_PLAYER = registerItem("mp3_player", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Beatwave.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Beatwave.LOGGER.info("Registering Mod Items for " + Beatwave.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(RADIO);
            entries.add(MP3_PLAYER);
        });
    }
}
