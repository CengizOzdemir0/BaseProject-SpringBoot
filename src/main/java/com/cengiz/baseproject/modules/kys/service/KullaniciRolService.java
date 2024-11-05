package com.cengiz.baseproject.modules.kys.service;

import org.springframework.lang.NonNull;
import com.cengiz.baseproject.modules.kys.data.dto.KullaniciRolDto;
import com.cengiz.baseproject.modules.kys.data.entity.Kullanici;
import com.cengiz.baseproject.modules.kys.data.entity.KullaniciRol;

import java.util.List;
import java.util.Optional;


public interface KullaniciRolService {



  KullaniciRolDto save(KullaniciRolDto kullaniciRolDto);


}
