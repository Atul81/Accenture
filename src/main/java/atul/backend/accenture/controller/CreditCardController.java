package atul.backend.accenture.controller;

import atul.backend.accenture.config.AccUtils;
import atul.backend.accenture.entity.CreditCardEntity;
import atul.backend.accenture.model.AccentureException;
import atul.backend.accenture.model.HeaderModel;
import atul.backend.accenture.model.Response;
import atul.backend.accenture.service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping(value = "/accenture")
public class CreditCardController {

    private static final Logger log = Logger.getLogger("CreditCardController");
    @Autowired
    private CreditCardService creditCardService;


    @GetMapping("/listAllCustomer")
    public ResponseEntity<Response<List<CreditCardEntity>>> getLandingPage() {
        AccUtils accUtils = new AccUtils();
        List<CreditCardEntity> cardServiceAllCustomersList = creditCardService.getAllCustomersList();
        log.info("Inside listAllCustomer api");
        Response<List<CreditCardEntity>> response = new Response<>();
        response.setHeaderModel(accUtils.staticFixing());
        response.setResponse(cardServiceAllCustomersList);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @DeleteMapping("deleteUser/{id}")
    public ResponseEntity<Response<Boolean>> deleteUser(@PathVariable Integer id) throws Exception {
        log.info("Inside deleting the user");
        AccUtils accUtils = new AccUtils();
        Boolean deleteResponse = creditCardService.deleteUser(id);
        Response<Boolean> response = new Response<>();
        if(deleteResponse) {
            response.setHeaderModel(accUtils.staticFixing());
            response.setResponse(true);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            response.setResponse(false);
            throw new AccentureException("Cannot find details for given " + id + " ID", accUtils.errorDetails());
        }
    }

    @PostMapping("findCustomer/{custId}")
    public ResponseEntity<Response<CreditCardEntity>> getCustByID(@PathVariable Integer custId) throws Exception {
        log.info("Inside getByID Customers");
        AccUtils accUtils = new AccUtils();
        CreditCardEntity creditCardEntity = creditCardService.getCustomerById(custId);
        if(null != creditCardEntity){
            Response<CreditCardEntity> response = new Response<>();
            response.setHeaderModel(accUtils.staticFixing());
            response.setResponse(creditCardEntity);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            log.info(accUtils.errorDetails().toString());
            throw new AccentureException("Cannot find details for given " + custId + " ID", accUtils.errorDetails());
        }
    }

}
