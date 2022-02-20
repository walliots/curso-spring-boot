package org.example.service;

import org.example.model.Cliente;
import org.example.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    @Autowired
    private ClientesRepository repository;
    //aqui acontece uma injeção de dependecia / instaciar uma classe e injetar via construtor ou outros metodos outras instancias


    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persitir(cliente);
    }

    private void validarCliente(Cliente cliente) {
    }


}
