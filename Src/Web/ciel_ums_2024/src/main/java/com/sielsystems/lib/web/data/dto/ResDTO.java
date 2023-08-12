package com.sielsystems.lib.web.data.dto;

import com.sielsystems.lib.web.data.types.ErrorCode;

public class ResDTO {
	private int resCode;
	private String resMsg;
	
	public ResDTO() {
		this(ErrorCode.NO_ERROR.getCode(), 
				ErrorCode.NO_ERROR.toString());
	}

	public ResDTO(String resMsg) {
		this(ErrorCode.NO_ERROR.getCode(), resMsg);
	}

	public ResDTO(ErrorCode err) {
		this(err.getCode(), err.toString());
	}

	public ResDTO(ErrorCode err, String resMsg) {
		this(err.getCode(), resMsg);
	}


	public ResDTO(int resCode, String resMsg) {
		this.resCode = resCode;
		this.resMsg = resMsg;
	}

	public int getResCode() {
		return resCode;
	}

	public void setResCode(int resCode) {
		this.resCode = resCode;
	}

	public String getResMsg() {
		return resMsg;
	}

	public void setResMsg(String resMsg) {
		this.resMsg = resMsg;
	}

	@Override
	public String toString() {
		return String.format("[%d, %s]", resCode, resMsg);
	}
}
