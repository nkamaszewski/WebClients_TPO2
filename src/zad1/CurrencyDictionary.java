package zad1;

import java.util.Map;
import java.util.TreeMap;

public class CurrencyDictionary {
	Map<String, String> countryMap = new TreeMap<String, String>();
	Map<String, String> currencyMap = new TreeMap<String, String>();
	
	public CurrencyDictionary() {
    countryMap.put("Bangladesh","BD");
    countryMap.put("Belgium","BE");
    countryMap.put("Burkina Faso","BF");
    countryMap.put("Bulgaria","BG");
    countryMap.put("Bosnia and Herzegovina","BA");
    countryMap.put("Barbados","BB");
    countryMap.put("Wallis and Futuna","WF");
    countryMap.put("Saint Barthelemy","BL");
    countryMap.put("Bermuda","BM");
    countryMap.put("Brunei","BN");
    countryMap.put("Bolivia","BO");
    countryMap.put("Bahrain","BH");
    countryMap.put("Burundi","BI");
    countryMap.put("Benin","BJ");
    countryMap.put("Bhutan","BT");
    countryMap.put("Jamaica","JM");
    countryMap.put("Bouvet Island","BV");
    countryMap.put("Botswana","BW");
    countryMap.put("Samoa","WS");
    countryMap.put("Bonaire, Saint Eustatius and Saba ","BQ");
    countryMap.put("Brazil","BR");
    countryMap.put("Bahamas","BS");
    countryMap.put("Jersey","JE");
    countryMap.put("Belarus","BY");
    countryMap.put("Belize","BZ");
    countryMap.put("Russia","RU");
    countryMap.put("Rwanda","RW");
    countryMap.put("Serbia","RS");
    countryMap.put("East Timor","TL");
    countryMap.put("Reunion","RE");
    countryMap.put("Turkmenistan","TM");
    countryMap.put("Tajikistan","TJ");
    countryMap.put("Romania","RO");
    countryMap.put("Tokelau","TK");
    countryMap.put("Guinea-Bissau","GW");
    countryMap.put("Guam","GU");
    countryMap.put("Guatemala","GT");
    countryMap.put("South Georgia and the South Sandwich Islands","GS");
    countryMap.put("Greece","GR");
    countryMap.put("Equatorial Guinea","GQ");
    countryMap.put("Guadeloupe","GP");
    countryMap.put("Japan","JP");
    countryMap.put("Guyana","GY");
    countryMap.put("Guernsey","GG");
    countryMap.put("French Guiana","GF");
    countryMap.put("Georgia","GE");
    countryMap.put("Grenada","GD");
    countryMap.put("United Kingdom","GB");
    countryMap.put("Gabon","GA");
    countryMap.put("El Salvador","SV");
    countryMap.put("Guinea","GN");
    countryMap.put("Gambia","GM");
    countryMap.put("Greenland","GL");
    countryMap.put("Gibraltar","GI");
    countryMap.put("Ghana","GH");
    countryMap.put("Oman","OM");
    countryMap.put("Tunisia","TN");
    countryMap.put("Jordan","JO");
    countryMap.put("Croatia","HR");
    countryMap.put("Haiti","HT");
    countryMap.put("Hungary","HU");
    countryMap.put("Hong Kong","HK");
    countryMap.put("Honduras","HN");
    countryMap.put("Heard Island and McDonald Islands","HM");
    countryMap.put("Venezuela","VE");
    countryMap.put("Puerto Rico","PR");
    countryMap.put("Palestinian Territory","PS");
    countryMap.put("Palau","PW");
    countryMap.put("Portugal","PT");
    countryMap.put("Svalbard and Jan Mayen","SJ");
    countryMap.put("Paraguay","PY");
    countryMap.put("Iraq","IQ");
    countryMap.put("Panama","PA");
    countryMap.put("French Polynesia","PF");
    countryMap.put("Papua New Guinea","PG");
    countryMap.put("Peru","PE");
    countryMap.put("Pakistan","PK");
    countryMap.put("Philippines","PH");
    countryMap.put("Pitcairn","PN");
    countryMap.put("Poland","PL");
    countryMap.put("Saint Pierre and Miquelon","PM");
    countryMap.put("Zambia","ZM");
    countryMap.put("Western Sahara","EH");
    countryMap.put("Estonia","EE");
    countryMap.put("Egypt","EG");
    countryMap.put("South Africa","ZA");
    countryMap.put("Ecuador","EC");
    countryMap.put("Italy","IT");
    countryMap.put("Vietnam","VN");
    countryMap.put("Solomon Islands","SB");
    countryMap.put("Ethiopia","ET");
    countryMap.put("Somalia","SO");
    countryMap.put("Zimbabwe","ZW");
    countryMap.put("Saudi Arabia","SA");
    countryMap.put("Spain","ES");
    countryMap.put("Eritrea","ER");
    countryMap.put("Montenegro","ME");
    countryMap.put("Moldova","MD");
    countryMap.put("Madagascar","MG");
    countryMap.put("Saint Martin","MF");
    countryMap.put("Morocco","MA");
    countryMap.put("Monaco","MC");
    countryMap.put("Uzbekistan","UZ");
    countryMap.put("Myanmar","MM");
    countryMap.put("Mali","ML");
    countryMap.put("Macao","MO");
    countryMap.put("Mongolia","MN");
    countryMap.put("Marshall Islands","MH");
    countryMap.put("Macedonia","MK");
    countryMap.put("Mauritius","MU");
    countryMap.put("Malta","MT");
    countryMap.put("Malawi","MW");
    countryMap.put("Maldives","MV");
    countryMap.put("Martinique","MQ");
    countryMap.put("Northern Mariana Islands","MP");
    countryMap.put("Montserrat","MS");
    countryMap.put("Mauritania","MR");
    countryMap.put("Isle of Man","IM");
    countryMap.put("Uganda","UG");
    countryMap.put("Tanzania","TZ");
    countryMap.put("Malaysia","MY");
    countryMap.put("Mexico","MX");
    countryMap.put("Israel","IL");
    countryMap.put("France","FR");
    countryMap.put("British Indian Ocean Territory","IO");
    countryMap.put("Saint Helena","SH");
    countryMap.put("Finland","FI");
    countryMap.put("Fiji","FJ");
    countryMap.put("Falkland Islands","FK");
    countryMap.put("Micronesia","FM");
    countryMap.put("Faroe Islands","FO");
    countryMap.put("Nicaragua","NI");
    countryMap.put("Netherlands","NL");
    countryMap.put("Norway","NO");
    countryMap.put("Namibia","NA");
    countryMap.put("Vanuatu","VU");
    countryMap.put("New Caledonia","NC");
    countryMap.put("Niger","NE");
    countryMap.put("Norfolk Island","NF");
    countryMap.put("Nigeria","NG");
    countryMap.put("New Zealand","NZ");
    countryMap.put("Nepal","NP");
    countryMap.put("Nauru","NR");
    countryMap.put("Niue","NU");
    countryMap.put("Cook Islands","CK");
    countryMap.put("Kosovo","XK");
    countryMap.put("Ivory Coast","CI");
    countryMap.put("Switzerland","CH");
    countryMap.put("Colombia","CO");
    countryMap.put("China","CN");
    countryMap.put("Cameroon","CM");
    countryMap.put("Chile","CL");
    countryMap.put("Cocos Islands","CC");
    countryMap.put("Canada","CA");
    countryMap.put("Republic of the Congo","CG");
    countryMap.put("Central African Republic","CF");
    countryMap.put("Democratic Republic of the Congo","CD");
    countryMap.put("Czech Republic","CZ");
    countryMap.put("Cyprus","CY");
    countryMap.put("Christmas Island","CX");
    countryMap.put("Costa Rica","CR");
    countryMap.put("Curacao","CW");
    countryMap.put("Cape Verde","CV");
    countryMap.put("Cuba","CU");
    countryMap.put("Swaziland","SZ");
    countryMap.put("Syria","SY");
    countryMap.put("Sint Maarten","SX");
    countryMap.put("Kyrgyzstan","KG");
    countryMap.put("Kenya","KE");
    countryMap.put("South Sudan","SS");
    countryMap.put("Suriname","SR");
    countryMap.put("Kiribati","KI");
    countryMap.put("Cambodia","KH");
    countryMap.put("Saint Kitts and Nevis","KN");
    countryMap.put("Comoros","KM");
    countryMap.put("Sao Tome and Principe","ST");
    countryMap.put("Slovakia","SK");
    countryMap.put("South Korea","KR");
    countryMap.put("Slovenia","SI");
    countryMap.put("North Korea","KP");
    countryMap.put("Kuwait","KW");
    countryMap.put("Senegal","SN");
    countryMap.put("San Marino","SM");
    countryMap.put("Sierra Leone","SL");
    countryMap.put("Seychelles","SC");
    countryMap.put("Kazakhstan","KZ");
    countryMap.put("Cayman Islands","KY");
    countryMap.put("Singapore","SG");
    countryMap.put("Sweden","SE");
    countryMap.put("Sudan","SD");
    countryMap.put("Dominican Republic","DO");
    countryMap.put("Dominica","DM");
    countryMap.put("Djibouti","DJ");
    countryMap.put("Denmark","DK");
    countryMap.put("British Virgin Islands","VG");
    countryMap.put("Germany","DE");
    countryMap.put("Yemen","YE");
    countryMap.put("Algeria","DZ");
    countryMap.put("United States","US");
    countryMap.put("Uruguay","UY");
    countryMap.put("Mayotte","YT");
    countryMap.put("United States Minor Outlying Islands","UM");
    countryMap.put("Lebanon","LB");
    countryMap.put("Saint Lucia","LC");
    countryMap.put("Laos","LA");
    countryMap.put("Tuvalu","TV");
    countryMap.put("Taiwan","TW");
    countryMap.put("Trinidad and Tobago","TT");
    countryMap.put("Turkey","TR");
    countryMap.put("Sri Lanka","LK");
    countryMap.put("Liechtenstein","LI");
    countryMap.put("Latvia","LV");
    countryMap.put("Tonga","TO");
    countryMap.put("Lithuania","LT");
    countryMap.put("Luxembourg","LU");
    countryMap.put("Liberia","LR");
    countryMap.put("Lesotho","LS");
    countryMap.put("Thailand","TH");
    countryMap.put("French Southern Territories","TF");
    countryMap.put("Togo","TG");
    countryMap.put("Chad","TD");
    countryMap.put("Turks and Caicos Islands","TC");
    countryMap.put("Libya","LY");
    countryMap.put("Vatican","VA");
    countryMap.put("Saint Vincent and the Grenadines","VC");
    countryMap.put("United Arab Emirates","AE");
    countryMap.put("Andorra","AD");
    countryMap.put("Antigua and Barbuda","AG");
    countryMap.put("Afghanistan","AF");
    countryMap.put("Anguilla","AI");
    countryMap.put("U.S. Virgin Islands","VI");
    countryMap.put("Iceland","IS");
    countryMap.put("Iran","IR");
    countryMap.put("Armenia","AM");
    countryMap.put("Albania","AL");
    countryMap.put("Angola","AO");
    countryMap.put("Antarctica","AQ");
    countryMap.put("American Samoa","AS");
    countryMap.put("Argentina","AR");
    countryMap.put("Australia","AU");
    countryMap.put("Austria","AT");
    countryMap.put("Aruba","AW");
    countryMap.put("India","IN");
    countryMap.put("Aland Islands","AX");
    countryMap.put("Azerbaijan","AZ");
    countryMap.put("Ireland","IE");
    countryMap.put("Indonesia","ID");
    countryMap.put("Ukraine","UA");
    countryMap.put("Qatar","QA");
    countryMap.put("Mozambique","MZ");
    countryMap.put("USA", "US");
    
    currencyMap.put("BD","BDT");
    currencyMap.put("BE","EUR");
    currencyMap.put("BF","XOF");
    currencyMap.put("BG","BGN");
    currencyMap.put("BA","BAM");
    currencyMap.put("BB","BBD");
    currencyMap.put("WF","XPF");
    currencyMap.put("BL","EUR");
    currencyMap.put("BM","BMD");
    currencyMap.put("BN","BND");
    currencyMap.put("BO","BOB");
    currencyMap.put("BH","BHD");
    currencyMap.put("BI","BIF");
    currencyMap.put("BJ","XOF");
    currencyMap.put("BT","BTN");
    currencyMap.put("JM","JMD");
    currencyMap.put("BV","NOK");
    currencyMap.put("BW","BWP");
    currencyMap.put("WS","WST");
    currencyMap.put("BQ","USD");
    currencyMap.put("BR","BRL");
    currencyMap.put("BS","BSD");
    currencyMap.put("JE","GBP");
    currencyMap.put("BY","BYR");
    currencyMap.put("BZ","BZD");
    currencyMap.put("RU","RUB");
    currencyMap.put("RW","RWF");
    currencyMap.put("RS","RSD");
    currencyMap.put("TL","USD");
    currencyMap.put("RE","EUR");
    currencyMap.put("TM","TMT");
    currencyMap.put("TJ","TJS");
    currencyMap.put("RO","RON");
    currencyMap.put("TK","NZD");
    currencyMap.put("GW","XOF");
    currencyMap.put("GU","USD");
    currencyMap.put("GT","GTQ");
    currencyMap.put("GS","GBP");
    currencyMap.put("GR","EUR");
    currencyMap.put("GQ","XAF");
    currencyMap.put("GP","EUR");
    currencyMap.put("JP","JPY");
    currencyMap.put("GY","GYD");
    currencyMap.put("GG","GBP");
    currencyMap.put("GF","EUR");
    currencyMap.put("GE","GEL");
    currencyMap.put("GD","XCD");
    currencyMap.put("GB","GBP");
    currencyMap.put("GA","XAF");
    currencyMap.put("SV","USD");
    currencyMap.put("GN","GNF");
    currencyMap.put("GM","GMD");
    currencyMap.put("GL","DKK");
    currencyMap.put("GI","GIP");
    currencyMap.put("GH","GHS");
    currencyMap.put("OM","OMR");
    currencyMap.put("TN","TND");
    currencyMap.put("JO","JOD");
    currencyMap.put("HR","HRK");
    currencyMap.put("HT","HTG");
    currencyMap.put("HU","HUF");
    currencyMap.put("HK","HKD");
    currencyMap.put("HN","HNL");
    currencyMap.put("HM","AUD");
    currencyMap.put("VE","VEF");
    currencyMap.put("PR","USD");
    currencyMap.put("PS","ILS");
    currencyMap.put("PW","USD");
    currencyMap.put("PT","EUR");
    currencyMap.put("SJ","NOK");
    currencyMap.put("PY","PYG");
    currencyMap.put("IQ","IQD");
    currencyMap.put("PA","PAB");
    currencyMap.put("PF","XPF");
    currencyMap.put("PG","PGK");
    currencyMap.put("PE","PEN");
    currencyMap.put("PK","PKR");
    currencyMap.put("PH","PHP");
    currencyMap.put("PN","NZD");
    currencyMap.put("PL","PLN");
    currencyMap.put("PM","EUR");
    currencyMap.put("ZM","ZMK");
    currencyMap.put("EH","MAD");
    currencyMap.put("EE","EUR");
    currencyMap.put("EG","EGP");
    currencyMap.put("ZA","ZAR");
    currencyMap.put("EC","USD");
    currencyMap.put("IT","EUR");
    currencyMap.put("VN","VND");
    currencyMap.put("SB","SBD");
    currencyMap.put("ET","ETB");
    currencyMap.put("SO","SOS");
    currencyMap.put("ZW","ZWL");
    currencyMap.put("SA","SAR");
    currencyMap.put("ES","EUR");
    currencyMap.put("ER","ERN");
    currencyMap.put("ME","EUR");
    currencyMap.put("MD","MDL");
    currencyMap.put("MG","MGA");
    currencyMap.put("MF","EUR");
    currencyMap.put("MA","MAD");
    currencyMap.put("MC","EUR");
    currencyMap.put("UZ","UZS");
    currencyMap.put("MM","MMK");
    currencyMap.put("ML","XOF");
    currencyMap.put("MO","MOP");
    currencyMap.put("MN","MNT");
    currencyMap.put("MH","USD");
    currencyMap.put("MK","MKD");
    currencyMap.put("MU","MUR");
    currencyMap.put("MT","EUR");
    currencyMap.put("MW","MWK");
    currencyMap.put("MV","MVR");
    currencyMap.put("MQ","EUR");
    currencyMap.put("MP","USD");
    currencyMap.put("MS","XCD");
    currencyMap.put("MR","MRO");
    currencyMap.put("IM","GBP");
    currencyMap.put("UG","UGX");
    currencyMap.put("TZ","TZS");
    currencyMap.put("MY","MYR");
    currencyMap.put("MX","MXN");
    currencyMap.put("IL","ILS");
    currencyMap.put("FR","EUR");
    currencyMap.put("IO","USD");
    currencyMap.put("SH","SHP");
    currencyMap.put("FI","EUR");
    currencyMap.put("FJ","FJD");
    currencyMap.put("FK","FKP");
    currencyMap.put("FM","USD");
    currencyMap.put("FO","DKK");
    currencyMap.put("NI","NIO");
    currencyMap.put("NL","EUR");
    currencyMap.put("NO","NOK");
    currencyMap.put("NA","NAD");
    currencyMap.put("VU","VUV");
    currencyMap.put("NC","XPF");
    currencyMap.put("NE","XOF");
    currencyMap.put("NF","AUD");
    currencyMap.put("NG","NGN");
    currencyMap.put("NZ","NZD");
    currencyMap.put("NP","NPR");
    currencyMap.put("NR","AUD");
    currencyMap.put("NU","NZD");
    currencyMap.put("CK","NZD");
    currencyMap.put("XK","EUR");
    currencyMap.put("CI","XOF");
    currencyMap.put("CH","CHF");
    currencyMap.put("CO","COP");
    currencyMap.put("CN","CNY");
    currencyMap.put("CM","XAF");
    currencyMap.put("CL","CLP");
    currencyMap.put("CC","AUD");
    currencyMap.put("CA","CAD");
    currencyMap.put("CG","XAF");
    currencyMap.put("CF","XAF");
    currencyMap.put("CD","CDF");
    currencyMap.put("CZ","CZK");
    currencyMap.put("CY","EUR");
    currencyMap.put("CX","AUD");
    currencyMap.put("CR","CRC");
    currencyMap.put("CW","ANG");
    currencyMap.put("CV","CVE");
    currencyMap.put("CU","CUP");
    currencyMap.put("SZ","SZL");
    currencyMap.put("SY","SYP");
    currencyMap.put("SX","ANG");
    currencyMap.put("KG","KGS");
    currencyMap.put("KE","KES");
    currencyMap.put("SS","SSP");
    currencyMap.put("SR","SRD");
    currencyMap.put("KI","AUD");
    currencyMap.put("KH","KHR");
    currencyMap.put("KN","XCD");
    currencyMap.put("KM","KMF");
    currencyMap.put("ST","STD");
    currencyMap.put("SK","EUR");
    currencyMap.put("KR","KRW");
    currencyMap.put("SI","EUR");
    currencyMap.put("KP","KPW");
    currencyMap.put("KW","KWD");
    currencyMap.put("SN","XOF");
    currencyMap.put("SM","EUR");
    currencyMap.put("SL","SLL");
    currencyMap.put("SC","SCR");
    currencyMap.put("KZ","KZT");
    currencyMap.put("KY","KYD");
    currencyMap.put("SG","SGD");
    currencyMap.put("SE","SEK");
    currencyMap.put("SD","SDG");
    currencyMap.put("DO","DOP");
    currencyMap.put("DM","XCD");
    currencyMap.put("DJ","DJF");
    currencyMap.put("DK","DKK");
    currencyMap.put("VG","USD");
    currencyMap.put("DE","EUR");
    currencyMap.put("YE","YER");
    currencyMap.put("DZ","DZD");
    currencyMap.put("US","USD");
    currencyMap.put("UY","UYU");
    currencyMap.put("YT","EUR");
    currencyMap.put("UM","USD");
    currencyMap.put("LB","LBP");
    currencyMap.put("LC","XCD");
    currencyMap.put("LA","LAK");
    currencyMap.put("TV","AUD");
    currencyMap.put("TW","TWD");
    currencyMap.put("TT","TTD");
    currencyMap.put("TR","TRY");
    currencyMap.put("LK","LKR");
    currencyMap.put("LI","CHF");
    currencyMap.put("LV","EUR");
    currencyMap.put("TO","TOP");
    currencyMap.put("LT","LTL");
    currencyMap.put("LU","EUR");
    currencyMap.put("LR","LRD");
    currencyMap.put("LS","LSL");
    currencyMap.put("TH","THB");
    currencyMap.put("TF","EUR");
    currencyMap.put("TG","XOF");
    currencyMap.put("TD","XAF");
    currencyMap.put("TC","USD");
    currencyMap.put("LY","LYD");
    currencyMap.put("VA","EUR");
    currencyMap.put("VC","XCD");
    currencyMap.put("AE","AED");
    currencyMap.put("AD","EUR");
    currencyMap.put("AG","XCD");
    currencyMap.put("AF","AFN");
    currencyMap.put("AI","XCD");
    currencyMap.put("VI","USD");
    currencyMap.put("IS","ISK");
    currencyMap.put("IR","IRR");
    currencyMap.put("AM","AMD");
    currencyMap.put("AL","ALL");
    currencyMap.put("AO","AOA");
    currencyMap.put("AQ","");
    currencyMap.put("AS","USD");
    currencyMap.put("AR","ARS");
    currencyMap.put("AU","AUD");
    currencyMap.put("AT","EUR");
    currencyMap.put("AW","AWG");
    currencyMap.put("IN","INR");
    currencyMap.put("AX","EUR");
    currencyMap.put("AZ","AZN");
    currencyMap.put("IE","EUR");
    currencyMap.put("ID","IDR");
    currencyMap.put("UA","UAH");
    currencyMap.put("QA","QAR");
    currencyMap.put("MZ","MZN");
	}
	
	
	public String getCurrencyCode(String country) {
		String code = countryMap.get(country);
		if(code == null) {
			return "";
		}
		return currencyMap.get(code);
	}
}
