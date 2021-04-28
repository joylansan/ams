package com.joylansan.server.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 返回前端登录对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespBean {
    private long code;
    private String message;
    private Object obj;

    /**
     * 成功返回结果
     * @param message
     * @return
     */
    public static RespBean success(String message){
        return new RespBean(200,message,null);
    }

    /**
     * 成功返回结果
     * @param message
     * @return
     */
    public static RespBean success(String message, Object obj){
        return new RespBean(200,message,obj);
    }

    /**
     * 返回失败结果
     * @param message
     * @return
     */
    public static RespBean error(String message){
        return new RespBean(500,message,null);
    }
    /**
     * 返回失败结果
     * @param message
     * @return
     */
    public static RespBean error(String message, Object obj){
        return new RespBean(500,message,obj);
    }


}
