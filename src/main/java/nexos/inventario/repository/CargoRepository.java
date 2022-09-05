package nexos.inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import nexos.inventario.model.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Long> {

}
