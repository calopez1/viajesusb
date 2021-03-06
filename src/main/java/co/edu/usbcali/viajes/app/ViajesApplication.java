package co.edu.usbcali.viajes.app;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

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
import co.edu.usbcali.viajes.app.utils.Constantes;

@SpringBootApplication
public class ViajesApplication implements CommandLineRunner{
	
	@Autowired
	private TipoDestinoRepository tipoDestinoRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ViajesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		consultarTipoDestinoPorEstado();
		
	}
	

   private void consultarTipoDestinoPorEstado() {
	   
	   //Se consulta los tipos de destino por estado
		List<TipoDestinoDTO> lstTipoDestino = tipoDestinoRepository.consultarTipoDestinoPorEstado(Constantes.ACTIVO);
	   
		for (TipoDestinoDTO tipoDestino : lstTipoDestino) {
			System.out.println("Tipo de destino - ID: " + tipoDestino.getIdTide() + " - Nombre: "+ tipoDestino.getNombre());
		}
		
  }
  
   
   
   
   
}
