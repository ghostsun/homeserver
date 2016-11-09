package cn.javahot.homeserver.core.service;

import cn.javahot.homeserver.core.model.PMSData;

public interface DataParse {
	
	public PMSData parse(String sourceData);
	
	public PMSData parse(byte[] byteData);

}
