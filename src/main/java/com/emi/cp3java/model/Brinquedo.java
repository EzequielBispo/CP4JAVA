package com.emi.cp3java.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table(name = "TDS_TB_BRINQUEDOS")
public class Brinquedo {

    @Id
    int id_brinquedo;

    @NotBlank
    String nm_brinquedo;

    String tipo_brinquedo;

    String classe_brinquedo;

    @NotBlank
    String preco_brinquedo;

    double tamanho_brinquedo;
}