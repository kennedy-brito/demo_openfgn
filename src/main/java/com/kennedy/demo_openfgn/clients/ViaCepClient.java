package com.kennedy.demo_openfgn.clients;


import com.kennedy.demo_openfgn.entities.CpfResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "viaCpf", url = "https://viacep.com.br/ws")
public interface ViaCepClient {

    @GetMapping("/{cep}/json")
    CpfResponse searchLocationByCep(@PathVariable String cep);

    @GetMapping("/{uf}/{cidade}/{logradouro}/json")
    List<CpfResponse> searchCepByAddress(@PathVariable String uf, @PathVariable String cidade, @PathVariable String logradouro);
}
