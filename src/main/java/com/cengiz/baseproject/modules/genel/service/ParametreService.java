package com.cengiz.baseproject.modules.genel.service;


import com.cengiz.baseproject.base.dto.wrapper.BooleanWrapper;
import com.cengiz.baseproject.modules.genel.data.dto.ParametreDto;
import com.cengiz.baseproject.modules.genel.enums.Parametreler;

import java.util.List;


public interface ParametreService {


  ParametreDto save(ParametreDto dto);
  ParametreDto update(Integer id, ParametreDto dto);
  BooleanWrapper delete(Integer id, ParametreDto dto);
  Object getParametre(Parametreler parametreEnum);
  Object getParametre(Parametreler parametreEnum, Object varsayilan);
  List<ParametreDto> getAll();
  ParametreDto getById(Integer id);
}
