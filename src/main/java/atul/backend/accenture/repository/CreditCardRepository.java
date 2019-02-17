package atul.backend.accenture.repository;

import atul.backend.accenture.entity.CreditCardEntity;
import org.springframework.stereotype.Repository;


@Repository
public interface CreditCardRepository extends MyRepo<CreditCardEntity, Long> {

}
