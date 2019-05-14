package com.gpch.login.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "material")
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "material_id")
    private int id;
    @Column(name = "nume")
    private String nume;
    @Column(name = "descriere")
    private String descriere;
    @Column(name = "linkUrl")
    private String linkUrl;
}

