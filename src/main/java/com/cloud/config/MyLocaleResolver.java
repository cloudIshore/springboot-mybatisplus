package com.cloud.config;



import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;


public class MyLocaleResolver implements LocaleResolver {

    //解析请求
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        //获取请求种的语言参数
        String language = request.getParameter("l");
        Locale locale = Locale.getDefault(); //如果没有就使用默认的

        //如果请求的链接携带了国际化的参数
        if (!StringUtils.isEmpty(language)){
            //zh-CN
            String[] sp = language.split("_");
            //国家地区
            locale = new Locale(sp[0],sp[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
