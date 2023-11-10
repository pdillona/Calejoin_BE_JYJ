package kr.co.calejoin.entity;

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
@Table(name = "profile_music")
public class ProfileMusicEntity {

       @Id
       private long pmNo;
       @ManyToOne(fetch = FetchType.LAZY)
       @JoinColumn(name="uid")
       private UserEntity user;
       private String musicLink;

}
