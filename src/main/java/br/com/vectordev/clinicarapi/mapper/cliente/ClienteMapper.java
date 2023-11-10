package br.com.vectordev.clinicarapi.mapper.cliente;

import br.com.vectordev.clinicarapi.dto.cliente.ClienteDto;
import br.com.vectordev.clinicarapi.modelo.cliente.Cliente;

public class ClienteMapper {
	
	public static Cliente fromDtoToEntity(ClienteDto dto) {
		return Cliente.builder()
				.codigo(dto.getCodigo())
				.nome(dto.getNome())
				.cpf(dto.getCpf())
				.cor(dto.getCor())
				.estadoCivil(dto.getEstadoCivil())
				.sexo(dto.getSexo())
				.pai(dto.getPai())
				.mae(dto.getMae())
				.dataNascimento(dto.getDataNascimento())
				.profissao(dto.getProfissao())
				.indicacao(dto.getIndicacao())
				.endereco(dto.getEndereco())
				.numero(dto.getNumero())
				.complemento(dto.getComplemento())
				.bairro(dto.getBairro())
				.municipio(dto.getMunicipio())
				.uf(dto.getUf())
				.cep(dto.getCep())
				.telefoneResidencial(dto.getTelefoneResidencial())
				.telefoneComercial(dto.getTelefoneComercial())
				.telefoneCelular(dto.getTelefoneCelular())
				.email(dto.getEmail())
				// .convenio(dto.getConvenio())
				.build();
	}

}
