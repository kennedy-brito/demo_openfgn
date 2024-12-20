package com.kennedy.demo_openfgn.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class CpfResponse {

    private String cep;
    private String logradouro;
    private String complemento;
    private String unidade;
    private String bairro;
    private String localidade;
    private String uf;
    private String estado;
    private String regiao;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

    @Override
    public String toString() {
        return "CpfResponse{" +
                "cep='" + cep + '\'' +
                ", regiao='" + regiao + '\'' +
                ", uf='" + uf + '\'' +
                ", estado='" + estado + '\'' +
                ", localidade='" + localidade + '\'' +
                ", bairro='" + bairro + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CpfResponse that)) return false;
        return Objects.equals(getCep(), that.getCep());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCep());
    }
}
