package brightspark.questmakersarsenal;

import brightspark.questmakersarsenal.datagen.QAItemModelProvider;
import brightspark.questmakersarsenal.datagen.QALangProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(QuestmakersArsenal.MOD_ID)
public class QuestmakersArsenal {
	public static final String MOD_ID = "questmakersarsenal";

	public QuestmakersArsenal() {
		IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
		modBus.addListener(this::gatherData);
		QAItems.ITEMS.register(modBus);
	}

	private void gatherData(GatherDataEvent event) {
		if (event.includeClient()) {
			DataGenerator generator = event.getGenerator();
			generator.addProvider(new QAItemModelProvider(generator, event.getExistingFileHelper()));
			generator.addProvider(new QALangProvider(generator));
		}
	}
}
