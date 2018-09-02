/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httptest;

import java.net.*;
import java.io.*;
import org.json.*;


/**
 *
 * @author lucasabbade
 */
public class HTTPTest
{
    
    public static void main(String[] args) throws Exception
    {
        // https://developer.yahoo.com/weather/
        String yahooWeatherTest = "https://query.yahooapis.com/v1/public/yql?q=select%20astronomy.sunset%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20where%20text%3D%22maui%2C%20hi%22)&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys";
        String reddit = "https://www.reddit.com/.json";
        
        String testUrl = "https://httpbin.org/get";
        String r = Requests.get(testUrl);
        System.out.println(r);
        
//        JSONObject obj = new JSONObject(r);
//        System.out.println(obj);
        
//        String r = get(yahooWeatherTest);
//        JSONObject obj = new JSONObject(r);
//        System.out.println(obj);
//        JSONObject result = obj.getJSONObject("query").getJSONObject("results");
//        System.out.println(result);
//        String time = result.getJSONObject("channel").getJSONObject("astronomy").getString("sunset");
//        System.out.println(time);
    }
    
}
