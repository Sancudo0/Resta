package controller;

import model.OperacionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.OperacionService;

@RestController
@RequestMapping("/middleware")
public class OperacionController {

    @Autowired
    private OperacionService service;

    /**
     * Endpoint para realizar la operación de resta.
     *
     * @param peticion Objeto que contiene los valores del minuendo y sustraendo.
     * @return Resultado de la resta o un mensaje de error si la petición es inválida.
     */
    @PostMapping("/operacion/resta")
    public ResponseEntity<Object> resta(@RequestBody(required = false) OperacionModel peticion) {
        // Validar que la petición no sea nula
        if (peticion == null) {
            return ResponseEntity.badRequest().body("El cuerpo de la petición es obligatorio.");
        }

        // Realizar la operación
        double resultado = service.restar(peticion.getMinuendo(), peticion.getSustraendo());

        // Construir la respuesta
        return ResponseEntity.ok().body("El resultado de la resta es: " + resultado);
    }
}

