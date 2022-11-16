package com.mustache.bbs4.domain;

import com.mustache.bbs4.domain.dto.ArticleDto;
import com.mustache.bbs4.domain.dto.ArticleResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "article4")
@NoArgsConstructor
@Getter
@AllArgsConstructor
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;

    public Article(String title, String contents) {
        this.title = title;
        this.content = contents;
    }
    public static ArticleResponse of(Article article){
        return new ArticleResponse(article.getId(), article.getTitle(), article.getContent());
    }
}
