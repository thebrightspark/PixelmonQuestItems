package brightspark.pixelmonquestitems.datagen;

import brightspark.pixelmonquestitems.PQIItems;
import brightspark.pixelmonquestitems.PixelmonQuestItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.RegistryObject;

public class PQIItemModelProvider extends ItemModelProvider {
	private final ResourceLocation PARENT = mcLoc("item/generated");

	public PQIItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, PixelmonQuestItems.MOD_ID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		PQIItems.ITEMS.getEntries().stream()
			.map(RegistryObject::get)
			.forEach(this::itemModel);
	}

	@SuppressWarnings("ConstantConditions")
	private void itemModel(Item item) {
		ResourceLocation rl = item.getRegistryName();
		String path = rl.getPath();
		singleTexture(path, PARENT, "layer0", modLoc("item/" + path));
	}
}
