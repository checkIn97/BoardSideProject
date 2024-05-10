package com.fastcampus.boardsideproject.repository;

import com.fastcampus.boardsideproject.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}