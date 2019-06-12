package me.changchao.spring.cloud.sample.springcloudconfigserversample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServerSampleApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringCloudConfigServerSampleApplication.class, args);
  }

  @Bean
  Object beanUsingFooBar(@Value("${foo.bar}") String fooBar) {
    System.out.println("fooBar=" + fooBar);
    return new Object();
  }
}
