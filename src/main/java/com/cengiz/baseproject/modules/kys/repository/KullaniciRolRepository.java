package com.cengiz.baseproject.modules.kys.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import com.cengiz.baseproject.modules.kys.data.entity.KullaniciRol;
import com.cengiz.baseproject.modules.kys.repository.BaseJPARepository;

import java.util.List;
import java.util.Optional;

public interface KullaniciRolRepository extends BaseJPARepository<KullaniciRol, Long> {


}