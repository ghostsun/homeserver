package cn.javahot.homeserver.core.service;

import cn.javahot.homeserver.core.model.WolData;

/**
 * Wake On Lan 服务类
 * @author sunan
 *
 */
public interface WolService {
	
	/**
	 * Wake On Lan
	 * @param data
	 */
	public String wol(WolData data) throws Exception;

}
