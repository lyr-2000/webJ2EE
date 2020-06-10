package com.much.shopmanager.common.util;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * @Author lyr
 * @create 2020/6/10 18:47
 */
@Slf4j
public class WebUtil {


    private static void writeJson(String json, HttpServletResponse response) {
        // response.s
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        try(
                PrintWriter writer = response.getWriter()
                ) {

            writer.write(json);
        } catch (IOException e) {
            log.error("renderJson IOerror{}",e.getMessage());
        }
    }
    public static void renderJson(Object o, HttpServletResponse response) {
        writeJson(JSONObject.toJSONString(o),response);
    }
}
