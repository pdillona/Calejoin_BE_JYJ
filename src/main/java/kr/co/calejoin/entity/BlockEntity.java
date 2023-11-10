package kr.co.calejoin.entity;

import kr.co.calejoin.entity.idclass.BlockId;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "block")
@IdClass(BlockId.class)
public class BlockEntity {

       @Id
       @ManyToOne(fetch = FetchType.LAZY)
       @JoinColumn(name="uid")
       private UserEntity uid;

       @Id
       @ManyToOne(fetch = FetchType.LAZY)
       @JoinColumn(name="blockId")
       private UserEntity blockId;

       @CreationTimestamp
       private LocalDateTime regDate;
}
