package com.rest.testTechnique.modele;
import javax.persistence.*;

//import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="CATEGORIE")
public class Categorie {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long categorie_id;
    private String nom;
    
}
