
package com.kakaopay.payment.exception.base;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BaseException extends RuntimeException {

	private final Result result;
	private final Object data;

	public BaseException(String code, String desc) {
        result = Result.builder().code(code).desc(desc).build();
        data = null;
	}

	public BaseException(String code, String desc, String extraMessage) {
        result = Result.builder().code(code).desc(desc).extraMessage(extraMessage).build();
        data = null;
	}

	@Getter
	@Builder
	public static class Result {
		private String code;
		private String desc;
		private String extraMessage;
	}

}