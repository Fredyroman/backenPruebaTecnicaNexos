package nexos.inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import nexos.inventario.model.Mercancia;

public interface MercanciaRepository extends JpaRepository<Mercancia, Long>{

}
