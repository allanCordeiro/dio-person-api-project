package one.digitalinnovation.peopleapi.controller;

import one.digitalinnovation.peopleapi.dto.MessageResponseDTO;
import one.digitalinnovation.peopleapi.dto.request.PersonDTO;
import one.digitalinnovation.peopleapi.entity.Person;
import one.digitalinnovation.peopleapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO) {
        return personService.createPerson(personDTO);

    }

    @GetMapping
    public List<PersonDTO> listAll() {
        return personService.listAll();
    }
}
