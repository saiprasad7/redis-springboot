package com.poc.redis.redisspringboot.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import com.poc.redis.redisspringboot.dto.EmployeeInfo;

@Configuration
public class AppConfig {
	
	@Bean
	   public RedisConnectionFactory redisConnectionFactory() {
	       return new LettuceConnectionFactory();
	   }

	   @Bean
	   public RedisTemplate<String, EmployeeInfo> redisTemplate(){
	      RedisTemplate<String, EmployeeInfo> empTemplate = new RedisTemplate<>();
	      empTemplate.setConnectionFactory(redisConnectionFactory());
	      empTemplate.setKeySerializer(new StringRedisSerializer());
	      return empTemplate;
	   }	

}
