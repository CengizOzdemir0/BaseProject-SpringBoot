package com.cengiz.baseproject.modules.kys.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import com.cengiz.baseproject.modules.kys.data.entity.KullaniciRol;
import com.cengiz.baseproject.modules.kys.repository.BaseJPARepository;

import java.util.List;
import java.util.Optional;

public interface KullaniciRolRepository extends BaseJPARepository<KullaniciRol, Long> {

  Optional<List<KullaniciRol>> findByKullanici_KullaniciAdi(Long kullaniciAdi);

  List<KullaniciRol> findAllByKullanici_Id(Long fkKullaniciId);

  List<KullaniciRol> findAllByIdIn(List<Long> rolIdList);

  @Query(value = """
      select r.* 
      from kys.kullanici_rol r inner join kys.kullanici k on k.id = r.fk_kullanici_id  
      where k.kullanici_adi= :kullaniciAdi 
        and r.l_rol= :lRol 
        and r.aktif is true   
   """, nativeQuery = true)
  Optional<KullaniciRol> findByKullanici_KullaniciAdiAndLrolAndAktifTrue(@NonNull Long kullaniciAdi, @NonNull Integer lRol);

  Optional<KullaniciRol> findByKullanici_KullaniciAdiAndLrol(@NonNull Long kullaniciAdi, @NonNull Integer lRol);

  Optional<List<KullaniciRol>> findByKullanici_KullaniciAdiAndAktifTrue(@NonNull Long kullaniciAdi);

  @Query(value = """
      select
        distinct kr.*
      from
        kys.kullanici_rol kr ,
        kys.kurum_bolum_yetkili kby
      where
        kr.id = kby.fk_kullanici_rol_id
        and
      kr.aktif
        and kr.l_rol = 5
        and kby.bitis_zamani < now()
        and not exists ( select 1 from kys.kurum_bolum_yetkili kby2 where kby2.fk_kullanici_rol_id =kr.id\s
        and (kby2.bitis_zamani is null or kby2.bitis_zamani>now()))
      """, nativeQuery = true)
  List<KullaniciRol> findAllByKurumBolumYetkisiAktifKullanici();

  @Query(value = """
      select
        distinct kr.*
      from
        kys.kullanici_rol kr ,
        kys.hekim_yetkili hy \s
      where
        kr.id = hy.fk_kullanici_rol_id
        and
      kr.aktif
        and kr.l_rol = 4
        and hy.bitis_zamani < now()
        and not exists ( select 1 from kys.hekim_yetkili hy2 where hy2.fk_kullanici_rol_id =kr.id\s
        and (hy2.bitis_zamani is null or hy2.bitis_zamani>now()))
           """, nativeQuery = true)
  List<KullaniciRol> findAllByHekimYetkisiAktifKullanici();

  Optional<KullaniciRol> findByKullaniciKullaniciAdiAndLrol(Long kullaniciAdi, Integer lRol);

  @Query(value = """
      select r.* 
      from kys.kullanici_rol r inner join kys.kullanici k on k.id = r.fk_kullanici_id  
      where k.kullanici_adi= :kullaniciTc 
        and r.l_rol in (:lRols) 
        and r.aktif is true   
   """, nativeQuery = true)
  KullaniciRol findByKullanici_KullaniciAdiAndLrolListAndAktifTrueEntiy(Long kullaniciTc, List<Integer> lRols);
}