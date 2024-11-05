package com.cengiz.baseproject.modules.kys.data.mapper;

import org.mapstruct.Mapper;
import com.cengiz.baseproject.modules.data.mapper.MapperBase;
import com.cengiz.baseproject.modules.kys.data.dto.KullaniciRolDto;
import com.cengiz.baseproject.modules.kys.data.entity.KullaniciRol;

@Mapper
public interface KullaniciRolMapper extends MapperBase<KullaniciRol, KullaniciRolDto> {

}
