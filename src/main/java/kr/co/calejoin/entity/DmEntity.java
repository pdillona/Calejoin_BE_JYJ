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
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "dm")
public class DmEntity {

       @Id
       private long dmId;
       private String title;
       @CreationTimestamp
       private LocalDate regDate;

       @OneToMany(mappedBy = "dmId")
       @Builder.Default
       private List<UserHasDmEntity> userHasDms = new ArrayList<>();
       @OneToMany(mappedBy = "dmEntity")
       @Builder.Default
       private List<DmChatEntity> dmChats = new ArrayList<>();
}
