package com.example.rh.services;

import com.example.rh.entities.Empleado;
import com.example.rh.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmpleadoService {
    @Autowired
    private EmpleadoRepository empleadoRepository;

    public List<Empleado> listarEmpleados(){
        return empleadoRepository.findAll();
    }

    public Empleado buscarEmpleadoPorId(Long idEmpleado){
        return empleadoRepository.findById(idEmpleado).orElse(null);
    }

    public Empleado guardarEmpleado(Empleado empleado){
        return empleadoRepository.save(empleado);
    }

    public void eliminarEmpleado(Empleado empleado){
        empleadoRepository.delete(empleado);
    }
}
