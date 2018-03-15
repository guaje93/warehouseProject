package contollers;

import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

public class TopMenuButtonsController {

	private static final String ADD_MATERIAL_FXML = "/fxml/addMaterial.fxml";

	private static final String STATISTICS_FXML = "/fxml/statistics.fxml";

	private static final String MATERIAL_LIST_FXML = "/fxml/materialList.fxml";

	private static final String SHOP_FXML = "/fxml/shop.fxml";

	private MainController mainController;

	@FXML
	private ToggleGroup toggleButtons;

	@FXML
	public void openShop() {
		mainController.setCenter(SHOP_FXML);

	}

	@FXML
	public void openListMaterials() {
		mainController.setCenter(MATERIAL_LIST_FXML);

	}

	@FXML
	public void openStatistics() {
		mainController.setCenter(STATISTICS_FXML);

	}

	public void setMainController(MainController mainController) {
		this.mainController = mainController;
	}

	@FXML
	public void addMaterial() {
		if (toggleButtons.getSelectedToggle() != null)
			toggleButtons.getSelectedToggle().setSelected(false);

		mainController.setCenter(ADD_MATERIAL_FXML);
	}

}
