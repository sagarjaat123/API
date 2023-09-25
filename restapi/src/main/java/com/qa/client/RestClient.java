package com.qa.client;

import netscape.javascript.JSObject;
import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class RestClient {

    //1. Get Method without headers
    public CloseableHttpResponse get(String url) throws ClientProtocolException, IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet(url);// hit the get request
        CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpget); //hit the Get url


        return closeableHttpResponse;
    }

        public CloseableHttpResponse get(String url, HashMap<String,String> headerMap) throws ClientProtocolException, IOException {
            CloseableHttpClient httpClient =  HttpClients.createDefault();
            HttpGet httpget = new HttpGet(url);// hit the get request

for(Map.Entry<String,String>entry: headerMap.entrySet()){
    httpget.addHeader(entry.getKey(), entry.getValue());
}

            CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpget); //hit the Get url


            return closeableHttpResponse;



    }














}
