package com.cengiz.baseproject.base.tipler;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor
@Getter
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum MesajSeviye {
  INFO(1, "info"),
  WARN(2, "warn"),
  ERROR(3, "error");

  private final int val;
  private final String valText;

  public static MesajSeviye of(int mesajSeviye) {
    return Arrays.stream(values()).filter(vt -> vt.val == mesajSeviye).findFirst().orElse(null);
  }
}
