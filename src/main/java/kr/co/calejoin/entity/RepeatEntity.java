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
@Table(name = "repeat")
public class RepeatEntity {

       @Id
       @OneToOne(fetch = FetchType.LAZY)
       @JoinColumn(name="calNo")
       private CalendarEntity calendar;
       private String repeatCycle;
       private String repeatWeek;
       private long repeatMonth;
       @CreationTimestamp
       private LocalDateTime repeatEnd;

}
