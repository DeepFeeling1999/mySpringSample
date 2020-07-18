//tag::securityConfigOuterClass[]
package tacos.security;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
//end::securityConfigOuterClass[]
//tag::baseBonesImports[]
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//end::baseBonesImports[]

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;

/**
 * @author dell
 */
@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    //通过覆盖WebSecurityConfigurerAdapter基础配置类中的configure()方法来进行配置

    /**
     * -@Qualifier   限定符，限定bean
     */
    @Qualifier("inMemoryUserDetailsManager")
    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/design", "/orders")
                .access("hasRole('ROLE_USER')")
                .antMatchers("/",
                                                                                                              "/**"
        ).access("permitAll")
                //end::authorizeRequests[]

                .and().formLogin().loginPage("/login")
                //end::customLoginPage[]

                // tag::enableLogout[]
                .and().logout().logoutSuccessUrl("/")
                // end::enableLogout[]

                // Make H2-Console non-secured; for debug purposes
                // tag::csrfIgnore[]
                .and().csrf().ignoringAntMatchers("/h2-console/**")
                // end::csrfIgnore[]

                // Allow pages to be loaded in frames from the same origin; needed for H2-Console
                // tag::frameOptionsSameOrigin[]
                .and().headers().frameOptions().sameOrigin()
        // end::frameOptionsSameOrigin[]

        //tag::authorizeRequests[]
        //tag::customLoginPage[]
        ;
    }
    //end::configureHttpSecurity[]
    //end::authorizeRequests[]
    //end::customLoginPage[]

  /*
  //tag::customUserDetailsService[]
  @Override
  protected void configure(AuthenticationManagerBuilder auth)
      throws Exception {

    auth
      .userDetailsService(userDetailsService);
    
  }
  //end::customUserDetailsService[]
  
   */

    @Bean
    public PasswordEncoder encoder() {
        return new Pbkdf2PasswordEncoder("53cr3t");
        //使用Pbkdf2加密
    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.userDetailsService(userDetailsService).passwordEncoder(encoder());

    }

/*
内存验证示例
  @Override
  protected void configure(AuthenticationManagerBuilder auth)
      throws Exception {
    
    auth
      .inMemoryAuthentication()
        .withUser("buzz")               //添加用户名
          .password("infinity")         //添加密码
          .authorities("ROLE_USER")     //添加授权
        .and()
        .withUser("woody")
          .password("bullseye")
          .authorities("ROLE_USER");
    
  }
*/


/*
jdbc  基本配置示例

  //自动装配，从IoC容器中去查找到，并返回给该属性
  @Autowired
  DataSource dataSource;

  @Override
  protected void configure(AuthenticationManagerBuilder auth)
      throws Exception {
    
    auth
      .jdbcAuthentication()
        .dataSource(dataSource)          //设置DataSource
        .usersByUsernameQuery(           //自定义的查询语句，遵循以用户名为唯一参数
            "select username, password, enabled from Users " +
            "where username=?")
        .authoritiesByUsernameQuery(
            "select username, authority from UserAuthorities " +
            "where username=?")
        .passwordEncoder(new BCryptPasswordEncoder("53cr3t");
        //使用BCrypt强哈希加密，跨平台文件加密工具
  }
*/



/*
  LDAP （轻量级目录访问协议） 作为后端的用户存储
  功能上类似于jdbcAuthentication(),只不过是ldap版本

  @Override
  protected void configure(AuthenticationManagerBuilder auth)
      throws Exception {
    auth
      .ldapAuthentication()
        .userSearchBase("ou=people")    //声明为在people的组织单元下搜索，而不是在默认的根开始
        .userSearchFilter("(uid={0})")
        .groupSearchBase("ou=groups")
        .groupSearchFilter("member={0}");
        .passwordCompare()              //进行密码比对进行认证

        .passwordEncode(new BCryptPasswordEncoder())
        .passwordAttribute("passcode")  //比对passcode属性，默认是比对LDAP条目中的userPassword属性
        .contextSource()
        .url("ldap://tacocloud.com:389/dc=tacocloud,dc=com");
  }
*/

}
