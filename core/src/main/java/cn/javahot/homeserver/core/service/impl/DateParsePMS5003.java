package cn.javahot.homeserver.core.service.impl;

import org.apache.commons.lang.StringUtils;

import cn.javahot.homeserver.core.model.PMSData;
import cn.javahot.homeserver.core.service.DataParse;

public class DateParsePMS5003 implements DataParse {

	@Override
	public PMSData parse(String sourceData) {
		PMSData result = new PMSData();
		
		String[] strData = new String[32];
		if(sourceData == null || sourceData.length() < 1){
			result.setErrorCode("1");
			result.setErrorMessage("no data");
			return result;
		}
		
		strData = sourceData.split(PMSData.SPLIT);
		if(strData == null || strData.length < 32){
			result.setErrorCode("2");
			result.setErrorMessage("no data");
			return result;
		}
		
		if(StringUtils.isBlank(strData[0]) || !StringUtils.equals(strData[0], PMSData.FIRST_CHAR)
				|| StringUtils.isBlank(strData[1]) || !StringUtils.equals(strData[1], PMSData.SECOND_CHAR)){
			result.setErrorCode("3");
			result.setErrorMessage("first data error");
			return result;
		}
		
		
		result.setFirst(Byte.decode("0x" + strData[0]));
		result.setSecond(Byte.decode("0x" + strData[1]));
		result.setDataLength(new byte[]{Byte.decode("0x" + strData[2]), Byte.decode("0x" + strData[3])});
		result.setPm1CF1(Integer.parseInt(strData[4], 16) * 256 + Integer.parseInt(strData[5], 16));
		result.setPm25CF1(Integer.parseInt(strData[6], 16) * 256 + Integer.parseInt(strData[7], 16));
		result.setPm10CF1(Integer.parseInt(strData[8], 16) * 256 + Integer.parseInt(strData[9], 16));
		result.setPm1(Integer.parseInt(strData[10], 16) * 256 + Integer.parseInt(strData[11], 16));
		result.setPm25(Integer.parseInt(strData[12], 16) * 256 + Integer.parseInt(strData[13], 16));
		result.setPm10(Integer.parseInt(strData[14], 16) * 256 + Integer.parseInt(strData[15], 16));
		result.setNumOf03umAt01(Integer.parseInt(strData[16], 16) * 256 + Integer.parseInt(strData[17], 16));
		result.setNumOf05umAt01(Integer.parseInt(strData[18], 16) * 256 + Integer.parseInt(strData[19], 16));
		result.setNumOf1umAt01(Integer.parseInt(strData[20], 16) * 256 + Integer.parseInt(strData[21], 16));
		result.setNumOf2umAt01(Integer.parseInt(strData[22], 16) * 256 + Integer.parseInt(strData[23], 16));
		result.setNumOf5umAt01(Integer.parseInt(strData[24], 16) * 256 + Integer.parseInt(strData[25], 16));
		result.setNumOf10umAt01(Integer.parseInt(strData[26], 16) * 256 + Integer.parseInt(strData[27], 16));
//		result.setVersion(Byte.decode("0x" + strData[28]));
//		result.setError(Byte.decode("0x" + strData[29]));
//		result.setCheckCode(new byte[]{Byte.decode("0x" + strData[30]), Byte.decode("0x" + strData[31])});
		
//		return parse(parseToByteArray(sourceData));
		return result;
	}
//
//	@Override
//	public PMSData parse(byte[] byteData) {
//		PMSData result = new PMSData();
//		if(byteData == null || byteData.length < 32){
//			result.setErrorCode("0");
//			result.setErrorMessage("no data");
//			return result;
//		}
//		result.setFirst(byteData[0]);
//		result.setSecond(byteData[1]);
//		result.setDataLength(new byte[]{byteData[2], byteData[3]});
//		result.setPm1CF1((byteData[4] << 8) + byteData[5]);
//		result.setPm25CF1((byteData[6] << 8) + byteData[7]);
//		result.setPm10CF1((byteData[8] << 8) + byteData[9]);
//		result.setPm1((byteData[10] << 8) + byteData[11]);
//		result.setPm25((byteData[12] << 8) + byteData[13]);
//		result.setPm10((byteData[14] << 8) + byteData[15]);
//		result.setNumOf03umAt01((byteData[16] << 8) + byteData[17]);
//		result.setNumOf05umAt01((byteData[18] << 8) + byteData[19]);
//		result.setNumOf1umAt01((byteData[20] << 8) + byteData[21]);
//		result.setNumOf2umAt01((byteData[22] << 8) + byteData[23]);
//		result.setNumOf5umAt01((byteData[24] << 8) + byteData[25]);
//		result.setNumOf10umAt01((byteData[26] << 8) + byteData[27]);
//		result.setVersion(byteData[28]);
//		result.setError(byteData[29]);
//		result.setCheckCode(new byte[]{byteData[30], byteData[31]});
//		return result;
//	}
	
//	private byte[] parseToByteArray(String sourceData){
//		byte[] result = new byte[32];
//		String[] strData = new String[32];
//		if(sourceData == null || sourceData.length() < 1){
//			result[0] = '1';
//			return result;
//		}
//		
//		strData = sourceData.split(PMSData.SPLIT);
//		if(strData == null || strData.length < 32){
//			result[0] = '2';
//			return result;
//		}
//		
//		if(StringUtils.isBlank(strData[0]) || !StringUtils.equals(strData[0], PMSData.FIRST_CHAR)
//				|| StringUtils.isBlank(strData[1]) || !StringUtils.equals(strData[1], PMSData.SECOND_CHAR)){
//			result[0] = '3';
//			return result;
//		}
//		
//		for(int i = 0; i < strData.length; i++){
//			result[i] = Byte.decode("0x" + strData[i]);
//		}
//		
//		return result;
//	}

}
