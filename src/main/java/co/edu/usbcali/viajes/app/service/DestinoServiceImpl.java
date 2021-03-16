package co.edu.usbcali.viajes.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import co.edu.usbcali.viajes.app.domain.Destino;
import co.edu.usbcali.viajes.app.domain.TipoDestino;

/**
 * @author cesarlopez
 *
 */
@Scope("singleton")
@Service
public class DestinoServiceImpl implements DestinoService{

	@Override
	public void guardarDestino(Destino destino) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarDestino(Destino destino) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Destino consultarDestinoPorCodigo(String codigo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarDestino(Destino destino) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarTodoDestino() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void guardarVariosDestinos() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Destino> consultarDestinos() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Destino> consultarDestinoPorCodigoTipoDestino(String codigoTipoDestino) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TipoDestino> consultarTipoDestinoPorEstado(String estado) {
		// TODO Auto-generated method stub
		return null;
	}


}
