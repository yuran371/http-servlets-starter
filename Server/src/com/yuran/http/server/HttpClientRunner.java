package com.yuran.http.server;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublisher;
import java.net.http.HttpResponse;
import java.nio.file.Path;

public class HttpClientRunner {
public static void main(String[] args) throws IOException, InterruptedException {
	HttpClient httpClient = HttpClient.newBuilder().version(Version.HTTP_1_1).build();
	HttpRequest request = HttpRequest.newBuilder(URI.create("http://localhost:9000"))
			.header("content-type", "application/json")
			.POST(HttpRequest.BodyPublishers.ofFile(Path.of("C:\\Users\\rosom\\git\\http-servlets-starter\\resources", "first.json")))
			.build();
	HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
	System.out.println(response.headers());
	System.out.println(response.body());
	
}
}
