package com.betha.projeto_tecnico3;

import com.betha.projeto_tecnico3.model.Employee;
import com.betha.projeto_tecnico3.model.Endereco;
import com.betha.projeto_tecnico3.service.EmployeeService;
import com.betha.projeto_tecnico3.service.EnderecoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/endereco")
public class EnderecoResource {
    private final EnderecoService enderecoService;

    public EnderecoResource(EnderecoService enderecoService) {
        this.enderecoService = enderecoService;
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Endereco> getEmployeeById (@PathVariable("id") Long id)
    {
        Endereco endereco = enderecoService.findEnderecoById((id));
        return new ResponseEntity<>(endereco, HttpStatus.OK);
    }

    @PostMapping("/registro")
    public ResponseEntity<Endereco> addEmployee(@RequestBody Endereco endereco)
    {
        Endereco newEndereco = enderecoService.addEndereco(endereco);
        return new ResponseEntity<>(newEndereco, HttpStatus.CREATED);
    }

}
