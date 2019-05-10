package com.fafe.springbootswagger.dao.repository;

import com.fafe.springbootswagger.dao.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILanguageRepository extends JpaRepository<Language, Long> {
}