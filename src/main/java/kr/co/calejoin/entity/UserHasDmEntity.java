package kr.co.calejoin.entity;

import kr.co.calejoin.entity.idclass.BlockId;
import kr.co.calejoin.entity.idclass.UserHasDmId;
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
@Table(name = "user_has_dm")
@IdClass(UserHasDmId.class)
public class UserHasDmEntity {

       @Id
       @ManyToOne(fetch = FetchType.LAZY)
       @JoinColumn(name="uid")
       private UserEntity uid;
       @Id
       @ManyToOne(fetch = FetchType.LAZY)
       @JoinColumn(name="dmId")
       private DmEntity dmId;


}
