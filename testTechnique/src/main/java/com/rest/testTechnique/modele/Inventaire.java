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
@Table(name="INVENTAIRE")
public class Inventaire {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private long inventaire_id;
    @ManyToOne
    private Magasin magasin;
    @ManyToOne
    private Material material;
    
}
