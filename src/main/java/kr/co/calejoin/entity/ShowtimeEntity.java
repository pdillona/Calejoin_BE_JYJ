package kr.co.calejoin.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import jakarta.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "showtime")
public class ShowtimeEntity {

       @Id
       private long stNo;
       private String title;
       private long days;
       private LocalDate rangeStartDate;
       private LocalDate rangeEndDate;
       private LocalTime rangeStartTime;
       private LocalTime rangeEndTime;
       private String content;
       private long joinComplete;
       private LocalDateTime startDate;
       private LocalDateTime endDate;
       @CreationTimestamp
       private LocalDateTime regDate;

       //user_showtime
       @Builder.Default
       @OneToMany(fetch=FetchType.LAZY)
       private List<UserShowtimeEntity> userShowtimes = new ArrayList<>();
}
