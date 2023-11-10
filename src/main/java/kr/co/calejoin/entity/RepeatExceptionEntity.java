package kr.co.calejoin.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import jakarta.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "repeat_exception")
public class RepeatExceptionEntity {

       @Id
       private int exceptNo;

       @ManyToOne(fetch = FetchType.LAZY)
       @JoinColumn(name="calNo")
       private RepeatEntity repeat;

       private LocalDate exceptionDate;

}
