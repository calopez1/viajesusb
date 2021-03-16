package co.edu.usbcali.viajes.app.service;

import java.util.List;

import co.edu.usbcali.viajes.app.domain.Destino;
import co.edu.usbcali.viajes.app.domain.TipoDestino;

/**
 * @author cesarlopez
 *
 */
public interface DestinoService{

	/**
	 * 
	 * @param destino
	 * @throws Exception
	 */
	public void guardarDestino(Destino destino) throws Exception;
	
	/**
	 * 
	 * @param destino
	 * @throws Exception
	 */
	public void eliminarDestino(Destino destino) throws Exception;
	
	/**
	 * 
	 * @param codigo
	 * @return
	 * @throws Exception
	 */
	public Destino consultarDestinoPorCodigo(String codigo) throws Exception;
	
	/**
	 * 
	 * @param destino
	 * @throws Exception
	 */
	public void actualizarDestino(Destino destino) throws Exception;
	
	/**
	 * 
	 * @throws Exception
	 */
	public void eliminarTodoDestino() throws Exception;
	
	/**
	 * 
	 * @throws Exception
	 */
	public void guardarVariosDestinos() throws Exception;
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Destino> consultarDestinos() throws Exception;
	
	/**
	 * 
	 * @param codigoTipoDestino
	 * @return
	 */
	public List<Destino> consultarDestinoPorCodigoTipoDestino(String codigoTipoDestino);
	
	
	/**
	 * 
	 * @param estado
	 * @return
	 */
	public List<TipoDestino> consultarTipoDestinoPorEstado(String estado);

}
