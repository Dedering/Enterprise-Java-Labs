package example;

import com.globalWeather3.java.*;

/**
 * Created by Private on 10/5/15.
 */
public class HelloWorldClient {
  public static void main(String[] argv) {
    com.globalWeather3.java.GlobalWeatherSoap service = new GlobalWeather().getPort(GlobalWeatherSoap.class);
    //invoke business method
    //System.out.println(service.getWeather("Milwaukee", "United States"));
    String result = service.getWeather("Milwaukee", "United States");
    System.out.println(result);
  }
}
