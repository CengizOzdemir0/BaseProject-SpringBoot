

package com.cengiz.baseproject.modules.kys.data.mapper;

import com.cengiz.baseproject.modules.data.mapper.MapperBase;
import com.cengiz.baseproject.modules.kys.data.dto.KullaniciIletisimDto;
import com.cengiz.baseproject.modules.kys.data.entity.KullaniciIletisim;
import org.mapstruct.Mapper;


@Mapper
public interface KullaniciIletisimMapper extends MapperBase<KullaniciIletisim, KullaniciIletisimDto> {

}
