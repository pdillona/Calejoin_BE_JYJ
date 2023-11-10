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
public class UserDTO {

       private String uid;
       private String name;
       private String email;
       private String nick;
       private String accessToken;
       private String type;
       private long badCnt;
       private long isLock;
       private LocalDateTime lockDate;
       private String profileImg;
       private String introduce;
       private long myThema;
       private long following;
       private long follower;
       private String etc;
       private LocalDateTime regDate;
       private LocalDateTime leaveDate;

}
