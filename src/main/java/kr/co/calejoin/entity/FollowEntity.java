package kr.co.calejoin.entity;

import kr.co.calejoin.entity.idclass.BlockId;
import kr.co.calejoin.entity.idclass.FollowId;
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
@Table(name = "follow")
@IdClass(FollowId.class)
public class FollowEntity {

       @Id
       private String uid;
       private String followingId;
       private java.sql.Timestamp regDate;

}
