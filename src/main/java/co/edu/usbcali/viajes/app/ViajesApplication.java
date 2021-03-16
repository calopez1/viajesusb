package co.edu.usbcali.viajes.app;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;


import co.edu.usbcali.viajes.app.domain.Destino;
import co.edu.usbcali.viajes.app.domain.TipoDestino;
import co.edu.usbcali.viajes.app.dto.TipoDestinoDTO;
import co.edu.usbcali.viajes.app.repository.DestinoRepository;
import co.edu.usbcali.viajes.app.repository.TipoDestinoRepository;
import co.edu.usbcali.viajes.app.service.TipoDestinoService;
import co.edu.usbcali.viajes.app.utils.Constantes;

@SpringBootApplication
public class ViajesApplication implements CommandLineRunner{
	
	private final static Logger log = LoggerFactory.getLogger(ViajesApplication.class);

	
	@Autowired
	private TipoDestinoRepository tipoDestinoRepository;
	@Autowired
	private DestinoRepository destinoRepository;

	@Autowired
	private TipoDestinoService tipoDestinoService;
	
	public static void main(String[] args) {
		SpringApplication.run(ViajesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//consultarTiposDestino();
		//buscarPorId(2);
		
		
		
		// TODO Auto-generated method stub
		//guardarDestino();
		//consultarTiposDestino();
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
		//eliminarTodoDestinoBach();
		//buscarTodosDestino();
		//buscarTodosOrdenados();
		//consultarTiposDestinoConPaginacion();
		//consultarTiposDestinoConPaginacionOrdenado();
		//buscarTodosDestino();
		//consultaCodigoTipoDestino();
		//consultaTiposDestinoActivos();
		//consultaTiposDestinoActivosPorCodigo();
		//findByFechaCreacionBetween();
		//findByFechaCreacionBetween();
		//consultarPorEstados();
		//consultarCantidadTiposDestino();
		//consultarDestinoConTipoDestino();
		//consultaTipoDestinoCodigoPagina();
		//consultarTipoDestinoPorEstado();
		
	}
	
	private void buscarPorId(Integer id) {
		
		TipoDestino tipoDestino = null;
		
		try {
			
			//Se consulta el tipo de destino por id
			tipoDestino = tipoDestinoService.buscarPorId(id);
			
			log.info("Se encontró el tipo destino: "+ tipoDestino.getCodigo() + " - " + tipoDestino.getNombre());
			
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		
		
	}
	
	
	private void consultarTiposDestino() {

		List<TipoDestino> lstTipoDestino = null;
		try {
			//Se consulta todos los tipos de destino
			lstTipoDestino = tipoDestinoService.consultarTiposDestino();
			
			//Se imprime los tipos de destino
			for (TipoDestino tipoDestino : lstTipoDestino) {
				log.info("Tipo destino: "+tipoDestino.getCodigo() + " - " + tipoDestino.getNombre());
			}
			
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}
	

	private void eliminarTipoDestino(Integer id) {
		
		//Se elimina el registro pasandole el id
		tipoDestinoRepository.deleteById(id);
		
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
	

	
	
	private void contarTipoDestino() {
		
		Long cantidad = tipoDestinoRepository.count();
		System.out.println("Exiten "+cantidad+ " tipos de destino");
	}
	
	private void eliminarTodoDestino() {
		
		destinoRepository.deleteAll();
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
	
	private void buscarTodosJPA() {
		
		List<TipoDestino> tiposDestino = tipoDestinoRepository.findAll();
		for(TipoDestino tide: tiposDestino) {
			System.out.println("Tipo destino: "+tide.getCodigo());
		}
	}
	
	//Usar con mucho cuidado!!!
	private void eliminarTodoDestinoBach() {
		
		destinoRepository.deleteAllInBatch();
	}

   private void buscarTodosDestino() {
		
		List<Destino> destinos = destinoRepository.findAll();
		for(Destino des: destinos) {
			System.out.println("destino: "+des.getNombre());
		}
	}
   
   //Consultar por ordenamiento
   private void buscarTodosOrdenados() {
	   
	   List<TipoDestino> tiposDestino = tipoDestinoRepository.findAll(Sort.by("codigo").descending());
		for(TipoDestino tide: tiposDestino) {
			System.out.println("Tipo destino: "+tide.getCodigo());
		}
   }
   
   private void consultarTiposDestinoConPaginacion() {
	   
	   //Se enumeran desde el cero las paginas
	   Page<TipoDestino> page = tipoDestinoRepository.findAll(PageRequest.of(0, 5));
	   
	   for(TipoDestino tide: page) {
			System.out.println("Tipo destino: "+tide.getCodigo());
	   }
	   
	   //Podemos preguntar total de registros y paginas
	   System.out.println("Total registros: "+page.getTotalElements());
	   System.out.println("Total de paginas: "+page.getTotalPages());

	   
   }
   
   private void consultarTiposDestinoConPaginacionOrdenado() {
	   
	   //Se enumeran desde el cero las paginas
	   Page<TipoDestino> page = tipoDestinoRepository.findAll(PageRequest.of(0, 5, Sort.by("codigo")));
	   
	   for(TipoDestino tide: page) {
			System.out.println("Tipo destino: "+tide.getCodigo());
	   }
	   
	   //Podemos preguntar total de registros y paginas
	   System.out.println("Total registros: "+page.getTotalElements());
	   System.out.println("Total de paginas: "+page.getTotalPages());

	   
   }
   
   private void consultaCodigoTipoDestino() {
	   
		TipoDestino tipoDestino = tipoDestinoRepository.findByCodigo("PLAYA");
		System.out.println("Tipo destino "+tipoDestino.getCodigo());
   }
   
   private void consultaTiposDestinoActivos() {
	   
 		List<TipoDestino> tipoDestino = tipoDestinoRepository.findByEstado("A");
 		
 		for (TipoDestino tipoDestino2 : tipoDestino) {
 	 		System.out.println("Tipo destino "+tipoDestino2.getCodigo());

		}
    }
   
   private void consultaTiposDestinoActivosPorCodigo() {
	   
		List<TipoDestino> tipoDestino = tipoDestinoRepository.findByCodigoAndEstadoOrderByCodigoDesc("PLAYA","A");
		
		for (TipoDestino tipoDestino2 : tipoDestino) {
	 		System.out.println("Tipo destino "+tipoDestino2.getCodigo());

		}
   }
   
   private void findByFechaCreacionBetween() {
	   
	   Calendar fechaInicio = new GregorianCalendar(2021, 0, 1);
	   Calendar fechaFin = new GregorianCalendar(2021, 3, 1);

	   
	   List<TipoDestino> tipoDestino = tipoDestinoRepository.findByFechaCreacionBetween(fechaInicio.getTime(),fechaFin.getTime());
		
		for (TipoDestino tipoDestino2 : tipoDestino) {
	 		System.out.println("Tipo destino "+tipoDestino2.getCodigo());

		}
   }
   
   private void consultarPorEstados() {
	   
	   String[] estados = {"A","R"};
	   
	   List<TipoDestino> tipoDestino = tipoDestinoRepository.findByEstadoIn(estados);
		
		for (TipoDestino tipoDestino2 : tipoDestino) {
	 		System.out.println("Tipo destino "+tipoDestino2.getCodigo());

		}
	   
   }
   
   private void consultarCantidadTiposDestino() {
	   	   
	   Long cantidad = tipoDestinoRepository.countByEstado(Constantes.ACTIVO);
	
	   System.out.println("Cantidad tipos destino activos "+cantidad);
	   
   }
   
   private void consultarDestinoConTipoDestino() {
	   
	   List<Destino> lstDestino = destinoRepository.findByTipoDestino_Codigo("PLAYA");
	   
	   for (Destino destino : lstDestino) {
		   System.out.println("Destino "+destino.getCodigo());
	   }
	   
   }
   
   private void consultaTipoDestinoCodigoPagina() {
	   
		Page<TipoDestino> tipoDestino = tipoDestinoRepository.findByEstado(Constantes.ACTIVO, PageRequest.of(1, 2));
		
		for (TipoDestino tipoDestino2 : tipoDestino) {
	 		System.out.println("Tipo destino "+tipoDestino2.getCodigo());

		}
   }
   
   private void consultarTipoDestinoPorEstado() {
	   
		List<TipoDestinoDTO> lstTipoDestino = tipoDestinoRepository.consultarTipoDestinoPorEstado(Constantes.ACTIVO);
		
		for (TipoDestinoDTO tipoDestino : lstTipoDestino) {
	 		System.out.println("Tipo destino id: "+tipoDestino.getCodigo() + "codigo: "+ tipoDestino.getNombre());

		}
  }
  
   
   
   
   
}
