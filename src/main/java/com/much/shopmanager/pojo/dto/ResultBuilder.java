package com.much.shopmanager.pojo.dto;

import org.springframework.beans.BeanUtils;

/**
 * @Author lyr
 * @create 2020/6/9 2:12
 */
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
            BeanUtils.copyProperties(this,result);
            return result;
        }




}
