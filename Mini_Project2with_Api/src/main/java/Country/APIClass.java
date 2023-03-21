package Country;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

public class APIClass {
	public JSONArray APIMethod(String name) {
		JSONArray arr=new JSONArray();
		URL url;
		try {
			
			url = new URL("https://api.api-ninjas.com/v1/country?name="+name);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestProperty("X-Api-Key", "Jt8g38T8P1mXXkAlWySaOQ==ZDeSsqLqslP5P724");
			InputStream responseStream = connection.getInputStream();
			String line="";
			Scanner sc=new Scanner(responseStream);
			while(sc.hasNext()) {
				line+=sc.next();
			}
			
			System.out.println(line);
			JSONParser parse=new JSONParser();
			
			arr=(JSONArray) parse.parse(line);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arr;
	}
}
