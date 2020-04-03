/**
 *
 *  @author Kamaszewski Norbert S16456
 *
 */

package zad1;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Service {
	
	private String country;
	private String countryCurrencyCode; 


    public Service(String country) {
    	CurrencyDictionary currencyDictionary = new CurrencyDictionary();
   
      	this.country = country;
      	this.countryCurrencyCode = currencyDictionary.getCurrencyCode(country);
    }


    String getWeather(String city) {
        String jsonData = fetchData("http://api.openweathermap.org/data/2.5/weather?q=" + city + "," + country + "&APPID=fb0807b989411a6a44d080de5b1cc7ac");
        return jsonData;
    }
    

    Double getRateFor(String currencyCode) {
    
    double rateCurrencyCode , rateCountryCurrencyCode =1 , rates = 0 ;
       String url ="https://api.exchangeratesapi.io/latest?symbols="+currencyCode+","+ countryCurrencyCode;    
       if(currencyCode.equals("EUR") && countryCurrencyCode.equals("EUR")) {
    	return 1.0;
       } else if (currencyCode.equals("EUR")) {
    	   url ="https://api.exchangeratesapi.io/latest?symbols="+countryCurrencyCode;
       } else if (countryCurrencyCode.equals("EUR")) {
    	   url ="https://api.exchangeratesapi.io/latest?symbols="+currencyCode;
       }
       
       String jsonData = fetchData(url);
		   		
		   		if (!jsonData.equals("") && !jsonData.contains("\"cod\":\"404\"")) {
					JSONObject jsonObject = new JSONObject(jsonData);

					rateCurrencyCode = jsonObject.getJSONObject("rates").optDouble(currencyCode);
			        rateCountryCurrencyCode = jsonObject.getJSONObject("rates").optDouble(countryCurrencyCode);  
			        if (currencyCode.equals("EUR")) {
			        	return rateCountryCurrencyCode;
			        } else if (countryCurrencyCode.equals("EUR")) {
			     	   return rateCurrencyCode;
			        }   
			        rates = rateCurrencyCode/rateCountryCurrencyCode;
		   		}  
		   		return rates;
    }


    Double getNBPRate()  {
    	double rate = 1;

	    	if(!countryCurrencyCode.equals("PLN")) {
	   		String jsonDataNBPa = fetchData("http://api.nbp.pl/api/exchangerates/rates/a/"+countryCurrencyCode+"?format=json");
			if (!jsonDataNBPa.equals("")) {
			    JSONObject jsonObjectNBP = new JSONObject(jsonDataNBPa);
			    rate = jsonObjectNBP.getJSONArray("rates").getJSONObject(0).optDouble("mid");
				}
	    	
	    	String jsonDataNBPb = fetchData("http://api.nbp.pl/api/exchangerates/rates/b/"+countryCurrencyCode+"?format=json");
			if (!jsonDataNBPb.equals("")) {
			    JSONObject jsonObjectNBP = new JSONObject(jsonDataNBPb);
			    rate = jsonObjectNBP.getJSONArray("rates").getJSONObject(0).optDouble("mid");	    		
				}
	    	}
        return rate;
    }


    static public String fetchData(String url) {
        StringBuffer stringBuffer = null;
        URLConnection urlConnection;
        URL myURL;

        try {
            myURL = new URL(url);
            urlConnection = myURL.openConnection();
            urlConnection.connect();
            
            BufferedReader rd = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

            stringBuffer = new StringBuffer();
            String line;

            while ((line = rd.readLine()) != null) {
            	stringBuffer.append(line);
            }
        } catch (IOException e) {

        }
        return stringBuffer != null ? stringBuffer.toString() : "";
    }
      
	public String getCountry() {
		return this.country;
	}
	
	public String getCountryCurrencyCode() {
		return this.countryCurrencyCode;
	}
}
