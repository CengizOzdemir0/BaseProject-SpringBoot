package com.cengiz.baseproject.modules.kys.service.impl;

import com.cengiz.baseproject.modules.kys.data.dto.KullaniciRolDto;
import com.cengiz.baseproject.modules.kys.data.entity.KullaniciRol;

import com.cengiz.baseproject.modules.kys.data.mapper.KullaniciRolMapper;
import com.cengiz.baseproject.modules.kys.repository.KullaniciRolRepository;
import com.cengiz.baseproject.modules.kys.service.KullaniciRolService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




@Service
@RequiredArgsConstructor
public class KullaniciRolServiceImpl implements KullaniciRolService {

  private final KullaniciRolRepository kullaniciRolRepository;
  private final KullaniciRolMapper kullaniciRolMapper;



  @Transactional
  @Override
  public KullaniciRolDto save(KullaniciRolDto kullaniciRolDto) {
    KullaniciRol kullaniciRol = kullaniciRolMapper.dtoToEntity(kullaniciRolDto);
    kullaniciRolRepository.save(kullaniciRol);
    return kullaniciRolMapper.entityToDto(kullaniciRol);
  }


}
