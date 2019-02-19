package atul.backend.accenture.service.impl;

import atul.backend.accenture.entity.CreditCardEntity;
import atul.backend.accenture.model.CreditCardModel;
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
    public List<CreditCardModel> getAllCustomersList() {
        List<Object[]> landingPageResponse = creditCardRepository.getLandingPageResponse();
        List<CreditCardModel> creditCardModels = new ArrayList<>();
        for (Object[] obj : landingPageResponse) {
            CreditCardModel creditCardModel = new CreditCardModel();
            creditCardModel.setAge((Integer) obj[6]);
            creditCardModel.setBillAmt1((Double) obj[13]);
            creditCardModel.setBillAmt2((Double) obj[14]);
            creditCardModel.setBillAmt3((Double) obj[15]);
            creditCardModel.setBillAmt4((Double) obj[16]);
            creditCardModel.setBillAmt5((Double) obj[17]);
            creditCardModel.setBillAmt6((Double) obj[18]);
            creditCardModel.setCardNum((Integer) obj[0]);
            creditCardModel.setEduNm((String) obj[4]);
            creditCardModel.setPay0((String) obj[7]);
            creditCardModel.setPay2((String) obj[8]);
            creditCardModel.setPay3((String) obj[9]);
            creditCardModel.setPay4((String) obj[10]);
            creditCardModel.setPay5((String) obj[11]);
            creditCardModel.setPay6((String) obj[12]);
            creditCardModel.setPayAmt1((Double) obj[19]);
            creditCardModel.setPayAmt2((Double) obj[20]);
            creditCardModel.setPayAmt3((Double) obj[21]);
            creditCardModel.setPayAmt4((Double) obj[22]);
            creditCardModel.setPayAmt5((Double) obj[23]);
            creditCardModel.setPayAmt6((Double) obj[24]);
            creditCardModel.setPayNextMonth((String) obj[25]);
            creditCardModel.setName((String) obj[1]);
            creditCardModel.setLimBal((String) obj[2]);
            creditCardModel.setSexDesc((String) obj[3]);
            creditCardModel.setMarNm((String) obj[5]);
            creditCardModels.add(creditCardModel);
        }
        return creditCardModels;
    }

    @Override
    public Boolean deleteUser(Integer id) {
        log.info(String.valueOf(creditCardRepository.findById(id).isPresent()));
        CreditCardEntity creditCardEntity =
                creditCardRepository.findById(id).isPresent() ? creditCardRepository.findById(id).get() : null;
        if (null != creditCardEntity) {
            creditCardRepository.deleteById(id);
            return true;
        }

        return false;
    }

    @Override
    public CreditCardEntity getCustomerById(Integer id) {
        CreditCardEntity creditCardEntity =
                creditCardRepository.findById(id).isPresent() ? creditCardRepository.findById(id).get() : null;
        if (null != creditCardEntity)
            return creditCardEntity;
        return null;
    }

}
