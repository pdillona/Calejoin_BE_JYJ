package kr.co.calejoin.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "memory")
public class MemoryEntity {

       @Id
       private long mmNo;
       @ManyToOne(fetch=FetchType.LAZY)
       @JoinColumn(name="uid")
       private UserEntity user;
       @OneToOne(fetch = FetchType.LAZY)
       @JoinColumn(name="calNo")
       private CalendarEntity calendar;
       private long likeCnt;
       private long commentCnt;
       private String imgFile;
       private String content;
       private long isMain;
       @CreationTimestamp
       private LocalDateTime regDate;


       //comment
       @Builder.Default
       @OneToMany(mappedBy = "memory")
       private List<CommentEntity> comments = new ArrayList<>();

       //memory_hashtag
       @Builder.Default
       @OneToMany(mappedBy = "mmNo")
       private List<MemoryHashtagEntity> memoryHashtags = new ArrayList<>();
       //memory_attendee
       @Builder.Default
       @OneToMany(mappedBy = "mmNo")
       private List<MemoryAttendeeEntity> memoryAttendees = new ArrayList<>();
       //like
       @Builder.Default
       @OneToMany(mappedBy="memory")
       private List<UserlikeEntity> likes = new ArrayList<>();
}
