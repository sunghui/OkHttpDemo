package com.ahgx.http;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkHttpDemo {

	 OkHttpClient client = new OkHttpClient();

	 String run(String url) throws IOException {
		Request request = new Request.Builder().url(url).build();

		try (Response response = client.newCall(request).execute()){
			return response.body().string();
		} 
		
	}

	public static void main(String[] args) throws IOException {

		OkHttpDemo okhttp = new OkHttpDemo();
		String response = okhttp.run("https://raw.github.com/square/okhttp/master/README.md");
		
		System.out.println(response);
	}
}
