package brightspark.pixelmonquestitems.datagen;

import brightspark.pixelmonquestitems.PQIItems;
import brightspark.pixelmonquestitems.PixelmonQuestItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class PQILangProvider extends LanguageProvider {
	public PQILangProvider(DataGenerator generator) {
		super(generator, PixelmonQuestItems.MOD_ID, "en_us");
	}

	@Override
	protected void addTranslations() {
		add("itemGroup." + PixelmonQuestItems.MOD_ID, "Pixelmon Quest Items");

		addItem(PQIItems.FOLDER, "Folder");
		addItem(PQIItems.RED_BOOK, "Red Book");
		addItem(PQIItems.BLUE_BOOK, "Blue Book");
		addItem(PQIItems.YELLOW_BOOK, "Yellow Book");
		addItem(PQIItems.GREEN_BOOK, "Green Book");
		addItem(PQIItems.ORANGE_BOOK, "Orange Book");
		addItem(PQIItems.PURPLE_BOOK, "Purple Book");
		addItem(PQIItems.SCROLL, "Scroll");
		addItem(PQIItems.TRADING_CARD, "Trading Card");
		addItem(PQIItems.BRONZE_MEDAL, "Bronze Medal");
		addItem(PQIItems.SILVER_MEDAL, "Silver Medal");
		addItem(PQIItems.GOLD_MEDAL, "Gold Medal");
		addItem(PQIItems.MILITARY_MEDAL, "Military Medal");
		addItem(PQIItems.ROCK, "Rock");
		addItem(PQIItems.STATUETTE, "Statuette");
		addItem(PQIItems.SILVER_RING, "Silver Ring");
		addItem(PQIItems.SKULL, "Skull");
		addItem(PQIItems.URN, "Urn");
	}
}
