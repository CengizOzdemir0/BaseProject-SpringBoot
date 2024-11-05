package com.cengiz.baseproject.modules.kys.service;


import com.cengiz.baseproject.modules.kys.data.dto.KullaniciParolaDto;
import com.cengiz.baseproject.modules.kys.data.entity.KullaniciParola;

public interface KullaniciParolaService {

    KullaniciParolaDto getById(Long id);

    void deleteById(Long id);

    KullaniciParola findByKullaniciRolId(Long kullaniciId);

}
