package kr.co.calejoin.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import jakarta.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ShowtimeDTO {

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

}
