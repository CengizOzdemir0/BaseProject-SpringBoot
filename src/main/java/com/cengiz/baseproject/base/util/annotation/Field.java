package com.cengiz.baseproject.base.util.annotation;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Field {

  TC_KIMLIK_NO("0", "T.C. Kimli Numarası"),
  BASLANGIC_VE_BITIS("2", "Basşlangıç ve Bitiş Alanları"),
  BASLANGIC_ZAMANI("3", "Başlangıç Zamani");

  private final String kodu;
  private final String label;

}
