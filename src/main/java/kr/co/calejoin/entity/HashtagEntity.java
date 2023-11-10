package kr.co.calejoin.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import jakarta.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "hashtag")
public class HashtagEntity {

       @Id
       private long tagNo;
       private String hashtag;

       //memory_hashtag
       @Builder.Default
       @OneToMany(mappedBy = "tagNo")
       private List<MemoryHashtagEntity> hashtags = new ArrayList<>();

}
