package com.tarento.commenthub.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.JsonNode;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import com.vladmihalcea.hibernate.type.json.JsonType;
import java.sql.Timestamp;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.UpdateTimestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "comment_tree")
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommentTree {

  @Id
  private String commentTreeId;

  @Type(JsonType.class)
  @Column(columnDefinition = "jsonb")
  private JsonNode commentTreeData;

  @Column(columnDefinition = "varchar(255) default 'active'")
  private String status;

  private Timestamp createdDate;

  private Timestamp lastUpdatedDate;
}