package ru.igorivkin.karatedemo.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.igorivkin.karatedemo.model.BankProduct;

import java.util.Optional;

@RestController
public class BankProductApi {

    @GetMapping("/bankproducts/{id}")
    public ResponseEntity<BankProduct> getBankProductById(@PathVariable Integer id) {
        return Optional.ofNullable(id)
                .map(idNotNull -> {
                    if (idNotNull.equals(1)) {
                        BankProduct bankProduct =
                                BankProduct.builder()
                                        .id(1)
                                        .title("My product")
                                        .build();
                        return ResponseEntity.ok().body(bankProduct);
                    } else {
                        return ResponseEntity.status(HttpStatus.NOT_FOUND).<BankProduct>body(null);
                    }
                })
                .orElseThrow(() -> new IllegalArgumentException("Id should be set to return bank product"));
    }
}
