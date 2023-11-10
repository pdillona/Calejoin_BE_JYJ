package kr.co.calejoin.entity;

import kr.co.calejoin.entity.idclass.BlockId;
import kr.co.calejoin.entity.idclass.MemoryAttendeeId;
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
@Table(name = "memory_attendee")
@IdClass(MemoryAttendeeId.class)
public class MemoryAttendeeEntity {

       @Id
       @ManyToOne(fetch = FetchType.LAZY)
       @JoinColumn(name="mmNo")
       private MemoryEntity mmNo;

       @Id
       @ManyToOne(fetch = FetchType.LAZY)
       @JoinColumn(name="uid")
       private UserEntity uid;

}
