package com.example.demo.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author dell
 *
 * 实现了 WebMvcConfigurer 接口，
 *
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

  @Override
  public void addViewControllers(ViewControllerRegistry registry) {

    //将"/"传递进去，视图控制器会针对该路径执行Get请求
    //会返回ViewControllerRegistry对象，
    //基于此对象继续调用setViewName方法来指明请求"/"时要转发到"home"上
    registry.addViewController("/").setViewName("home");
  }

}
