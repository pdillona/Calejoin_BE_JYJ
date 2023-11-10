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
public class MemoryDTO {

       private long mmNo;
       private String uid;
       private long calNo;
       private long likeCnt;
       private long commentCnt;
       private String imgFile;
       private String content;
       private long isMain;
       private LocalDateTime regDate;

}
