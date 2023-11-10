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
public class MemoryHashtagID  implements Serializable {

    private long mmNo;
    private long tagNo;
}
