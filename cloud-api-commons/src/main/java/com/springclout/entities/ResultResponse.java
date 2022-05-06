package com.springclout.entities;

import com.springclout.constants.Constants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 吕二宁
 * @version 1.0
 * @description: TODO(封装返回结果)
 * @date 2022/3/23 8:29
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultResponse {

    /**
     * 返回状态码
     */
    private String code;
    /**
     * 异常信息
     */
    private String message;
    /**
     * 返回数据
     */
    private Object data;

    public static ResultResponse success(String code, Object data){
        return new ResultResponse(code,"",data);
    }

    public static ResultResponse success() {
        return new ResultResponse(Constants.CODE_200, "", null);
    }

    public static ResultResponse error(String code, String message){
        return new ResultResponse(code,message,null);
    }

    public static ResultResponse error(){
        return new ResultResponse(Constants.CODE_500,"系统错误",null);
    }

}
