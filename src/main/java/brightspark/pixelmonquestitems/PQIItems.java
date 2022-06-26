package brightspark.pixelmonquestitems;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class PQIItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PixelmonQuestItems.MOD_ID);

	public static final RegistryObject<Item> FOLDER = item("folder", 64);

	public static final RegistryObject<Item> RED_BOOK = item("red_book", 16);
	public static final RegistryObject<Item> BLUE_BOOK = item("blue_book", 16);
	public static final RegistryObject<Item> YELLOW_BOOK = item("yellow_book", 16);
	public static final RegistryObject<Item> GREEN_BOOK = item("green_book", 16);
	public static final RegistryObject<Item> ORANGE_BOOK = item("orange_book", 16);
	public static final RegistryObject<Item> PURPLE_BOOK = item("purple_book", 16);
	public static final RegistryObject<Item> SCROLL = item("scroll", 16);
	public static final RegistryObject<Item> TRADING_CARD = item("trading_card", 16);

	public static final RegistryObject<Item> BRONZE_MEDAL = item("bronze_medal", 1);
	public static final RegistryObject<Item> SILVER_MEDAL = item("silver_medal", 1);
	public static final RegistryObject<Item> GOLD_MEDAL = item("gold_medal", 1);
	public static final RegistryObject<Item> MILITARY_MEDAL = item("military_medal", 1);
	public static final RegistryObject<Item> ROCK = item("rock", 1);
	public static final RegistryObject<Item> STATUETTE = item("statuette", 1);
	public static final RegistryObject<Item> SILVER_RING = item("silver_ring", 1);
	public static final RegistryObject<Item> SKULL = item("skull", 1);
	public static final RegistryObject<Item> URN = item("urn", 1);

	private static final ItemGroup GROUP = new ItemGroup(PixelmonQuestItems.MOD_ID) {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(TRADING_CARD.get());
		}
	};

	private static RegistryObject<Item> item(String name, int stackSize) {
		return ITEMS.register(name, () -> new Item(new Item.Properties().stacksTo(stackSize).tab(GROUP)));
	}
}
