package GUIProject.hust.soict.dsai;

import AIMSProject.src.hust.soict.dsai.aims.cart.Cart;
import AIMSProject.src.hust.soict.dsai.aims.media.Media;
import AIMSProject.src.hust.soict.dsai.aims.media.Playable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.event.ActionEvent;

public class CartScreenController {
	
	private Cart cart;

    @FXML
    private Button btnPlay;

    @FXML
    private Button btnRemove;

    @FXML
    private TableColumn<Media, Float> colMediaCost;

    @FXML
    private TableColumn<Media, String> colMediaTitle;

    @FXML
    private TableColumn<Media, String> colMediacategory;

    @FXML
    private ToggleGroup filterCategory;

    @FXML
    private RadioButton radioBtnFilterId;

    @FXML
    private RadioButton radioBtnFilterTitle;

    @FXML
    private TableView<Media> tblMedia;

    @FXML
    private TextField tfFilter;
    
    public CartScreenController(Cart cart) {
    	super();
    	this.cart = cart;
    }
    
    @FXML
    private void initialize() {
    	colMediaTitle.setCellValueFactory(
    			new PropertyValueFactory<Media,String>("title"));
    	colMediacategory.setCellValueFactory(
    			new PropertyValueFactory<Media,String>("category"));
    	colMediaCost.setCellValueFactory(
    			new PropertyValueFactory<Media,Float>("cost"));
    	tblMedia.setItems(this.cart.getItemsOdered());

        btnPlay.setVisible(false);
        btnRemove.setVisible(false);

        tblMedia.getSelectionModel().selectedItemProperty().addListener(
                new ChangeListener<Media>() {
                    @Override
                    public void changed(ObservableValue<? extends Media> observable, Media oldValue, Media newValue) {
                        if (newValue != null) {
                            updateButtonBar(newValue);
                        }
                    }
                }
        );

        tfFilter.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String oldValue, String newValue) {
                showFilterdMedia(newValue);
            }
        });
    }

    void showFilterdMedia(String newValue) {
        FilteredList<Media> filteredList = new FilteredList<>(cart.getItemsOdered());

        filteredList.setPredicate(media -> {
            if (newValue == null || newValue.isEmpty()) {
                return true;
            }

            String filterText = newValue.toLowerCase();

            return media.getTitle().toLowerCase().contains(filterText)
                    || media.getCategory().toLowerCase().contains(filterText);
        });

        tblMedia.setItems(filteredList);
    }

    void updateButtonBar(Media media) {
        btnRemove.setVisible(true);
        if (media instanceof Playable) {
            btnPlay.setVisible(true);
        }
        else {
            btnPlay.setVisible(false);
        }
    }

    @FXML
    void btnRemovePressed(ActionEvent event) {
        Media media = tblMedia.getSelectionModel().getSelectedItem();
        cart.removeMedia(media);
    }

}
