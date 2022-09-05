package nexos.inventario.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nexos.inventario.model.Mercancia;
import nexos.inventario.service.MercanciaService;

@RestController
@RequestMapping("/mercancia/")
public class MercanciaRest {
	
	@Autowired
	private MercanciaService mercanciaService;

	@GetMapping
	private ResponseEntity<List<Mercancia>> getAllMercancia(){
		return ResponseEntity.ok(mercanciaService.findAll());
	}
	
	@PostMapping
	public ResponseEntity<Mercancia> saveMercancia (@RequestBody Mercancia mercancia){
	
		try {
			Mercancia mercanciaGuardada = mercanciaService.save(mercancia);
			return ResponseEntity.created(new URI("/mercancia/" + mercanciaGuardada.getId())).body(mercanciaGuardada);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping(value = "delete/{id}")
	private ResponseEntity<Boolean> deleteMercancia (@PathVariable ("id") Long id){
		mercanciaService.deleteById(id);
		return ResponseEntity.ok(!(mercanciaService.findById(id)!=null));
	}
	
	
	
	
	
	
	
	
	
	
}
