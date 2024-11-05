package com.cengiz.baseproject.base.dto.wrapper;

import com.cengiz.baseproject.base.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public final class BooleanWrapper extends BaseDto {

  private final Boolean value;
}
