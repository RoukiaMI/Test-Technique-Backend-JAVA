package com.rest.testTechnique.modele;
import java.util.List;

import javax.persistence.*;

//import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="EMPLOYEE")
public class Employee {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private long employe_id;

    private String nom;
    private String prenom;
    private String image;
    private String email;
    private String login;
    private String mdp;
    private boolean actif;
  
    @ManyToOne
    private Magasin magasin2;
}
