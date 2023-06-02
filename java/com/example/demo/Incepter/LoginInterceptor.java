package com.example.demo.Incepter;


import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.example.demo.entity.loginDTO;
import com.example.demo.util.HttpContextUtil;
import com.example.demo.util.JwtUtils;
import com.example.demo.util.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.Jwts;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {

        //从header中获取token
        String token = request.getHeader("token");
        System.out.println(token);
        //如果token为空
        if(StringUtils.isBlank(token)){
            System.out.println("token为空");
            setReturn(response,401,"用户未注册，请先注册");
            return false;
        }


        //在实际使用中还会:
        // 1、校验token是否能够解密出用户信息来获取访问者
        loginDTO user = JwtUtils.parseToken(token); // 调用JwtUtils类的parseToken方法
        if(user == null){ // 判断用户信息是否为空
            System.out.println("用户信息为空");
            setReturn(response,401,"用户信息为空");
            return false;
        }
        // 2、token是否已经过期
        try{
            Jwts.parser().setSigningKey(JwtUtils.SECRET_KEY).parseClaimsJws(token); // 尝试解析token
        }catch(Exception e){ // 如果抛出异常，说明token已经过期
            System.out.println("token已经过期");
            setReturn(response,401,"登录过期,请重试");
            return false;
        }



        System.out.println("用户通过");
        return true;
    }
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

    }

    //返回json格式错误信息
    private static void setReturn(HttpServletResponse response, Integer code, String msg) throws IOException {
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        httpResponse.setHeader("Access-Control-Allow-Credentials", "true");
        httpResponse.setHeader("Access-Control-Allow-Origin", HttpContextUtil.getOrigin());
        //UTF-8编码
        httpResponse.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=utf-8");
        Result result = new Result(code,msg,"");
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(result);
        httpResponse.getWriter().print(json);
    }


}

