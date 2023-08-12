package com.sielsystems.lib.web.data.types;

public enum ErrorCode {
	NO_ERROR(0, ""),
	NOT_EXIST_USER_ID(1000, "사용자ID가 존재하지 않습니다."),
	INVALID_PASSWORD(1001, "비밀번호가 유효화지 않습니다."),
	MISMATCH_PASSWORD(1002, "비밀번호가 일치하지 않습니다"),
	MISMATCH_PASSWORD_LOCK(1003, "비밀번호가 일치하지 않아 계정이 잠깁니다."),
	LOCK_ACCOUNT(1004, "비밀번호 오류횟수 초과로 잠겨있는 계정 입니다."),
	CHANGE_PASSWORD(1005, "사용자 비밀번호 변경 일수가 초과하였습니다."),
	UNKNOWN_USER_TYPE(1006, "알 수 없는 사용자 타입입니다."),
	NOT_ALLOW_LOGIN_IP(1007, "로그인 할 수 없는 IP주소입니다."),
	LOGOUT_FAIL(1010, "사용자 로그아웃을 실패하였습니다."),
	SYSTEM_ERROR(9998, "시스템 오류가 발생하였습니다."),
	UNKNOWN_ERROR(9999, "알 수 없는 오류가 발생하였습니다.");
	
	private final int errCode;
	private final String errMsg;
	
	private ErrorCode(int errCode, String errMsg) {
		this.errCode = errCode;
		this.errMsg = errMsg;
	}
	
	public int getCode() {
		return errCode;
	}

	@Override
	public String toString() {
		return errMsg;
	}
	
	public static ErrorCode codeOf(int errCode) {
		for (ErrorCode item : values()) {
			if (item.getCode() == errCode)
				return item;
		}
		return UNKNOWN_ERROR;
	}
}
