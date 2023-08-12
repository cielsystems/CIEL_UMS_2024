package com.sielsystems.lib.util;

import com.sielsystems.lib.diagnostics.CLog;

public class NConvert {
	private static final CLog log = CLog.getLog(NConvert.class);
	
	// 문자열을 정수로 변환
	public static int getInteger(String val) {
		return getInteger(val, 10, 0);
	}
	public static int getInteger(String val, int defaultValue) {
		return getInteger(val, 10, defaultValue);
	}
	public static int getInteger(String val, int radix, int defaultValue) {
		int value = defaultValue;
		try {
			value = Integer.parseInt(val, radix);
		} catch (Exception ex) {
			log.e(ex, "ERROR. getInteger([%s], %d, %d) - Failed to convert integer [%s]",
					val, radix, defaultValue, ex.getMessage());
			return defaultValue;
		}
		return value;
	}
}
