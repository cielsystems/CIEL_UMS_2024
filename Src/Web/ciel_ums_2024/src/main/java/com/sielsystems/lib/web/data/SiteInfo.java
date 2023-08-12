package com.sielsystems.lib.web.data;

import java.util.Locale;

public class SiteInfo {
	private String appName;
	private String siteLogo;
	private String siteLogoText;
	private String siteWellMsg;
	private String siteCopy;

	private boolean loginPwdEncrypt;
	
	private String menuCode;
	private String menuParentCode;
	
	public SiteInfo() {
		this.appName = "";
		this.siteLogo = "";
		this.siteLogoText = "";
		this.siteWellMsg = "";
		this.siteCopy = "";
		
		this.loginPwdEncrypt = false;
		
		this.menuCode = "00";
		this.menuParentCode = "00";
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getSiteLogo() {
		return siteLogo;
	}

	public void setSiteLogo(String siteLogo) {
		this.siteLogo = siteLogo;
	}

	public String getSiteLogoText() {
		return siteLogoText;
	}

	public void setSiteLogoText(String siteLogoText) {
		this.siteLogoText = siteLogoText;
	}

	public String getSiteWellMsg() {
		return siteWellMsg;
	}

	public void setSiteWellMsg(String siteWellMsg) {
		this.siteWellMsg = siteWellMsg;
	}

	public String getSiteCopy() {
		return siteCopy;
	}

	public void setSiteCopy(String siteCopy) {
		this.siteCopy = siteCopy;
	}

	public boolean isLoginPwdEncrypt() {
		return loginPwdEncrypt;
	}

	public void setLoginPwdEncrypt(boolean loginPwdEncrypt) {
		this.loginPwdEncrypt = loginPwdEncrypt;
	}

	public String getMenuCode() {
		return menuCode;
	}

	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}

	public String getMenuParentCode() {
		return menuParentCode;
	}

	public void setMenuParentCode(String menuParentCode) {
		this.menuParentCode = menuParentCode;
	}

	@Override
	public String toString() {
		return String.format(Locale.US, "[[%s], [%s], [%s], [%s], [%s]], %s, [[%s], [%s]]", 
				appName, siteLogo, siteLogoText, siteWellMsg, siteCopy,
				loginPwdEncrypt, menuCode, menuParentCode);
	}
}
