package tacos.web;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @author dell
 *
 * 可以添加   @Profile("dev","test")
 * 此时，组件会在dev或者test profile激活时才会加载
 *
 * 若是@Profile("!dev")
 * 则表明组件在dev  profile不激活的时候才会加载
 *
 * 若是@Profile("!dev","!test")
 * 则表明组件在dev和test  profile均未激活的时候才会加载
 */
@Component
@Data
@Validated
@ConfigurationProperties(prefix = "taco.orders")
public class OrderProps {
    /**
     * 设置每页数量，并限制最少为5，最大为25
     */
    @Min(value=5,message = "每页大于5！")
    @Max(value = 25,message = "每页小于25！")
    private int pageSize=20;
}
