package pe.edu.cibertec.appcinecibertectarde.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.appcinecibertectarde.model.bd.Estado;

@Repository //toda slas funciones de base de datos
public interface EstadoRepository extends JpaRepository<Estado,Integer> { //acáva el objeto y se pone integer como primary key
}
