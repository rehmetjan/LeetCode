package net.selte.leetcode.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	private boolean success = true;

	private String message = "操作成功！";

	private Integer code = 0;

	private T result;

	private long timestamp = System.currentTimeMillis();

	public Result() {

	}

	public Result<T> success(String message) {
		this.message = message;
		this.code = 200;
		this.success = true;
		return this;
	}


	public static Result<Object> ok() {
		Result<Object> r = new Result<Object>();
		r.setSuccess(true);
		r.setCode(200);
		r.setMessage("成功");
		return r;
	}

	public static Result<Object> ok(String msg) {
		Result<Object> r = new Result<Object>();
		r.setSuccess(true);
		r.setCode(200);
		r.setMessage(msg);
		return r;
	}

	public static Result<Object> ok(Object data) {
		Result<Object> r = new Result<Object>();
		r.setSuccess(true);
		r.setCode(200);
		r.setResult(data);
		return r;
	}

	public static Result<Object> error(String msg) {
		return error(500, msg);
	}

	public static Result<Object> error(int code, String msg) {
		Result<Object> r = new Result<Object>();
		r.setCode(code);
		r.setMessage(msg);
		r.setSuccess(false);
		return r;
	}

	public Result<T> error500(String message) {
		this.message = message;
		this.code = 500;
		this.success = false;
		return this;
	}

	public static Result<Object> noauth(String msg) {
		return error(510, msg);
	}
}
