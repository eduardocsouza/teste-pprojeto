package br.com.eduardo.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.eduardo.projeto.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {	

}
