package com.cengiz.baseproject.modules.kys.repository;

import com.cengiz.baseproject.modules.kys.data.entity.KullaniciParola;
import com.cengiz.baseproject.modules.kys.repository.BaseJPARepository;


public interface KullaniciParolaRepository extends BaseJPARepository<KullaniciParola, Long> {

    KullaniciParola findByKullaniciRol_Id(Long kullaniciId);

}