package com.kennedy.demo_openfgn.clients;


import com.kennedy.demo_openfgn.entities.CpfResponse;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "viaCpf", url = "https://viacep.com.br/ws")
public interface ViaCepClient {

//    public CpfResponse get
}
