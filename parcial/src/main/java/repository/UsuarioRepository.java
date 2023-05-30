package repository;

import org.springframework.data.repository.CrudRepository;

import entidades.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
}
