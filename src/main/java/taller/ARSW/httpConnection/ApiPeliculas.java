/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.ARSW.httpConnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Karen Mora
 */
public class ApiPeliculas {
    
    private static final String USER_AGENT = "Mozilla/5.0";
    private static String GET_URL = "http://www.omdbapi.com/?i=";
    private static String URL_key = "&apikey=9539c63a";
    public String respuesta;
    
    //Here is your key: 9539c63a
    //http://www.omdbapi.com/?i=tt3896198&apikey=9539c63a
    
    public String getJson(String peli,String year) throws IOException {
        String url=GET_URL+peli+year+URL_key;
        URL obj = new URL(GET_URL);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        String jsonString="";
        
        //The following invocation perform the connection implicitly before getting the code
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // print result
            respuesta=response.toString();
        } else {
            System.out.println("GET request not worked");
        }
        return respuesta;
    }
    
}