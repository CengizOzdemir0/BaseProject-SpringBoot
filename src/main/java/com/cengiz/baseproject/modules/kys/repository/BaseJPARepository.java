package com.cengiz.baseproject.modules.kys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseJPARepository<T, I> extends JpaRepository<T, I> {

}
