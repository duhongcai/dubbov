package cn.qtec.study.dubbov.admin.commons.enums;

import org.springframework.util.StringUtils;

/**
 * Created by duhc on 2018/3/27.
 */
public enum ErrorCodeEnum {

    //相当于枚举类的实例
    SYSTEM_ERROR("system_error","系统错误"),
    ILLEGAL_ARGUMENT("illegal_argument","参数非法"),
    ILLEGAL_SIGN("illegal_sign","签名非法"),
    ILLEGAL_REG_CODE("illegal_reg_code","注册码非法");

    private String code;
    private String desc;

    private ErrorCodeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static final ErrorCodeEnum getByCode(String code){
        if (StringUtils.isEmpty(code)) return null;
        for (ErrorCodeEnum item: ErrorCodeEnum.values()){
            if (item.getCode().equals(code)){
                return item;
            }
        }
        return null;
    }
}
