// tag::baseClass[]
package com.example.demo.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.Order;

import javax.validation.Valid;
/**
 * @author DeepFeeling-1999
 *
 * -@Slf4j 是Lombok提供的，运行时生成一个Logger
 *
 * -@RequestMapping("/orders")
 * 处理以/orders开头的请求
 */
@Slf4j
@Controller
@RequestMapping("/orders")
public class OrderController {

  /**
   *  - @GetMapping("/current")
   *  处理/orders/current的HTTP get请求
   */
  @GetMapping("/current")
  public String orderForm(Model model){
    model.addAttribute("order",new Order());

    //返回视图名
    return "orderForm";
  }

  /**
   * -@PostMapping处理对"/orders"的post请求
   *
   * -@valid表示对提交的Taco对象进行校验，校验的时机是在它绑定完表单数据后
   * 调用processDesign之前，捕获错误传递到errors对象中，
   */
  @PostMapping
  public String processOrder(@Valid Order order, Errors errors) {
    if (errors.hasErrors()) {
      return "orderForm";
    }

    log.info("Order submitted: " + order);
    return "redirect:/";
  }
}