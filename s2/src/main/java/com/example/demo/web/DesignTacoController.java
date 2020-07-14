// tag::head[]
package com.example.demo.web;

import com.example.demo.Ingredient;
import com.example.demo.Taco;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.demo.Ingredient.Type;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author DeepFeeling1999
 * 
 * -@Slf4j 是Lombok提供的，运行时生成一个Logger
 * <p>
 * -@Controller  识别为控制器，会自动扫描生成组件
 * <p>
 * -@RequestMapping("/design")
 * 指定控制器所处理的请求，此处处理“/design”开头的请求
 */
@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {


    @GetMapping
    public String showDesignForm(Model myModel) {
        //构建一个配料列表
        List<Ingredient> ingredients = Arrays.asList(new Ingredient("FLTO", "Flour Tortilla", Type.WRAP),
                                                     new Ingredient("COTO", "Corn Tortilla", Type.WRAP),
                                                     new Ingredient("GRBF", "Ground Beef", Type.PROTEIN),
                                                     new Ingredient("CARN", "Carnitas", Type.PROTEIN),
                                                     new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES),
                                                     new Ingredient("LETC", "Lettuce", Type.VEGGIES),
                                                     new Ingredient("CHED", "Cheddar", Type.CHEESE),
                                                     new Ingredient("JACK", "Monterrey Jack", Type.CHEESE),
                                                     new Ingredient("SLSA", "Salsa", Type.SAUCE),
                                                     new Ingredient("SRCR", "Sour Cream", Type.SAUCE)
        );

        //获取可选值
        Ingredient.Type[] types = Ingredient.Type.values();
        for (Ingredient.Type tempType : types) {
            myModel.addAttribute(tempType.toString().toLowerCase(), filterByType(ingredients, tempType));
        }


        myModel.addAttribute("design", new Taco());

        //采用thymeleaf模板库，不可以直接与spring通信，但是可以通过servlet的request属性协作
        //所以在spring请求转移到视图前，会把数据复制到request中
        return "design";
    }

    /**
     * -@PostMapping处理对"/design"的post请求
     *
     * -@valid表示对提交的Taco对象进行校验，校验的时机是在它绑定完表单数据后
     * 调用processDesign之前，捕获错误传递到errors对象中，
     */
    @PostMapping
    public String processDesign(@Valid @ModelAttribute("design") Taco design, Errors errors, Model model) {
        if (errors.hasErrors()) {
            return "design";
        }
        log.info("Processing design: " + design);

        return "redirect:/orders/current";
    }

    private List<Ingredient> filterByType(List<Ingredient> ingredients, Ingredient.Type type) {
        return ingredients.stream().filter(x -> x.getType().equals(type)).collect(Collectors.toList());
    }
}
