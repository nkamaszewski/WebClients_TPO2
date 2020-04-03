package zad1;

import java.util.List;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class GridGui extends Application {
	private Service service;
	private Weather weather; 
	
	 @Override
	    public void start(Stage primaryStage) throws Exception {
		 	Parameters params = getParameters();
		 	List<String> list = params.getRaw();
		 	this.service = new Service(list.get(0));
		 	this.weather = new Weather(service.getWeather("Warsaw"));
		 	
	        Button weatherButton = new Button("Confirm");
	        Button rateButton = new Button("Confirm");
	        
	        TextField currencyCodeTextField = new TextField();
	        TextField cityTextField = new TextField();
	        final Label temperatureLabel = new Label("Temperatura: " + String.format("%.1f", weather.getTemperature()) + " \u00b0C");
	        final Label cityLabel = new Label(weather.getCity());
	        final Label pressureLabel = new Label("Pressure: " + weather.getPressure() + " hPa");
	        final Label descriptionLabel = new Label("Description: " + weather.getDescription()); 
	        final Label detailsLabel = new Label("Details: " + weather.getDetails());
	        final Label currencyLabel = new Label("Fill currency code and confirm to get currency rate!");
	        final Label currencyLabel2 = new Label();
	        final Label nbpLabel = new Label("1 " + service.getCountryCurrencyCode() + "=" + service.getNBPRate() + " PLN");
	        final Label nbpLabel2 = new Label("1 PLN = " + 1.0/service.getNBPRate() +" " + service.getCountryCurrencyCode());
	        
	        WebView webView = new WebView();
	        final WebEngine webEngine = webView.getEngine();
            webEngine.load("https://pl.wikipedia.org/wiki/Warsaw");
	        
	        
	        weatherButton.setOnAction(actionEvent -> {
	        	String city = cityTextField.getText();
	        	this.weather = new Weather(service.getWeather(city));
	        	temperatureLabel.setText("Temperature: " + String.format("%.1f", weather.getTemperature()) + " \u00b0C");
	        	cityLabel.setText(weather.getCity());
	        	pressureLabel.setText("Pressure: " + weather.getPressure() + " hPa");
	        	descriptionLabel.setText("Description: " + weather.getDescription()); 
	        	detailsLabel.setText("Details: " + weather.getDetails()); 
	        	webEngine.load("https://pl.wikipedia.org/wiki/" + city);
	       
	        });
	        
	        rateButton.setOnAction(actionEvent -> {
	         currencyLabel.setText("1 " + service.getCountryCurrencyCode() + "=" + service.getRateFor(currencyCodeTextField.getText()) + " " + currencyCodeTextField.getText());
	         currencyLabel2.setText("1 " + currencyCodeTextField.getText() + " = " + 1.0/service.getRateFor(currencyCodeTextField.getText()) + " " +  service.getCountryCurrencyCode());
	        });
	        
	        
	        GridPane gridPane = new GridPane();       
	        
	        gridPane.add(new Label("City:"), 1, 1, 1, 1);
	        gridPane.add(cityTextField, 1, 2, 1, 1);
	        gridPane.add(weatherButton, 1, 3, 1, 1);
	        gridPane.add(cityLabel, 1, 4, 1, 1);
	        gridPane.add(temperatureLabel, 1, 5, 1, 1);
	        gridPane.add(pressureLabel, 1, 6, 1, 1);
	        gridPane.add(descriptionLabel, 1, 7, 1, 1);
	        gridPane.add(detailsLabel, 1, 8, 1, 1);
	        
	        gridPane.add(new Label("Currency code:"), 2, 1, 1, 1);
	        gridPane.add(currencyCodeTextField, 2, 2, 1, 1);
	        gridPane.add(rateButton, 2, 3, 1, 1);
	        gridPane.add(new Label("Currency rate:"), 2, 4, 1, 1);
	        gridPane.add(currencyLabel, 2, 5, 1, 1);
	        gridPane.add(currencyLabel2, 2, 6, 1, 1);
	        gridPane.add(new Label("NBP rate:"), 2, 7, 1, 1);
	        gridPane.add(nbpLabel, 2, 8, 1, 1);
	        gridPane.add(nbpLabel2, 2, 9, 1, 1);
	   
	        gridPane.add(webView, 1, 10, 5, 8);
	        
	        gridPane.setHgap(50);
	        gridPane.setVgap(10);
	        
	        

	        Scene scene = new Scene(gridPane, 1300, 900);
	        primaryStage.setTitle("s16456 - Norbert Kamaszewski, init country: " + service.getCountry());
	        primaryStage.setResizable(true);
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }
	 
	 
	 
}
