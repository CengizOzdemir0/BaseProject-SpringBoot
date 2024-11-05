package com.cengiz.baseproject.modules.genel.enums.lookup;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;


/**
 * @author Cengiz ÖZDEMİR
 * @created 21/03/2024 - 22:08
 */

@AllArgsConstructor
@RequiredArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@Getter
public enum Cinsiyet {

  ERKEK("E", "Erkek"),
  KADIN("K", "Kadın"),
  BELIRSIZ("B", "Belirsiz");

  private String val;
  private String valText;

  public static Cinsiyet of(String  valText) {
    return Arrays.stream(values()).filter(vt -> vt.valText.equals(valText)).findFirst().orElse(KADIN);
  }

}
