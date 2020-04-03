package zad1;

import org.json.JSONObject;

public class Weather {
	private String city = "";
	private String description = "";
	private String details = "";
	private String pressure = "";
	private double temperature = 0.00;
	
	
	
	
	public Weather(String weatherJSON) {
		if (weatherJSON != null) {
            JSONObject jsonObject = new JSONObject(weatherJSON);
            this.city = jsonObject.getString("name");
            this.setDetails(jsonObject.getJSONArray("weather").getJSONObject(0).optString("description"));
            this.setDescription(jsonObject.getJSONArray("weather").getJSONObject(0).optString("main"));
            this.setPressure(jsonObject.getJSONObject("main").optString("pressure"));
            this.setTemperature(jsonObject.getJSONObject("main").optDouble("temp"));
        }
	}



	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getDetails() {
		return details;
	}



	public void setDetails(String details) {
		this.details = details;
	}



	public String getPressure() {
		return pressure;
	}



	public void setPressure(String pressure) {
		this.pressure = pressure;
	}



	public double getTemperature() {
		return temperature - 273.15;
	}



	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

}
