package cn.javahot.homeserver.core.service.impl;

import org.apache.commons.lang.StringUtils;

import cn.javahot.homeserver.core.model.WolData;
import cn.javahot.homeserver.core.service.WolService;
import cn.javahot.homeserver.core.utils.CommandUtil;

public class WolServiceImpl implements WolService {

	@Override
	public String wol(WolData data) throws Exception{
		String result = null;
		
		if(data == null || StringUtils.isBlank(data.getIp()) || StringUtils.isBlank(data.getMac()) || StringUtils.isBlank(data.getPort())){
			result = "data error";
			throw new Exception(result);
		}
		String cmd = "wakeonlan -i ";
		cmd = cmd + data.getIp() + " -p " + data.getPort() + " " + data.getMac();
		result = CommandUtil.exeCmd(cmd);
		System.out.println(result);
		return result;

	}

}
