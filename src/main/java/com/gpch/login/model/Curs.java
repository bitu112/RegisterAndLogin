
package com.gpch.login.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "curs")
public class Curs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "curs_id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name ="listaMateriale")
    ArrayList<Material> listaMateriale =  new ArrayList<>();
}

