package co.edu.usbcali.viajes.app.service;

import java.util.List;

import co.edu.usbcali.viajes.app.domain.Destino;

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
	public Destino consultarDestinoPorCodigoPorEstado(String codigo, String estado) throws Exception;
	
	/**
	 * 
	 * @param destino
	 * @throws Exception
	 */
	public void actualizarDestino(Destino destino) throws Exception;
	
	
	/**
	 * 
	 * @param codigoTipoDestino
	 * @return
	 */
	public List<Destino> consultarDestinoPorCodigoTipoDestino(String codigoTipoDestino) throws Exception;
	
	

}
