package kr.co.calejoin.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "comment")
public class CommentEntity {

       @Id
       private long cmtNo;
       @ManyToOne(fetch = FetchType.LAZY)
       @JoinColumn(name = "mmNo")
       private MemoryEntity memory;
       @ManyToOne(fetch = FetchType.LAZY)
       @JoinColumn(name = "uid")
       private UserEntity user;
       private String content;
       @CreationTimestamp
       private LocalDateTime regDate;

}
