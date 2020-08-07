package tacos.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

  @Override
  public void addViewControllers(ViewControllerRegistry registry) {
    //视图控制器，设置视图名
    registry.addViewController("/").setViewName("home");
    registry.addViewController("/abc").setViewName("home");

    //声明登入页面的视图控制器
    registry.addViewController("/login");
  }

}
