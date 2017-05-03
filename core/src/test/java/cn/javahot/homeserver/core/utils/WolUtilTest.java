package cn.javahot.homeserver.core.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class WolUtilTest {

	@Test
	public void testWakeOnLan() {
		int result = -1;
		String ip = "192.168.1.166";
		String mac = "1C:6F:65:47:24:22";
		int port = 9;
		WolUtil.wakeOnLan(mac, ip, port);
		assertEquals(result, 1);
	}

}
