package com.tarento.commenthub.dto;

import com.tarento.commenthub.entity.CommentTree;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CommentsResoponseDTO {

  private CommentTree commentTree;

  private int commentCount;
}
