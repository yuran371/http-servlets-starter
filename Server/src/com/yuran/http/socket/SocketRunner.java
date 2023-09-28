package com.yuran.http.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;

public class SocketRunner {

	public static void main(String[] args) throws IOException {
		InetAddress inetAddress = Inet4Address.getByName("localhost");
		try (Socket socket = new Socket(inetAddress, 7777)) {
			DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
			DataInputStream inputStream = new DataInputStream(socket.getInputStream());
			outputStream.writeUTF("Hello world!");
			System.out.println("Server`s response: " + inputStream.readUTF());
		}
	}

}
