package cn.javahot.homeserver.core.model;

/**
 * 颗粒物传感器传回数据的格式化
 * @author sunan
 *
 */
public class PMSData {
	/**
	 * 起始符1
	 * 0x42（固定）
	 */
	private byte start;
	/**
	 * 起始符2
	 * 0x4d（固定）
	 */
	private byte second;
	/**
	 * 帧长度
	 * 帧长度=2 * 13 + 2（数据 + 校验位）
	 */
	private byte[] dataLength = new byte[2];
	/**
	 * 数据1
	 * 表示PM1.0浓度（CF=1，标准颗粒物）单位μg/m³
	 */
	private int pm1CF1 = -1;
	/**
	 * 数据2
	 * 表示PM2.5浓度（CF=1，标准颗粒物）单位μg/m³
	 */
	private int pm25CF1 = -1;
	/**
	 * 数据3
	 * 表示PM10浓度（CF=1，标准颗粒物）单位μg/m³
	 */
	private int pm10CF1 = -1;
	/**
	 * 数据4
	 * 表示PM1.0浓度（大气环境下）单位μg/m³
	 */
	private int pm1 = -1;
	/**
	 * 数据5
	 * 表示PM2.5浓度（大气环境下）单位μg/m³
	 */
	private int pm25 = -1;
	/**
	 * 数据6
	 * 表示PM10浓度（大气环境下）单位μg/m³
	 */
	private int pm10 = -1;
	/**
	 * 数据7
	 * 表示0.1升空气中直径在0.3um以上颗粒物个数
	 */
	private int numOf03umAt01 = -1;
	/**
	 * 数据8
	 * 表示0.1升空气中直径在0.5um以上颗粒物个数
	 */
	private int numOf05umAt01 = -1;
	/**
	 * 数据9
	 * 表示0.1升空气中直径在1.0um以上颗粒物个数
	 */
	private int numOf1umAt01 = -1;
	/**
	 * 数据10
	 * 表示0.1升空气中直径在2.5um以上颗粒物个数
	 */
	private int numOf2umAt01 = -1;
	/**
	 * 数据11
	 * 表示0.1升空气中直径在5.0um以上颗粒物个数
	 */
	private int numOf5umAt01 = -1;
	/**
	 * 数据12
	 * 表示0.1升空气中直径在10um以上颗粒物个数
	 */
	private int numOf10umAt01 = -1;
	/**
	 * 校验码
	 * 校验码=起始符1+起始符2+。。。+数据13低八位
	 */
	private byte[] checkCode = new byte[2];
	public byte getStart() {
		return start;
	}
	public void setStart(byte start) {
		this.start = start;
	}
	public byte getSecond() {
		return second;
	}
	public void setSecond(byte second) {
		this.second = second;
	}
	public byte[] getDataLength() {
		return dataLength;
	}
	public void setDataLength(byte[] dataLength) {
		this.dataLength = dataLength;
	}
	public int getPm1CF1() {
		return pm1CF1;
	}
	public void setPm1CF1(int pm1cf1) {
		pm1CF1 = pm1cf1;
	}
	public int getPm25CF1() {
		return pm25CF1;
	}
	public void setPm25CF1(int pm25cf1) {
		pm25CF1 = pm25cf1;
	}
	public int getPm10CF1() {
		return pm10CF1;
	}
	public void setPm10CF1(int pm10cf1) {
		pm10CF1 = pm10cf1;
	}
	public int getPm1() {
		return pm1;
	}
	public void setPm1(int pm1) {
		this.pm1 = pm1;
	}
	public int getPm25() {
		return pm25;
	}
	public void setPm25(int pm25) {
		this.pm25 = pm25;
	}
	public int getPm10() {
		return pm10;
	}
	public void setPm10(int pm10) {
		this.pm10 = pm10;
	}
	public int getNumOf03umAt01() {
		return numOf03umAt01;
	}
	public void setNumOf03umAt01(int numOf03umAt01) {
		this.numOf03umAt01 = numOf03umAt01;
	}
	public int getNumOf05umAt01() {
		return numOf05umAt01;
	}
	public void setNumOf05umAt01(int numOf05umAt01) {
		this.numOf05umAt01 = numOf05umAt01;
	}
	public int getNumOf1umAt01() {
		return numOf1umAt01;
	}
	public void setNumOf1umAt01(int numOf1umAt01) {
		this.numOf1umAt01 = numOf1umAt01;
	}
	public int getNumOf2umAt01() {
		return numOf2umAt01;
	}
	public void setNumOf2umAt01(int numOf2umAt01) {
		this.numOf2umAt01 = numOf2umAt01;
	}
	public int getNumOf5umAt01() {
		return numOf5umAt01;
	}
	public void setNumOf5umAt01(int numOf5umAt01) {
		this.numOf5umAt01 = numOf5umAt01;
	}
	public int getNumOf10umAt01() {
		return numOf10umAt01;
	}
	public void setNumOf10umAt01(int numOf10umAt01) {
		this.numOf10umAt01 = numOf10umAt01;
	}
	public byte[] getCheckCode() {
		return checkCode;
	}
	public void setCheckCode(byte[] checkCode) {
		this.checkCode = checkCode;
	}
	
	
}
