package com.cengiz.baseproject.modules.genel.service;



import com.cengiz.baseproject.base.dto.wrapper.BooleanWrapper;
import com.cengiz.baseproject.base.tipler.Mesajlar;
import com.cengiz.baseproject.modules.genel.data.dto.MesajDto;

import java.util.List;


public interface MesajService {


  MesajDto save(MesajDto dto);
  MesajDto update(Long id, MesajDto dto);
  BooleanWrapper delete(Long id, MesajDto dto);
  MesajDto getMesajByMesajEnum(Mesajlar mesajlarEnum);
  List<MesajDto> getAll();
  MesajDto getById(Long id);
}
