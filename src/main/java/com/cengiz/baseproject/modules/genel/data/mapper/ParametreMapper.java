package com.cengiz.baseproject.modules.genel.data.mapper;

import org.mapstruct.Mapper;
import com.cengiz.baseproject.modules.data.mapper.MapperBase;
import com.cengiz.baseproject.modules.genel.data.dto.ParametreDto;
import com.cengiz.baseproject.modules.genel.data.entity.Parametre;

/**
 * @author Cengiz ÖZDEMİR
 * @created 09/03/2024 - 22:08
 */

@Mapper
public interface ParametreMapper extends MapperBase<Parametre,ParametreDto> {


}
