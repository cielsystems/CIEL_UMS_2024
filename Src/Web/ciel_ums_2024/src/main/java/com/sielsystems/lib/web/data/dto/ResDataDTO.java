package com.sielsystems.lib.web.data.dto;

import com.sielsystems.lib.util.StrUtil;
import com.sielsystems.lib.web.data.types.ErrorCode;

public class ResDataDTO <T> extends ResDTO {
	private T data;

	public ResDataDTO() {
		super();
		data = null;
	}
	
	public ResDataDTO(T data) {
		super();
		this.data = data;
	}

	public ResDataDTO(int errCode, String resMsg) {
		super(errCode, resMsg);
		data = null;
	}
	
	public ResDataDTO(ErrorCode errorCode) {
		super(errorCode);
		data = null;
	}
	
	public ResDataDTO(ErrorCode errorCode, String resMsg) {
		super(errorCode, resMsg);
		data = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return String.format("[%s], [%s]", 
				super.toString(), StrUtil.toString(data));
	}
}
