package nexos.inventario.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nexos.inventario.model.Usuario;
import nexos.inventario.service.UsuarioService;

@RestController
@RequestMapping("/usuarios/")
public class UsuarioRest {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	private ResponseEntity<List<Usuario>> getAllUsuarios(){
		return ResponseEntity.ok(usuarioService.findAll());
	}
	
	@GetMapping("{id}")
    private ResponseEntity<List<Usuario>> getUsuariosByIdCargo(@PathVariable("id") Long idCargo){
		return ResponseEntity.ok(usuarioService.findAllByCargo(idCargo));
	}
	

}
