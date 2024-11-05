package com.cengiz.baseproject.modules.kys.service;

import com.cengiz.baseproject.base.dto.wrapper.BooleanWrapper;
import com.cengiz.baseproject.config.domain.RestResponse;
import com.cengiz.baseproject.modules.kys.data.dto.KysKullaniciDto;
import com.cengiz.baseproject.modules.kys.data.entity.Kullanici;
import org.springframework.http.ResponseEntity;


import java.util.UUID;

public interface KullaniciService {

  ResponseEntity<RestResponse<KysKullaniciDto>> get(Long id);

  ResponseEntity<RestResponse<KysKullaniciDto>> getAll();

  ResponseEntity<RestResponse<KysKullaniciDto>> ekle(KysKullaniciDto kullaniciDto);

  ResponseEntity<RestResponse<KysKullaniciDto>> update(KysKullaniciDto kullaniciDto);

  ResponseEntity<RestResponse<BooleanWrapper>> delete(Long id);

  KysKullaniciDto findByKullaniciAdiDto(Long kullaniciAdi);

  Kullanici findByKullaniciAdi(Long kullaniciAdi);

  Long findKullaniciAdiByUuid(UUID uuid);

  Long insertOrUpdateKullanici(Kullanici kullanici);
}
