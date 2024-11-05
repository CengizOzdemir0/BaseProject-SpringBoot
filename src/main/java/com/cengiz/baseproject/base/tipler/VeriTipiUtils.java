package com.cengiz.baseproject.base.tipler;


import com.cengiz.baseproject.base.util.DateUtils;
import com.cengiz.baseproject.modules.genel.enums.lookup.VeriTipi;

/**
 * @author Cengiz ÖZDEMİR
 * @created 09/03/2024 - 22:08
 */

public class VeriTipiUtils {

  private VeriTipiUtils() {
    throw new IllegalStateException("VeriTipiUtils class");
  }

  public static Object getValue(VeriTipi veriTipi, String value) {
    return switch (veriTipi) {
      case INTEGER, SMALLINT -> Integer.valueOf(value);
      case BOOLEAN -> value.equals("true");
      case TIME -> DateUtils.getTimeStrToLocaleTime(value);
      default -> value;
    };
  }
}