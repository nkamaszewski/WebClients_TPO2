/**
 *
 *  @author Kamaszewski Norbert S16456
 *
 */

package zad1;

import javafx.application.Application;

public class Main {
	public static void main(String[] args) {
    Service s = new Service("Poland");
    String weatherJson = s.getWeather("Londyn");
    Double rate1 = s.getRateFor("USD");
    Double rate2 = s.getNBPRate();
    // ...
    // część uruchamiająca GUI     
    String[] arg = {s.getCountry()};
    Application.launch(GridGui.class, arg); 
  }
}
