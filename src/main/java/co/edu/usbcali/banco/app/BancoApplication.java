package co.edu.usbcali.banco.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co.edu.usbcali.banco.app.domain.Destino;
import co.edu.usbcali.banco.app.domain.TipoDestino;
import co.edu.usbcali.banco.app.repository.DestinoRepository;
import co.edu.usbcali.banco.app.repository.TipoDestinoRepository;
import co.edu.usbcali.banco.app.utils.Constantes;

@SpringBootApplication
public class BancoApplication implements CommandLineRunner{
	
	@Autowired
	private TipoDestinoRepository tipoDestinoRepository;
	@Autowired
	private DestinoRepository destinoRepository;

	public static void main(String[] args) {
		SpringApplication.run(BancoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//guardarDestino();
		//eliminarDestino();
		//actualizarDestino();
	    //consultarDestino();

		//buscarPorId(2);
		//eliminarTipoDestino(9);
		//contarTipoDestino();
		//encontrarPorIds();
		//buscarTodos();
		//existeId(1);
		//guardarTodos();
		eliminarTodoDestino();
	}
	
	
	private void consultarTiposDestino() {

		//Se consulta todos los tipos de destino
		List<TipoDestino> lstTipoDestino = tipoDestinoRepository.findAll();
	
		for(TipoDestino tipoDestino : lstTipoDestino) {
			System.out.println("Id: " + tipoDestino.getIdTide() + " nombre: "+tipoDestino.getNombre());
		}
	}
	
	private void guardarDestino() {

		//Se consulta el tipo de destino
		TipoDestino tipoDestino = tipoDestinoRepository.findByCodigo("PLAYA");
		
		//Se crea el destino
		Destino destino = new Destino();
		destino.setAire(Constantes.SI);
		destino.setMar(Constantes.SI);
		destino.setTierra(Constantes.NO);
		destino.setCodigo("SANAN");
		destino.setDescripcion("San Andrés, brisa y mar");
		destino.setEstado(Constantes.ACTIVO);
		destino.setFechaCreacion(new Date());
		destino.setNombre("San Andrés");
		destino.setTipoDestino(tipoDestino);
		destino.setUsuCreador("CLOPEZ");
		
		//Se guarda el destino
		destinoRepository.save(destino);
		
		System.out.println("Guardado exitosamente");
		
	}
	
	private void eliminarDestino() {

		//Se consulta el destino a eliminar
		Destino destino = destinoRepository.findByCodigo("SANAN");
		
		//Se llama al repository para eliminar
		destinoRepository.delete(destino);
		
		System.out.println("Eliminado exitosamente");
		
	}
	
	private void consultarDestino() {

		//Se consulta el destino a eliminar
		Destino destino = destinoRepository.findByCodigo("SANAN");

		System.out.println("Destino: "+destino.getCodigo() + " - "+destino.getNombre());
		
	}
	
	private void actualizarDestino() {
		
		//Se consulta el destino a actualziar
		Destino destino = destinoRepository.findByCodigo("SANAN");
		
		//Se setean nuevos datos
		destino.setNombre(" San andres");
		//Se guarda el destino
		destinoRepository.save(destino);
		
		System.out.println("Actualizado exitosamente");
		
	}
	
	private void buscarPorId(Integer id) {
		
		//Se consulta por id el tipo de destino
		Optional<TipoDestino> optional = tipoDestinoRepository.findById(id);
		
		//Se valida el optional
		if(optional.isPresent()) {
			System.out.println("Se encontró el tipo destino: "+ optional.get().getCodigo());
		}else {
			System.out.print("Categoria NO encontrada");
		}
		
	}
	
	private void eliminarTipoDestino(Integer id) {
		
		//Se elimina el registro pasandole el id
		tipoDestinoRepository.deleteById(id);
		
	}
	
	private void contarTipoDestino() {
		
		Long cantidad = tipoDestinoRepository.count();
		System.out.println("Exiten "+cantidad+ " tipos de destino");
	}
	
	private void eliminarTodoDestino() {
		
		destinoRepository.deleteAll();;
	}
	
	private void encontrarPorIds() {
		
		//Se crea la lista de los ids
		List<Integer> ids = new LinkedList<Integer>();
		
		ids.add(2);
		ids.add(3);
		ids.add(4);
		ids.add(5);
		ids.add(6);

		Iterable<TipoDestino> tiposDestino = tipoDestinoRepository.findAllById(ids);
		
		for(TipoDestino tide: tiposDestino) {
			System.out.println("Tipo destino: "+tide.getCodigo());
		}
	}
	
	private void buscarTodos() {
		
		Iterable<TipoDestino> tiposDestino = tipoDestinoRepository.findAll();
		for(TipoDestino tide: tiposDestino) {
			System.out.println("Tipo destino: "+tide.getCodigo());
		}
	}
	
	private void existeId(Integer id) {
		
		boolean existe = tipoDestinoRepository.existsById(id);
		System.out.println("Tipo destino existe? "+existe);
	}
	
	private void guardarTodos() {
		
		List<Destino> lstDestinos = consultarVariosDestinos();
		destinoRepository.saveAll(lstDestinos);
		
	}
	
	private List<Destino> consultarVariosDestinos(){
		
		List<Destino> lstDestino = new ArrayList<Destino>();
		
		//Se consulta el tipo de destino
		TipoDestino tipoDestino = tipoDestinoRepository.findByCodigo("PLAYA");
		
		//Se crea el destino 1
		Destino destino = new Destino();
		destino.setAire(Constantes.SI);
		destino.setMar(Constantes.SI);
		destino.setTierra(Constantes.NO);
		destino.setCodigo("SANAN");
		destino.setDescripcion("San Andrés, brisa y mar 1111");
		destino.setEstado(Constantes.ACTIVO);
		destino.setFechaCreacion(new Date());
		destino.setNombre("San Andrés");
		destino.setTipoDestino(tipoDestino);
		destino.setUsuCreador("CLOPEZ");
		
		lstDestino.add(destino);
		
		//Se crea el destino 2
		Destino destino2 = new Destino();
		destino2.setAire(Constantes.SI);
		destino2.setMar(Constantes.SI);
		destino2.setTierra(Constantes.NO);
		destino2.setCodigo("SANAN");
		destino2.setDescripcion("San Andrés, brisa y mar 2222");
		destino2.setEstado(Constantes.ACTIVO);
		destino2.setFechaCreacion(new Date());
		destino2.setNombre("San Andrés");
		destino2.setTipoDestino(tipoDestino);
		destino2.setUsuCreador("CLOPEZ");
		
		lstDestino.add(destino2);
				
		//Se crea el destino 3
		Destino destino3 = new Destino();
		destino3.setAire(Constantes.SI);
		destino3.setMar(Constantes.SI);
		destino3.setTierra(Constantes.NO);
		destino3.setCodigo("SANAN");
		destino3.setDescripcion("San Andrés, brisa y mar 3333");
		destino3.setEstado(Constantes.ACTIVO);
		destino3.setFechaCreacion(new Date());
		destino3.setNombre("San Andrés");
		destino3.setTipoDestino(tipoDestino);
		destino3.setUsuCreador("CLOPEZ");
		
		lstDestino.add(destino3);
		
		return lstDestino;
	}

}
