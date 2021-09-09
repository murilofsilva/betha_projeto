package com.betha.projeto_tecnico3;

import com.betha.projeto_tecnico3.model.Employee;
import com.betha.projeto_tecnico3.model.Telefone;
import com.betha.projeto_tecnico3.service.EmployeeService;
import com.betha.projeto_tecnico3.service.TelefoneService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/telefone")
public class TelefoneResource {
    private final TelefoneService telefoneService;

    public TelefoneResource(TelefoneService telefoneService) {
        this.telefoneService = telefoneService;
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Telefone> getEmployeeById (@PathVariable("id") Long id)
    {
        Telefone telefone = telefoneService.findTelefoneById((id));
        return new ResponseEntity<>(telefone, HttpStatus.OK);
    }

    @PostMapping("/registro")
    public ResponseEntity<Telefone> addTelefone(@RequestBody Telefone telefone)
    {
        Telefone newTelefone = telefoneService.addTelefone(telefone);
        return new ResponseEntity<>(newTelefone, HttpStatus.CREATED);
    }

}
