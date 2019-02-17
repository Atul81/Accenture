package atul.backend.accenture.controller;

import atul.backend.accenture.entity.CreditCardEntity;
import atul.backend.accenture.model.HeaderModel;
import atul.backend.accenture.model.Response;
import atul.backend.accenture.service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping(value = "/finflux")
public class CreditCardController {

    private static final Logger log = Logger.getLogger("FnfluxController");
    @Autowired
    private CreditCardService creditCardService;

    @GetMapping("/listAllCustomer")
    public ResponseEntity<Response<List<CreditCardEntity>>> getLandingPage() {
        List<CreditCardEntity> cardServiceAllCustomersList = creditCardService.getAllCustomersList();
        log.info("Inside listAllCustomer api");
        Response<List<CreditCardEntity>> response = new Response<>();
        response.setHeaderModel(staticFixing());
        response.setResponse(cardServiceAllCustomersList);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    public HeaderModel staticFixing() {
        HeaderModel headerModel = new HeaderModel();
        headerModel.setAppName("finFlux BackEnd Integeration");
        headerModel.setResponseDateTime(new Date().toString());
        headerModel.setUserId("Atul");
        headerModel.setLanguage("English");
        headerModel.setUserAction("fetchingDate");
        headerModel.setStatus("Data Fetching");
        return headerModel;
    }

}
