package cn.elton.error;

public enum EmBusinessError implements CommonError{
    //通用错误类型
    PARAMETER_VALIDATION_ERROR(10001, "参数不合法"),

    //未知错误
    UNKNOWN_ERROR(10002, "未知错误"),

    //10000开头为用户信息相关错误定义
    USER_NOT_EXIT(20001, "用户不存在"),

    USER_LOGIN_FAIL(20002, "用户手机号或密码不正确"),

    USER_NOT_LOGIN(20003, "用户还未登录"),

    //30000开头为交易信息错误
    STOCK_NOT_ENOUGH(30001, "库存不足"),

    ;

    private EmBusinessError(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    private int errCode;
    private String errMsg;

    @Override
    public int getErrorCode() {
        return this.errCode;
    }

    @Override
    public String getErrorMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrorMsg(String errorMsg) {
        this.errMsg = errorMsg;
        return this;
    }
}
