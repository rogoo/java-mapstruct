package br.rosa;

import java.util.Arrays;
import java.util.Date;

import br.rosa.dto.MesaDTO;
import br.rosa.dto.MesaMapper;
import br.rosa.model.MesaEntity;

public class App {

	public static void main(String[] args) {
		MesaEntity entity = new MesaEntity(6L, "jacaré", new Date(), Arrays.asList(45L, 666L, 999L, 1001L));

		System.out.println(entity);

		MesaDTO dto = MesaMapper.INSTANCE.entityParaDTO(entity);

		System.out.println(dto);
		System.out.println(MesaMapper.INSTANCE.entityParaDTO(null));

		MesaDTO dto2 = new MesaDTO(678L, "Mesa Linda", new Date(), Arrays.asList(30, 33, 37));

		System.out.println();
		System.out.println(dto2);
		System.out.println(MesaMapper.INSTANCE.dtoParaEntity(dto2));
	}
}
