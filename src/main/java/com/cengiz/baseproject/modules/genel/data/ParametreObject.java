package com.cengiz.baseproject.modules.genel.data;

import com.cengiz.baseproject.base.dto.BaseDto;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder
public class ParametreObject extends BaseDto {
  Object value;
}
