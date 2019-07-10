package com.example.hotelmanagement.config.MvcConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig  implements WebMvcConfigurer {
 /*   public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor1())
                .addPathPatterns("/**")//拦截的路径
                .excludePathPatterns("/","/login.html","/user/login");//排除的路径
    }*/
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");//路径映射
        registry.addViewController("/login.html").setViewName("login");
        registry.addViewController("/sign_up.html").setViewName("sign_up");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/user.html").setViewName("user");
        registry.addViewController("/admin.html").setViewName("admin");
        registry.addViewController("/new_booking.html").setViewName("new_booking");
        registry.addViewController("/userViewBooking.html").setViewName("userViewBooking");
        registry.addViewController("/userAllVehicles.html").setViewName("userAllVehicles");
        registry.addViewController("/userNewBooking.html").setViewName("userNewBooking");
        registry.addViewController("/changePassword.html").setViewName("changePassword");

    }
}
