package com.services.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.services.model.Country;

@Configuration
public class RedisConfig {

	@Bean
	public JedisConnectionFactory jedisConnection() {
		
		return new JedisConnectionFactory();
	}
	
	@Bean
	public RedisTemplate<String, Country> redisTemplate(){
		RedisTemplate<String, Country> redistempate = new RedisTemplate<>();
		redistempate.setConnectionFactory(jedisConnection());
		return redistempate;
	}
}
