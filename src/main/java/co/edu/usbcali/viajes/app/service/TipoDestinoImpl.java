package co.edu.usbcali.viajes.app.service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import co.edu.usbcali.viajes.app.domain.TipoDestino;
import co.edu.usbcali.viajes.app.repository.TipoDestinoRepository;

/**
 * @author cesarlopez
 *
 */

@Scope("singleton")
@Service
public class TipoDestinoImpl implements TipoDestinoService{

	
	@Autowired
	private TipoDestinoRepository tipoDestinoRepository;
	
	/**
	 * Metodo que consulta todos los tipos de destino
	 */
	@Override
	public List<TipoDestino> consultarTiposDestino() throws Exception{
		
		//Se consulta todos los tipos de destino
		List<TipoDestino> lstTipoDestino = tipoDestinoRepository.findAll();
	
		if(lstTipoDestino.isEmpty()) {
			throw new Exception("No se encontraron tipos de destino");
		}
		
		return lstTipoDestino;
	}

	/**
	 * Metodo que consulta un tipo de destino, dado el id del registro en la tabla id_tide
	 */
	@Override
	public TipoDestino buscarPorId(Integer id) throws Exception {
		
			if(id == null || id == 0) {
				throw new Exception("Por favor ingrese el id del tipo de destino");
			}
			
			//Se consulta por id el tipo de destino
			Optional<TipoDestino> optional = tipoDestinoRepository.findById(id);
			
			//Se valida si existe el tipo de destino
			if(optional.isPresent()) {
				return optional.get();
			}else {
				throw new Exception("No se encontró un tipo de destino con id "+id);
			}
	
	}

	
	@Override
	public void eliminarTipoDestino(TipoDestino tipoDestino) throws Exception {
		
		
		
	}

	@Override
	public Long consultarCantidadTiposDestino() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TipoDestino> encontrarPorIdsTipoDestino() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existeIdTipoDestino() throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<TipoDestino> buscarTodosTiposDestinoOrdenados() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<TipoDestino> consultarTiposDestinoConPaginacion() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<TipoDestino> consultarTiposDestinoConPaginacionOrdenado() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoDestino consultaTipoDestinoPorCodigo() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TipoDestino> consultaTiposDestinoActivos() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TipoDestino> consultaTiposDestinoPorEstadoPorCodigo() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TipoDestino> consultarTipoDestinosPorFechaCreacionPorRango() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TipoDestino> consultaTipoDestinoCodigoPaginado(String codigo, Integer pagina, Integer cantidadRegistros)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


}
