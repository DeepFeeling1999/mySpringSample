package com.example.config;

import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author dell
 * 实现自定义的区域解析器，实现LocaleResolver接口
 */
public class MyLocaleResolver implements LocaleResolver {

    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        //获取请求中的语言参数，通过点击绑定对应的参数
        String language=httpServletRequest.getParameter("lan");
        //没有的话获取默认参数
        Locale locale=Locale.getDefault();

        if(!StringUtils.isEmpty(language)){
            String []splits=language.split("_");

            //创建区域对象
            locale=new Locale(splits[0],splits[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
