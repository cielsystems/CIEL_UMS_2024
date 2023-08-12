package com.sielsystems.lib.util;

import com.sielsystems.lib.diagnostics.CLog;

public class StrUtil {
	private static final CLog log = CLog.getLog(StrUtil.class);
	
	public static boolean isNullOrEmpty(String str) {
		if (str == null) return true;
		if (str.length() <= 0) return true;
		return false;
	}
	
	public static String toString(Object obj) {
		return obj == null ? "" : obj.toString();
	}
}