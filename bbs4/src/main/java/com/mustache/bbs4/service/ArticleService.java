package com.mustache.bbs4.service;

import com.mustache.bbs4.domain.Article;
import com.mustache.bbs4.domain.dto.ArticleDto;
import com.mustache.bbs4.domain.dto.ArticleResponse;
import com.mustache.bbs4.repository.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service


public class ArticleService {
    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }
    public ArticleResponse getArticle(Long id){
        Optional<Article> optionalArticle = articleRepository.findById(id);
        if (optionalArticle.isPresent()) {
            Article article = optionalArticle.get();
            return Article.of(article);
        }
        return null;
    }
}
