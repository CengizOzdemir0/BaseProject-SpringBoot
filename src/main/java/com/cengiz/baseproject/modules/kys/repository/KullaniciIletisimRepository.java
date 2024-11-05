/**
 * Author: Ayşe Ok Date: 18.03.2024
 */

package com.cengiz.baseproject.modules.kys.repository;

import com.cengiz.baseproject.modules.kys.data.entity.KullaniciIletisim;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface KullaniciIletisimRepository extends BaseJPARepository<KullaniciIletisim, Integer> {

  @Query("""
      from KullaniciIletisim ki where ki.kullanici.id = :kullaniciId
      """)
  Optional<KullaniciIletisim> findByKullanici_IdAndAktifTrue(Long kullaniciId);

}
