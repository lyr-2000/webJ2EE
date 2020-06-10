package com.much.shopmanager.common.util;

import com.google.common.collect.Maps;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.util.Base64Utils;



import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
  import java.time.Duration;

import java.util.Date;
import java.util.Map;

/**
 * @Author lyr
 * @create 2020/6/9 0:55
 */
public class JwtUtil {
    private static final String JWT_SECRET = "fnaripfudsgfpbwei65fa9sdfjcewdiudsad56161bfof1564d16";
    /**
     * 生成加密秘钥
     *
     * @return 秘钥
     */
    private static SecretKey generalKey() {
        String stringKey =  JWT_SECRET;// 秘钥
        byte[] encodedKey = Base64Utils.decodeFromString(stringKey);
        SecretKey key = new SecretKeySpec(encodedKey, 0, encodedKey.length, "AES");
        return key;
    }

    public static String createJWT(Map<String,?> map, long ttlMillis) {
        long nowTime = System.currentTimeMillis();
        Date endDate = new Date(nowTime+ttlMillis);
        JwtBuilder builder = Jwts.builder();
        //将信息写入 token
        map.forEach(builder::claim);
        builder.signWith(SignatureAlgorithm.HS256,generalKey());
        //设置 token过期时间
        builder.setExpiration(endDate);
        return builder.compact();


    }

    public static Claims getJwtInformation(String token) throws RuntimeException {
        SecretKey key = generalKey();
        Claims claims = Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody();
        return claims;
    }

    public static void main(String[] args) {
        Map map = Maps.newHashMap();
        map.put("id","sss");
        String token = createJWT(map, Duration.ofDays(1).toMillis());
        Claims info = getJwtInformation(token);
        System.out.println("获取成功 PPP"+info);
    }

}
