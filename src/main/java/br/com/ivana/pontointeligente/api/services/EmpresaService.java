package br.com.ivana.pontointeligente.api.services;

import java.util.Optional;

import br.com.ivana.pontointeligente.api.entities.Empresa;
public interface EmpresaService {

	/**
	 * Retorna uma empresa dado um CNPJ.
	 * 
	 * @param cnpj
	 * @return Optional<Empresa>
	 */
	Optional<Empresa> buscarPorCnpj(String cnpj);
	
	/**
	 * Cadastra uma nova empresa na base de dados.
	 * 
	 * @param Empresa
	 * @return Empresa
	 */
	Empresa persistir(Empresa empresa);
	
}
