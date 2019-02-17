package atul.backend.accenture.service.impl;

import atul.backend.accenture.entity.CreditCardEntity;
import atul.backend.accenture.repository.CreditCardRepository;
import atul.backend.accenture.service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


@Service
public class CreditCardServiceImpl implements CreditCardService {


    private static final Logger log = Logger.getLogger("CreditCardServiceImpl");

    @Autowired
    private CreditCardRepository creditCardRepository;

    @Override
    public List<CreditCardEntity> getAllCustomersList() {
        List<CreditCardEntity> list = new ArrayList<>();
        creditCardRepository.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public Boolean deleteUser(Integer id) {
        log.info(String.valueOf(creditCardRepository.findById(id).isPresent()));
        CreditCardEntity creditCardEntity = creditCardRepository.findById(id).isPresent() ? creditCardRepository.findById(id).get() : null;
        if (null != creditCardEntity) {
            creditCardRepository.deleteById(id);
            return true;
        }

        return false;
    }

    @Override
    public CreditCardEntity getCustomerById(Integer id) {
        CreditCardEntity creditCardEntity = creditCardRepository.findById(id).isPresent() ? creditCardRepository.findById(id).get() : null;
        if (null != creditCardEntity)
            return creditCardEntity;
        return null;
    }

}
