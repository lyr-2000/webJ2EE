package com.much.shopmanager.pojo.dto;

import lombok.ToString;
import org.springframework.beans.BeanUtils;

/**
 * @Author lyr
 * @create 2020/6/9 2:12
 */
@ToString
public class ResultBuilder<DataValue> {



        private Integer code;
        private DataValue data;
        public ResultBuilder<DataValue> code(Integer code) {
            this.code = code;
            return this;
        }
        public ResultBuilder<DataValue> data(DataValue data) {
            this.data = data;
            return this;
        }


        public Result<DataValue> build() {
            Result<DataValue> result = new Result<>();
            // BeanUtils.copyProperties(this,result);
            result.setCode(this.code);
            result.setData(this.data);
            return result;
        }




}
