/**
 * 
 */
package cn.javahot.homeserver.core.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author sunan
 *
 */
public class CommandUtil {
	

	public static String exeCmd(String commandStr) {
		BufferedReader br = null;
		StringBuffer result = new StringBuffer();
		try {
			Process p = Runtime.getRuntime().exec(commandStr);
			br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line = null;
			while ((line = br.readLine()) != null) {
				result.append(line + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		return result.toString();
	}

}
