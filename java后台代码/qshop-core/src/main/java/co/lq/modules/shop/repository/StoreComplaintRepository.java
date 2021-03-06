package co.lq.modules.shop.repository;

import co.lq.modules.shop.domain.StoreComplaint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* @author billy
* @date 2020-03-11
*/
public interface StoreComplaintRepository extends JpaRepository<StoreComplaint, Long>, JpaSpecificationExecutor<StoreComplaint> {
}