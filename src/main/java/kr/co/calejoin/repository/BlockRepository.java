package kr.co.calejoin.repository;

import kr.co.calejoin.entity.BlockEntity;
import kr.co.calejoin.entity.idclass.BlockId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlockRepository extends JpaRepository<BlockEntity, BlockId> {

}
