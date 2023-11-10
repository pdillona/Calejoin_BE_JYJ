package kr.co.calejoin.entity;

import kr.co.calejoin.entity.idclass.BlockId;
import kr.co.calejoin.entity.idclass.UserShowtimeId;
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
@Table(name = "user_showtime")
@IdClass(UserShowtimeId.class)
public class UserShowtimeEntity {

       @Id
       @ManyToOne(fetch = FetchType.LAZY)
       @JoinColumn(name="stNo")
       private ShowtimeEntity stNo;

       @Id
       @ManyToOne(fetch = FetchType.LAZY)
       @JoinColumn(name="uid")
       private UserEntity uid;

       private int isMaster;

}
