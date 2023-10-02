package com.yuran.http.client;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlExample {
	public static void main(String[] args) throws IOException {
		URL url = new URL ("file:C:\\Users\\rosom\\git\\http-servlets-starter\\Server\\src\\com\\yuran\\http\\socket\\DatagramRunner.java");
		URLConnection urlConnection = url.openConnection();
		System.out.println(new String(urlConnection.getInputStream().readAllBytes()));
	}

	private static void checkGoogle2() throws MalformedURLException, IOException {
		URL url = new URL ("https://www.google.com");
		URLConnection urlConnection = url.openConnection();
		System.out.println();
		try (var outputStream = urlConnection.getOutputStream()) {
			
		}
	}
}
