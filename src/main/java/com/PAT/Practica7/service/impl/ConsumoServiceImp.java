package com.PAT.Practica7.service.impl;

import java.util.List;

import com.PAT.Practica7.repository.RepoConsumo;
import com.PAT.Practica7.service.ConsumoService;
import com.PAT.Practica7.service.dto.ConsumoDTO;
import com.PAT.Practica7.service.dto.ConsumoPreciosDTO;

import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ConsumoServiceImp implements ConsumoService {
	
    @Autowired
    private RepoConsumo repoConsumo;

		@Autowired
	private JdbcTemplate template;
    
    @Override
    public Iterable<ConsumoDTO> getClientes() {
       return repoConsumo.findAll();
		}

    @Override
    public ConsumoDTO updateConsumo(Long idConsumo, ConsumoDTO consumo) {
        if (repoConsumo.existsById(idConsumo)) {
            return repoConsumo.save(consumo);
        } else {
            return null;
        }
    }

		    // Full-Join
				@Override
				public List<ConsumoPreciosDTO> getConsumoWithPrecios() {
		
						String query = """
										SELECT PRECIOS.HORAS_CONSUMO, PRECIOS.PRECIO_LUZ_HORA
										FROM PRECIOS
										FULL OUTER JOIN CONSUMO 
										ON PRECIOS.HORAS_CONSUMO=CONSUMO.HORAS_CONSUMO;
										""";
									/*	Long idConsumo;
										String electrodomestico;
										Integer horas;
										Time hora_consumo ;
										Float precio;*/

						List<ConsumoPreciosDTO> listaJoin = template.query(
										query,
										(rs, rowNum) -> new ConsumoPreciosDTO(
														rs.getLong("ID_CONSUMO"),
														rs.getString("ELECTRODOMESTICO"),
														rs.getInt("HORAS"),
														rs.getTime("HORAS_CONSUMO"),
														rs.getFloat("PRECIO_LUZ_HORA")));
			
						return listaJoin;
				}
		
    @Override
    public void deleteConsumo(Long idConsumo) {
        repoConsumo.deleteById(idConsumo);

    }

		
		

	}