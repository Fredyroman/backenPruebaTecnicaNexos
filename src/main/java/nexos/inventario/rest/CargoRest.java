package nexos.inventario.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nexos.inventario.model.Cargo;
import nexos.inventario.service.CargoService;

@RestController
@RequestMapping("/cargo/")
public class CargoRest {
	
	@Autowired
	private CargoService cargoService;
	
	@GetMapping()
	private ResponseEntity<List<Cargo>> getAllCargos(){
		return ResponseEntity.ok(cargoService.findAll());
	}

}
