package kr.co.calejoin.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "dm_chat")
public class DmChatEntity {

       @Id
       private long chatId;
       @ManyToOne(fetch = FetchType.LAZY)
       @JoinColumn(name="uid")
       private UserEntity user;
       @ManyToOne(fetch = FetchType.LAZY)
       @JoinColumn(name="dmId")
       private DmEntity dmEntity;
       private String content;
       @CreationTimestamp
       private LocalDateTime regDate;

}
