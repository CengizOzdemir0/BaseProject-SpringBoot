package com.cengiz.baseproject.modules.kys.service;



import com.cengiz.baseproject.modules.kys.data.entity.Yetki;

import java.util.List;

public interface YetkiService {

    List<Yetki> getKullaniciIdByYetki(Long kullaniciId);

    List<Yetki> getAllByLRol(Integer lRol);

    List<Yetki> getKullaniciIdByKullaniciYetki(Long kullaniciId);

}
