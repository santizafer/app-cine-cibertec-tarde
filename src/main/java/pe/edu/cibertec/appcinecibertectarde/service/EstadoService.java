package pe.edu.cibertec.appcinecibertectarde.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.appcinecibertectarde.model.bd.Estado;
import pe.edu.cibertec.appcinecibertectarde.repository.EstadoRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class EstadoService {
    private EstadoRepository estadoRepository;

    public List<Estado> listarEstados(){
        return estadoRepository.findAll();
    }

    public boolean registrarEstado(Estado estado){
        return estadoRepository.save(estado) != null; //save hace insert or upodate segun el caso
    }

    public void eliminarEstado(Integer idestado){
        estadoRepository.deleteById(idestado);
    }

}
