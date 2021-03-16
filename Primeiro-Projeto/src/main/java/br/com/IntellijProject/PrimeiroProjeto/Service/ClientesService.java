package br.com.IntellijProject.PrimeiroProjeto.Service;

import br.com.IntellijProject.PrimeiroProjeto.Repository.ClientesRepository;
import br.com.IntellijProject.PrimeiroProjeto.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    private ClientesRepository repository;

    @Autowired
    public ClientesService(ClientesRepository repository) {
        this.repository = repository;
    }
    public void salvarCliente(Cliente cliente) {
        validarCliente(cliente);
        ClientesRepository clientesRepository = new ClientesRepository();
        clientesRepository.persistir(cliente);
    }
    public void validarCliente(Cliente cliente) {
        //Validar cliente.
    }

}
