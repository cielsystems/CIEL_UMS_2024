package com.sielsystems.lib.web.services;

import com.sielsystems.lib.web.data.SiteInfo;

public interface SystemService {

	// 사이트 정보 반환
	SiteInfo getSiteInfo();
/*	
	// DB에 로그 출력
	void writeLog(long userIndex, String userIp, LogType type, String title);
	void writeLog(long userIndex, String userIp, LogType type, String title, String content);
	void writeLog(long userIndex, String userIp, LogType type, String title, String content, String query);
	
	// 시스템 설정을 문자열로 반환
	String getConfigString(ConfigCode code);
	
	// 시스템 설정을 정수형으로 반환
	int getConfigInt(ConfigCode code);
*/	
}
