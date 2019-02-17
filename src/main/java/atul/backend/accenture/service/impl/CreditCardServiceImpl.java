package atul.backend.accenture.service.impl;

import atul.backend.accenture.entity.CreditCardEntity;
import atul.backend.accenture.repository.CreditCardRepository;
import atul.backend.accenture.service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CreditCardServiceImpl implements CreditCardService {

    @Autowired
    private CreditCardRepository creditCardRepository;

    @Override
    public List<CreditCardEntity> getAllCustomersList() {
        List<CreditCardEntity> list = new ArrayList<>();
        creditCardRepository.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

}
