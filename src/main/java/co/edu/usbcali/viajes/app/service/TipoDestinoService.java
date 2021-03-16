package co.edu.usbcali.viajes.app.service;

import java.util.List;

import org.springframework.data.domain.Page;

import co.edu.usbcali.viajes.app.domain.Destino;
import co.edu.usbcali.viajes.app.domain.TipoDestino;

/**
 * @author cesarlopez
 *
 */
public interface TipoDestinoService{
	
	/**
	 * 
	 * @return List<TipoDestino>
	 * @throws Exception
	 */
	public List<TipoDestino> consultarTiposDestino() throws Exception;
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public TipoDestino buscarPorId(Integer id) throws Exception;
	
	/**
	 * 
	 * @param tipoDestino
	 * @throws Exception
	 */
	public void eliminarTipoDestino(TipoDestino tipoDestino) throws Exception;
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public Long consultarCantidadTiposDestino() throws Exception ;
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<TipoDestino> encontrarPorIdsTipoDestino() throws Exception;
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public boolean existeIdTipoDestino() throws Exception;
	
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<TipoDestino> buscarTodosTiposDestinoOrdenados() throws Exception;
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public Page<TipoDestino> consultarTiposDestinoConPaginacion() throws Exception;

	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public Page<TipoDestino> consultarTiposDestinoConPaginacionOrdenado() throws Exception;
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public TipoDestino consultaTipoDestinoPorCodigo() throws Exception;
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<TipoDestino> consultaTiposDestinoActivos() throws Exception;
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<TipoDestino> consultaTiposDestinoPorEstadoPorCodigo() throws Exception;
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<TipoDestino> consultarTipoDestinosPorFechaCreacionPorRango() throws Exception;
	
	/**
	 * 
	 * @param codigo
	 * @param pagina
	 * @param cantidadRegistros
	 * @return
	 * @throws Exception
	 */
	public List<TipoDestino> consultaTipoDestinoCodigoPaginado(String codigo, Integer pagina, Integer cantidadRegistros) throws Exception;
}
