package nexos.inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import nexos.inventario.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
