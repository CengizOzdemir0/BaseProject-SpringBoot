package com.cengiz.baseproject.base.tipler;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Mesajlar {
  GNL_KAYIT_BULUNAMADI(HttpStatus.NO_CONTENT, "GNL1005", MesajSeviye.INFO),
  TKN_KULLANICI_BULUNAMADI(HttpStatus.INTERNAL_SERVER_ERROR, "TKN1001", MesajSeviye.ERROR),
  GNL_ISLEM_BASARILI(HttpStatus.OK, "GNL1009", MesajSeviye.INFO),
  LGN_ERISIM_ENGELLENDI(HttpStatus.FORBIDDEN, "LGN1006", MesajSeviye.ERROR),
  LGN_CIKIS_BASARISIZ(HttpStatus.BAD_REQUEST, "LGN1008", MesajSeviye.ERROR),
  LGN_CIKIS_BASARILI(HttpStatus.OK, "LGN1005", MesajSeviye.INFO),
  GNL_BEKLENMEYEN_HATA_OLUSTU(HttpStatus.INTERNAL_SERVER_ERROR, "GNL1000", MesajSeviye.ERROR),
  LGN_CACHE_OKUMA_YAZMA_HATASI(HttpStatus.INTERNAL_SERVER_ERROR, "LGN1007",
      MesajSeviye.ERROR),
  LGN_KULLANICI_ADI_PAROLA_HATALI(HttpStatus.BAD_REQUEST, "LGN1003", MesajSeviye.ERROR),
  LGN_KULLANICI_BULUNAMADI(HttpStatus.BAD_REQUEST, "LGN1002", MesajSeviye.ERROR),
  LGN_GIRIS_BILGILERI_EKSIK(HttpStatus.BAD_REQUEST, "LGN1001", MesajSeviye.ERROR),
  LGN_BASKA_YERDEN_GIRIS_YAPILMIS(HttpStatus.UNAUTHORIZED, "LGN2001",
      MesajSeviye.ERROR),
  LGN_OTURUM_SONLANMIS_TEKRAR_GIRIS_YAPINIZ(HttpStatus.UNAUTHORIZED, "LGN1004",
      MesajSeviye.ERROR),
  LGN_TOKEN_GECERSIZ(HttpStatus.UNAUTHORIZED, "LGN2000", MesajSeviye.ERROR),
  DOSYA_BASARISIZ(HttpStatus.BAD_REQUEST, "LGN1019", MesajSeviye.ERROR),
  MODERATOR_YETKI_DOSYA(HttpStatus.BAD_REQUEST, "YTK1020", MesajSeviye.ERROR),
  KRM_HEKIM_KAYITLI_DEGIL(HttpStatus.BAD_REQUEST, "KRM1032",
      MesajSeviye.ERROR),
  KATILIMCI_BULUNMADI(HttpStatus.BAD_REQUEST, "KTLMCI01",
      MesajSeviye.ERROR),
  GNL_TC_KIMLIK_NO_GECERSIZ(HttpStatus.PRECONDITION_REQUERED, "VT2006", MesajSeviye.ERROR),
  GNL_RULE_HATALI_CALISTI(HttpStatus.BAD_REQUEST, "GNL1019", MesajSeviye.ERROR),
  VLD_CEP_TELEFON_FORMAT(HttpStatus.BAD_REQUEST, "VLD1019", MesajSeviye.ERROR),
  YETKI_INSERT_BASARISIZ(HttpStatus.FORBIDDEN, "YTK1000", MesajSeviye.ERROR),
  YETKI_INSERT_YETKILI_MEVCUT(HttpStatus.FORBIDDEN, "YTK1001", MesajSeviye.ERROR),
  BELGE_SILME_YETKI_KONTROLU(HttpStatus.BAD_REQUEST, "BLG1001", MesajSeviye.ERROR),
  VTN_HRN_TC_ESLESMESI_HATALI(HttpStatus.BAD_REQUEST, "VT10017", MesajSeviye.ERROR),
  GORUSME_NOTU_BULUNAMADI(HttpStatus.BAD_REQUEST, "GNOT1000", MesajSeviye.ERROR),
  GNL_HASTA_TC_KIMLIK_NO_GECERSIZ(HttpStatus.BAD_REQUEST, "VT2006", MesajSeviye.ERROR),
  GNL_AYNI_KAYIT_MEVCUT(HttpStatus.BAD_REQUEST, "VLD1000", MesajSeviye.ERROR),
  VTN_KAYIT_BULUNAMADI(HttpStatus.BAD_REQUEST, "GNL1025", MesajSeviye.ERROR),
  GNL_GECERSIZ_ISTEK(HttpStatus.BAD_REQUEST, "GNL1026", MesajSeviye.ERROR),
  KLN_PAROLA_BOS_OLAMAZ(HttpStatus.BAD_REQUEST, "KLN1001", MesajSeviye.ERROR),
  KLN_KULLANICI_ADI_BOS_OLAMAZ(HttpStatus.BAD_REQUEST, "KLN1002", MesajSeviye.ERROR),
  KLN_KULLANICI_ROL_YOK(HttpStatus.BAD_REQUEST, "KLN1003", MesajSeviye.ERROR),
  KLN_KULLANICI_PAROLA_YOK(HttpStatus.BAD_REQUEST, "KLN1004", MesajSeviye.ERROR),
  KLN_KULLANICI_YETKI_YOK(HttpStatus.BAD_REQUEST, "KLN1005", MesajSeviye.ERROR),
  LGN_GIRIS_ROLU_BULUNMAMAKTADIR(HttpStatus.BAD_REQUEST, "LGN1009", MesajSeviye.ERROR),
  VLD_NOT_NULL(HttpStatus.BAD_REQUEST, "VLD1005", MesajSeviye.ERROR),
  BOLUM_YETKILISI_EKLEME_ISLEMI_BASARILI(HttpStatus.OK, "GNL1001", MesajSeviye.INFO),
  BOLUM_YETKILISI_KAYIT_VAR_UPDATE_YAPILMALI(HttpStatus.OK, "VLD1001", MesajSeviye.INFO),
  YETKISI_YOKTUR(HttpStatus.BAD_REQUEST, "GNL1010", MesajSeviye.ERROR),
  VLD_HEKIM_YETKILI_BASLANGIC_ZAMANI_GECERSIZ(HttpStatus.BAD_REQUEST, "VLD1002", MesajSeviye.ERROR),
  VLD_HEKIM_YETKILI_BITIS_ZAMANI_GECERSIZ(HttpStatus.BAD_REQUEST, "VLD1003", MesajSeviye.ERROR),
  VT_MERNIS_ISLEMI_GERCEKLESTIRILEMEDI(HttpStatus.BAD_REQUEST, "VT1018", MesajSeviye.ERROR),
  VLD_GECERSIZ_PAYLOAD(HttpStatus.BAD_REQUEST, "VLD1004", MesajSeviye.ERROR),
  VLD_GECERSIZ_KEY(HttpStatus.BAD_REQUEST, "VLD1006", MesajSeviye.ERROR),
  YETKI_UPDATE_DEGISIKLIK_BULUNMAMAKTADIR(HttpStatus.BAD_REQUEST, "YTK1002", MesajSeviye.ERROR),
  OGN_LOGIN_CODE_VERIFIER_EXPIRE(HttpStatus.BAD_REQUEST, "YTK1003", MesajSeviye.ERROR);

  private final HttpStatus httpStatus;
  private final String kodu;
  private final MesajSeviye seviye;

  public static Mesajlar of(String kodu) {
    for (Mesajlar inam : values()) {
      if (inam.kodu.equals(kodu) || inam.name().equals(kodu)) {
        return inam;
      }
    }
    return GNL_BEKLENMEYEN_HATA_OLUSTU;
  }

}