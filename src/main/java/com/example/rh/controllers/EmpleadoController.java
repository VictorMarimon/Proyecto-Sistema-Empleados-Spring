package com.example.rh.controllers;

import com.example.rh.entities.Empleado;
import com.example.rh.exception.RecursoNoEncontradoException;
import com.example.rh.services.EmpleadoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/app")
@CrossOrigin(value = "http://localhost:3000")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    private static final Logger logger = LoggerFactory.getLogger(EmpleadoController.class);

    @GetMapping("/empleados")
    public ResponseEntity<List<Empleado>> listarEmpleados(){
        return ResponseEntity.ok(empleadoService.listarEmpleados());
    }

    @PostMapping("/empleados")
    public ResponseEntity<Empleado> agregarEmpleado(@RequestBody Empleado empleado){
        return ResponseEntity.ok(empleadoService.guardarEmpleado(empleado));
    }

    @GetMapping("/empleados/{id}")
    public ResponseEntity<Empleado> obtenerEmpleadoPorId(@PathVariable Long id){
        Empleado empleado = empleadoService.buscarEmpleadoPorId(id);

        if (empleado == null){
            throw new RecursoNoEncontradoException("No se encontro el id: " + id);
        }else {
            return ResponseEntity.ok(empleado);
        }
    }

    @PutMapping("/empleados/{id}")
    public ResponseEntity<Empleado> modificarEmpleado(@PathVariable Long id, @RequestBody Empleado empleado){

        if (empleadoService.buscarEmpleadoPorId(id) == null){
            throw new RecursoNoEncontradoException("El id recibido no existe: " + id);
        }else {
            return ResponseEntity.ok(empleadoService.guardarEmpleado(empleado));
        }
    }

    @DeleteMapping("/empleados/{id}")
    public ResponseEntity<Map<String, Boolean>> eliminarEmpleado(@PathVariable Long id){
        Empleado empleado = empleadoService.buscarEmpleadoPorId(id);

        if (empleado == null){
            throw new RecursoNoEncontradoException("El id no existe: "+ id);
        }else {
            empleadoService.eliminarEmpleado(empleado);
            Map<String, Boolean> respuesta = new HashMap<>();
            respuesta.put("eliminado", true);
            return ResponseEntity.ok(respuesta);
        }
    }
}
