package com.much.shopmanager.pojo.dto;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.BeanUtils;

/**
 * @Author lyr
 * @create 2020/6/9 1:38
 */
@ToString
@Data
public class Result<DataValue> {
    private Integer code;
    private DataValue data;
    private Long total;
    public static  <DataValue>Result<DataValue> of(DataValue resp) {
        Result<DataValue> result = new Result<>();
        result.setData(resp);
        result.setCode(200);
        return result;
    }

    public static  <DataValue>Result<DataValue> of(Integer code,DataValue resp) {
        Result<DataValue> result = new Result<>();
        result.setData(resp);
        result.setCode(code);
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
