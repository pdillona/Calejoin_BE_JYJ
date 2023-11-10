package kr.co.calejoin.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import jakarta.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "userlike")
public class UserlikeEntity {

       @Id
       private long likeId;
       @ManyToOne(fetch = FetchType.LAZY)
       @JoinColumn(name="mmNo")
       private MemoryEntity memory;

       @ManyToOne(fetch = FetchType.LAZY)
       @JoinColumn(name="uid")
       private UserEntity user;

}
