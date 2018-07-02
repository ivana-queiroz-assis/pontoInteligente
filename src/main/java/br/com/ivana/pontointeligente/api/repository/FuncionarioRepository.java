package br.com.ivana.pontointeligente.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ivana.pontointeligente.api.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

	Funcionario findByCpf(String cpf);
	
	Funcionario findByEmail(String email);
	
	Funcionario findByCpfOrEmail(String cpf, String email);
	
	Funcionario findById (Long id);
}
