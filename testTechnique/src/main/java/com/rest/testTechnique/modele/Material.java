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
@Table(name="MATERIAL")

public class Material {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long material_id;
	
	private String name;
	private String descrip;
    private String image;
    private String taille;
    private int duree_location;
    private double cou_location;
    private double cout_remplacement;
    private long categorie_id;

    @ManyToOne
    private Categorie categorie;
}
