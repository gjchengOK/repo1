package com.guo.Config;

import com.guo.bean.Pet;
import com.guo.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public User user01(){
        return new User("guo",4);
    }
    @Bean
    public Pet tomcatPet(){

        return new Pet("tom");
    }

}
