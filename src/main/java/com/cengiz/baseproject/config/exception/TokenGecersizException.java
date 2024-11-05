package com.cengiz.baseproject.config.exception;

import com.cengiz.baseproject.base.tipler.Mesajlar;
import lombok.AllArgsConstructor;
import lombok.Getter;


import java.util.Map;

@Getter
@AllArgsConstructor
public class TokenGecersizException extends RuntimeException {

  private final Mesajlar mesajlarEnum;
  private final transient Map<String, Object> mesajArgsMap;

  public TokenGecersizException(Mesajlar mesajlarEnum) {
    this(mesajlarEnum, null);
  }
}
