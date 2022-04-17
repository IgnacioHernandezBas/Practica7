package com.PAT.Practica7.service.impl;

import java.util.List;

import com.PAT.Practica7.repository.RepoClientes;
import com.PAT.Practica7.service.ClientesService;
import com.PAT.Practica7.service.dto.ClientesDTO;
import com.PAT.Practica7.service.dto.ClientesConsumoDTO;

import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClientesServiceImp implements ClientesService {
	
    @Autowired
    private RepoClientes repoClientes;

		@Autowired
	private JdbcTemplate template;
    
    @Override
    public Iterable<ClientesDTO> getClientes() {
       return repoClientes.findAll();
		}

    @Override
    public ClientesDTO updateCliente(Long idCliente, ClientesDTO cliente) {
        if (repoClientes.existsById(idCliente)) {
            return repoClientes.save(cliente);
        } else {
            return null;
        }
    }

		    // Full-Join
				@Override
				public List<ClientesConsumoDTO> getClientesWithConsumo() {
		
						String query = """
										SELECT CLIENTES.ID_CLIENTE, CLIENTES.NOMBRE, CLIENTES.TEL, CLIENTES.PAIS
										FROM CLIENTES
										FULL OUTER JOIN CONSUMO 
										ON CLIENTES.ID_CLIENTE=CONSUMO.ID_CLIENTE;
										""";
									

						List<ClientesConsumoDTO> listaJoin = template.query(
										query,
										(rs, rowNum) -> new ClientesConsumoDTO(
														rs.getLong("ID_CLIENTE"),
														rs.getString("NOMBRE"),
														rs.getString("TEL"),
														rs.getString("PAIS"),
														rs.getLong("ID_CONSUMO"),
														rs.getString("ELECTRODOMESTICO"),
														rs.getInt("HORAS"),
														rs.getTime("HORA_CONSUMO")));
			
						return listaJoin;
				}
		
    @Override
    public void deleteCliente(Long idCliente) {
        repoClientes.deleteById(idCliente);

    }

		
		

	}