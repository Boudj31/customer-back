package fr.dawan.demo.controller;

import fr.dawan.demo.dto.CustomerRegisterDto;
import fr.dawan.demo.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
public class CustomerController {

    private final CustomerService customerService;

    // get all
    @GetMapping("/all")
    public ResponseEntity<?> getAllCustomer() {
        return ResponseEntity.ok(customerService.getAllCustomer());
    }
    // register
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody CustomerRegisterDto dto) {
        try {
            return ResponseEntity.ok().body(customerService.registerCustomer(dto));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Registration failed");
        }
    }
}