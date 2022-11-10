package com.mustache.bbs4.repository;

import com.mustache.bbs4.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
