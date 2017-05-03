package cn.javahot.homeserver.core.utils;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class WolUtil {

	public static int wakeOnLan(String mac, String ip, int port) {
		int result = -1;
		InetAddress destHost = null;
		try {
			destHost = InetAddress.getByName(ip);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 验证MAC地址并转换为二进制
		byte[] destMac = getMacBytes(mac);

		// 创建开机指令包
		byte[] magic = new byte[102];
		// 将数据包的前6位放入0xFF即 "FF"的二进制
		for (int i = 0; i < 6; i++)
			magic[i] = (byte) 0xFF;
		// 从第7个位置开始把MAC地址放入16次
		for (int i = 0; i < 16; i++) {
			for (int j = 0; j < destMac.length; j++) {
				magic[6 + destMac.length * i + j] = destMac[j];
			}
		}

		DatagramPacket dp = null;
		dp = new DatagramPacket(magic, magic.length, destHost, port);
		DatagramSocket ds;
		try {
			ds = new DatagramSocket();
			ds.send(dp);
			ds.close();
			result = 1;
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
		return result;
	}

	/**
	 * 验证MAC地址并转换为二进制
	 */
	private static byte[] getMacBytes(String macStr) throws IllegalArgumentException {
		byte[] bytes = new byte[6];
		String[] hex = macStr.split("(\\:|\\-)");
		if (hex.length != 6) {
			throw new IllegalArgumentException("无效的MAC地址");
		}
		try {
			for (int i = 0; i < 6; i++) {
				bytes[i] = (byte) Integer.parseInt(hex[i], 16);
			}
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("无效的MAC地址");
		}
		return bytes;
	}

}
