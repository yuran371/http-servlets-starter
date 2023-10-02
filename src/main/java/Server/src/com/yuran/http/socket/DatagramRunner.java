package com.yuran.http.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramRunner {
	public static void main(String[] args) throws IOException {
		InetAddress inetAddress = InetAddress.getByName("localhost");
		try (DatagramSocket datagramSocket = new DatagramSocket()) {
			byte[] buff = "Hello from UDP client".getBytes();
			DatagramPacket datagramPacket = new DatagramPacket(buff, buff.length, inetAddress, 7777);
			datagramSocket.send(datagramPacket);
		}
	}
}
