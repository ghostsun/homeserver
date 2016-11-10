package cn.javahot.homeserver.core.service.impl;

import static org.junit.Assert.fail;

import org.junit.Test;

import cn.javahot.homeserver.core.model.PMSData;
import cn.javahot.homeserver.core.service.DataParse;

public class DateParsePMS5003Test {
	
	private DataParse dataParse = new DateParsePMS5003();
	private String sourceData = "42,4d,0,1c,0,29,0,37,0,40,0,1d,0,2b,0,37,1d,34,8,5e,1,57,0,20,0,5,0,3,80,0,3,81";

	@Test
	public void testParseString() {
		PMSData data = dataParse.parse(sourceData);
		System.out.println("first   : " + data.getFirst());
		System.out.println("second  : " + data.getSecond());
		System.out.println("pm1CF1  : " + data.getPm10CF1());
		System.out.println("pm25CF1 : " + data.getPm25CF1());
		System.out.println("pm10CF1 : " + data.getPm10CF1());
		System.out.println("pm1     : " + data.getPm1());
		System.out.println("pm25    : " + data.getPm25());
		System.out.println("pm10    : " + data.getPm10());
		System.out.println("num03   : " + data.getNumOf03umAt01());
		System.out.println("num05   : " + data.getNumOf05umAt01());
		System.out.println("num1    : " + data.getNumOf1umAt01());
		System.out.println("num2    : " + data.getNumOf2umAt01());
		System.out.println("num5    : " + data.getNumOf5umAt01());
		System.out.println("num10   : " + data.getNumOf10umAt01());
	}

	@Test
	public void testParseByteArray() {
		fail("Not yet implemented");
	}

}
