package com.cengiz.baseproject.base.dto.wrapper;

import com.cengiz.baseproject.base.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;



@AllArgsConstructor
@Getter
public final class StringWrapper extends BaseDto {

  private final String value;
}
