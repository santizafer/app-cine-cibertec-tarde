package pe.edu.cibertec.appcinecibertectarde.model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Data //igual a getter and setter
@Entity
@Table(name="estado")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //indentity: se autogenera
    private Integer idestado;
    @Column(name= "descestado")
    private String descestado;
}
