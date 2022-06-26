package brightspark.questmakersarsenal.datagen;

import brightspark.questmakersarsenal.QAItems;
import brightspark.questmakersarsenal.QuestmakersArsenal;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class QALangProvider extends LanguageProvider {
	public QALangProvider(DataGenerator generator) {
		super(generator, QuestmakersArsenal.MOD_ID, "en_us");
	}

	@Override
	protected void addTranslations() {
		add("itemGroup." + QuestmakersArsenal.MOD_ID, "Questmaker's Arsenal");

		addItem(QAItems.FOLDER, "Folder");
		addItem(QAItems.RED_BOOK, "Red Book");
		addItem(QAItems.BLUE_BOOK, "Blue Book");
		addItem(QAItems.YELLOW_BOOK, "Yellow Book");
		addItem(QAItems.GREEN_BOOK, "Green Book");
		addItem(QAItems.ORANGE_BOOK, "Orange Book");
		addItem(QAItems.PURPLE_BOOK, "Purple Book");
		addItem(QAItems.SCROLL, "Scroll");
		addItem(QAItems.TRADING_CARD, "Trading Card");
		addItem(QAItems.BRONZE_MEDAL, "Bronze Medal");
		addItem(QAItems.SILVER_MEDAL, "Silver Medal");
		addItem(QAItems.GOLD_MEDAL, "Gold Medal");
		addItem(QAItems.MILITARY_MEDAL, "Military Medal");
		addItem(QAItems.ROCK, "Rock");
		addItem(QAItems.STATUETTE, "Statuette");
		addItem(QAItems.SILVER_RING, "Silver Ring");
		addItem(QAItems.SKULL, "Skull");
		addItem(QAItems.URN, "Urn");
	}
}
