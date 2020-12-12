package com.xingray.javabase.result;

public class Result<T> {

    private T data;

    private boolean success;
    private String message;
    private int code;
    private Exception exception;

    public static final Result<Object> OK = new Result<>(true);
    public static final Result<Object> FAIL = new Result<>(false);

    public static <V> Result<V> success() {
        return new Result<>(true);
    }

    public static <V> Result<V> success(V v) {
        return new Result<>(v, true, null, 0, null);
    }

    public static <V> Result<V> failure() {
        return new Result<>(false);
    }

    public static <V> Result<V> failure(String message) {
        return new Result<>(message);
    }

    public static <V> Result<V> failure(int code, String message) {
        return new Result<>(code, message);
    }

    public static <V> Result<V> failure(int code) {
        return new Result<>(null, false, null, code, null);
    }

    public static <V> Result<V> failure(Exception e) {
        return new Result<>(null, false, e.getMessage(), 0, e);
    }

    public Result() {
    }

    public Result(boolean success) {
        this(null, success, null, 0, null);
    }

    public Result(Exception exception) {
        this(null, false, exception.getMessage(), 0, exception);
    }

    public Result(String message) {
        this(null, false, message, 0, null);
    }

    public Result(int code, String message) {
        this(null, false, message, code, null);
    }

    public Result(T data, boolean success, String message, int code, Exception exception) {
        this.data = data;
        this.success = success;
        this.message = message;
        this.exception = exception;
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    @Override
    public String toString() {
        return "Result{" +
                "date=" + data +
                ", success=" + success +
                ", message='" + message + '\'' +
                ", code=" + code +
                ", exception=" + exception +
                '}';
    }
}
