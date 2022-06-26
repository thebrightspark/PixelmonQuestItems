package brightspark.pixelmonquestitems;

import brightspark.pixelmonquestitems.datagen.PQIItemModelProvider;
import brightspark.pixelmonquestitems.datagen.PQILangProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(PixelmonQuestItems.MOD_ID)
public class PixelmonQuestItems {
	public static final String MOD_ID = "pixelmonquestitems";

	public PixelmonQuestItems() {
		IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
		modBus.addListener(this::gatherData);
		PQIItems.ITEMS.register(modBus);
	}

	private void gatherData(GatherDataEvent event) {
		if (event.includeClient()) {
			DataGenerator generator = event.getGenerator();
			generator.addProvider(new PQIItemModelProvider(generator, event.getExistingFileHelper()));
			generator.addProvider(new PQILangProvider(generator));
		}
	}
}
