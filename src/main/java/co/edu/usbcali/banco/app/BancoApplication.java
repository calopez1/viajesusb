package co.edu.usbcali.banco.app;

import java.util.Date;
import java.util.List;

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

}
