package com.cengiz.baseproject.modules.genel.repository;

import com.cengiz.baseproject.modules.genel.data.entity.Parametre;
import com.cengiz.baseproject.modules.kys.repository.BaseJPARepository;


/**
 * @author Cengiz ÖZDEMİR
 * @created 09/03/2024 - 22:08
 */

public interface ParametreRepository extends BaseJPARepository<Parametre, Integer> {

  Parametre findByAdi(String adi);

  Parametre findByAdiAndAktifIsTrue(String adi);

  void deleteByIdAndAdi(Integer id, String adi);

  boolean existsById(Long id);

  boolean existsByAdi(String adi);

}
