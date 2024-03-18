package com.example.spannerjson.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Types;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
@Table(name = "Users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

  @Id
  @JdbcTypeCode(Types.CHAR)
  private UUID id;

  @Column(columnDefinition = "json")
  @JdbcTypeCode(SqlTypes.JSON)
  private UserParameter parameter;

}
