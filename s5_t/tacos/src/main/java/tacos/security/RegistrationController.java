package tacos.security;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tacos.data.UserRepository;

/**
 * @author dell
 */
@Controller
@RequestMapping("/register")
public class RegistrationController {
  
  private UserRepository userRepo;
  private PasswordEncoder passwordEncoder;

  public RegistrationController(
      UserRepository userRepo, PasswordEncoder passwordEncoder) {
    this.userRepo = userRepo;
    this.passwordEncoder = passwordEncoder;
  }

  /**
   * 处理get请求
   * @return  返回视图名
   */
  @GetMapping
  public String registerForm() {
    return "registration";
  }


  /**
   * 处理post请求
   * @param form RegistrationFrom对象绑定了请求的数据
   * @return
   */
  @PostMapping
  public String processRegistration(RegistrationForm form) {

    //使用注入的UserRepository保存了该对象
    //注入了PasswordEncoder，在表单提交之前，将其传入到toUser方法
    //在密码保存到数据库前会进行转码
    userRepo.save(form.toUser(passwordEncoder));
    return "redirect:/login";
  }

}
