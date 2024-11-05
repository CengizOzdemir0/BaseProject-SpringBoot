package com.cengiz.baseproject.modules.kys.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.cengiz.baseproject.modules.kys.data.dto.KullaniciParolaDto;
import com.cengiz.baseproject.modules.kys.data.entity.KullaniciParola;
import com.cengiz.baseproject.modules.kys.data.mapper.KullaniciParolaMapper;
import com.cengiz.baseproject.modules.kys.repository.KullaniciParolaRepository;
import com.cengiz.baseproject.modules.kys.service.KullaniciParolaService;

/**
 * @author Bahar KALKAN
 * @date 2024-03-15T09:55:12.780Z
 */

@Service
@RequiredArgsConstructor
public class KullaniciParolaServiceImpl implements KullaniciParolaService {

    private final KullaniciParolaRepository kullaniciParolaRepository;
    private final KullaniciParolaMapper kullaniciParolaMapper;

    @Override
    public KullaniciParolaDto getById(Long id) {
        return kullaniciParolaRepository.findById(id).map(kullaniciParola -> kullaniciParolaMapper.getKullaniciRolDto(kullaniciParola)).orElse(new KullaniciParolaDto());
    }

    @Override
    public void deleteById(Long id) {
        kullaniciParolaRepository.deleteById(id);
    }


    @Override
    public KullaniciParola findByKullaniciRolId(Long kullaniciId) {
        return kullaniciParolaRepository.findByKullaniciRol_Id(kullaniciId);
    }
}
