package com.cengiz.baseproject.config.domain;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.context.ApplicationContext;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BeanUtil {

  private static ApplicationContext applicationContext;

  public static void setApplicationContext(ApplicationContext applicationContext) {
    BeanUtil.applicationContext = applicationContext;
  }

  public static <T> T getBean(Class<T> beanClass) {
    return applicationContext.getBean(beanClass);
  }
}