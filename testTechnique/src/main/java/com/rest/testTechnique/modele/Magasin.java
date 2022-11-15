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
@Table(name="MAGASIN")
public class Magasin {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private long magasin_id;
    private String ville;
    @ManyToOne
    private Employee employe;
    
}
