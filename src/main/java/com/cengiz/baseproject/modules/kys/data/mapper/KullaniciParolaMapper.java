package com.cengiz.baseproject.modules.kys.data.mapper;

import org.mapstruct.Mapper;
import com.cengiz.baseproject.modules.kys.data.dto.KullaniciParolaDto;
import com.cengiz.baseproject.modules.kys.data.entity.KullaniciParola;
/**
 * @author Bahar KALKAN
 * @date 2024-03-15T11:56:12.780Z
 */
@Mapper
public abstract class KullaniciParolaMapper {

    public KullaniciParola getKullaniciRol(KullaniciParolaDto kullaniciParolaDto){
    return getKullaniciParola_(kullaniciParolaDto);
    }

    public KullaniciParolaDto getKullaniciRolDto(KullaniciParola kullaniciParola){
        return getKullaniciParolaDto_(kullaniciParola);
    }

    protected abstract KullaniciParola getKullaniciParola_(KullaniciParolaDto kullaniciParolaDto);

    protected abstract KullaniciParolaDto getKullaniciParolaDto_(KullaniciParola kullaniciParola);


}
