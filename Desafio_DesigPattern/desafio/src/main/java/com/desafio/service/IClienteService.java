package com.desafio.service;

import com.desafio.model.Cliente;


import java.util.List;

public interface IClienteService {
    List<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);
}
