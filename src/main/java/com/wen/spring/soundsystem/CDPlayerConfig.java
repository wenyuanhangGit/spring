package com.wen.spring.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 当使用@ComponentScan注解时:只需要在SgtPeppers和CDPlayer类上加@Component注解即可
 * 当使用@Configuration注解时:只需要在类中返回两个Bean即可
 */
@Configuration
//@ComponentScan
public class CDPlayerConfig {

    @Bean
    public CompactDisc sgtPepper() {
        return new SgtPeppers();
    }

    @Bean
    public MediaPlayer cdPlayer() {
        return new CDPlayer(sgtPepper());
    }

}
