package kr.co.calejoin.entity.idclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
public class UserShowtimeId  implements Serializable {
    private long stNo;
    private String uid;
}
