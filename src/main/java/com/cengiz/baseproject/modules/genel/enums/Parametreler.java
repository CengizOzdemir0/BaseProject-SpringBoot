package com.cengiz.baseproject.modules.genel.enums;


import java.util.Arrays;

/**
 * @author Cengiz ÖZDEMİR
 * @created 09/03/2024 - 22:08
 */

public enum Parametreler {
  GORUSME_SONUC_DEGERLENDIRME_ZORUNLULUK_DURUMU;


  public static Parametreler of(String parameter) {
    return Arrays.stream(values()).filter(p -> p.name().equals(parameter)).findFirst().orElse(null);
  }
}
