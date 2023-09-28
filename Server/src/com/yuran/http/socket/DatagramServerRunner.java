package com.yuran.http.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DatagramServerRunner {

	public static void main(String[] args) throws IOException {
		try (DatagramSocket datagramServer = new DatagramSocket(7777)) {
			byte[] buff = new byte[1]; 
			DatagramPacket datagramPacket = new DatagramPacket(buff, buff.length);
			datagramServer.receive(datagramPacket);
			System.out.println(new String(datagramPacket.getData()));
		}
	}
}
