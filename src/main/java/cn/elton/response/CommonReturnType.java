package cn.elton.response;

public class CommonReturnType {
    //表明对应请求的返回处理结果："success"或"fail"
    private String status;
    private Object data;

    //如果status=success，则data内返回前端需要的json数据

    //如果status=fail，则data内使用通用的错误码格式

    //
    public static CommonReturnType create(Object result) {
        return CommonReturnType.create(result, "success");
    }

    public static CommonReturnType create(Object result, String status) {
        CommonReturnType type = new CommonReturnType();
        type.setData(result);
        type.setStatus(status);
        return type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
