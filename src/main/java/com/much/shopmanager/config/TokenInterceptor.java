package com.much.shopmanager.config;

import com.much.shopmanager.common.util.JwtUtil;

import com.much.shopmanager.common.util.WebUtil;
import com.much.shopmanager.pojo.dto.Result;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author lyr
 * @create 2020/6/9 0:54
 */
@Slf4j
public class TokenInterceptor  implements HandlerInterceptor {
    // private final Logger log = LoggerFactory.getLogger(TokenInterceptor.class);
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String token = httpServletRequest.getHeader("token");
        // System.out.println(123);
        log.error("收到请求");
        log.info("收到请求");
        try{
            JwtUtil.getJwtInformation(token);
        }catch (Exception ex) {
            log.error("出现问题");
            WebUtil.renderJson(Result.of(400,"参数token失效"),httpServletResponse);
            // WebUtil.renderJson(,httpServletResponse);
            return false;
        }
        //如果校验不通过 拒绝执行

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
