package kr.co.calejoin.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import jakarta.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "category")
public class CategoryEntity {

       @Id
       private long cateNo;
       @ManyToOne(fetch = FetchType.LAZY)
       @JoinColumn(name="uid")
       private UserEntity user;
       private String cateName;

       //calendar
       @Builder.Default
       @OneToMany(mappedBy = "cate")
       private List<CalendarEntity> calendars = new ArrayList<>();

}
