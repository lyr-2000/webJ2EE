package com.much.shopmanager.pojo.dto;

import org.springframework.beans.BeanUtils;

/**
 * @Author lyr
 * @create 2020/6/9 1:38
 */

public class Result<DataValue> {
    private Integer code;
    private DataValue data;
    public static  <DataValue>Result<DataValue> of(DataValue resp) {
        Result<DataValue> result = new Result<>();
        result.setData(resp);
        result.setCode(200);
        return result;
    }

    public static  <DataValue> ResultBuilder<DataValue> builder() {
        return new  ResultBuilder<DataValue>();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public DataValue getData() {
        return data;
    }

    public void setData(DataValue data) {
        this.data = data;
    }
}
