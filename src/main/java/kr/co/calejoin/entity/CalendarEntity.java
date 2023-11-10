package kr.co.calejoin.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Fetch;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "calendar")
public class CalendarEntity {

       @Id
       private long calNo;

       @ManyToOne(fetch = FetchType.LAZY)
       @JoinColumn(name = "uid")
       private UserEntity user;

       @ManyToOne(fetch = FetchType.LAZY)
       @JoinColumn(name = "cateNo")
       private CategoryEntity cate;

       private String title;
       private long isRepeat;
       private LocalDateTime startTime;
       private LocalDateTime endTime;
       private String memo;
       private long isPublic;
       private long isNotification;
       private LocalDate notiDate;
       private long hasMemory;
       @CreationTimestamp
       private LocalDateTime regDate;

       //memory
       @OneToOne(mappedBy = "calendar")
       private MemoryEntity memory;

       //repeat
}
