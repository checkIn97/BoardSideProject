package com.fastcampus.boardsideproject.repository;

import com.fastcampus.boardsideproject.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {

}
