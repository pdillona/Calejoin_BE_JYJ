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
public class MemoryAttendeeId implements Serializable {

    private long mmNo;
    private String uid;
}
