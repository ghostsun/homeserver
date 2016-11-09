package cn.javahot.homeserver.core.utils;

import java.util.Date;

import org.junit.Test;

public class CommandUtilTest {

	@Test
	public void testExeCmd() {
		String command = "ping www.baidu.com -n 5";
		String result = CommandUtil.exeCmd(command);
		System.out.println(result);
		new Date();
	}
	
	// 42,4d,0,1c,0,27,0,32,0,3c,0,1d,0,29,0,35,1b,51,7,f8,1,43,0,18,0,8,0,7,80,0,4,11

}
