package kr.co.calejoin.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import jakarta.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "memory_hashtag")
public class MemoryHashtagEntity {

       @Id
       @ManyToOne(fetch = FetchType.LAZY)
       @JoinColumn(name="mmNo")
       private MemoryEntity mmNo;

       @Id
       @ManyToOne(fetch = FetchType.LAZY)
       @JoinColumn(name="tagNo")
       private HashtagEntity tagNo;

}
