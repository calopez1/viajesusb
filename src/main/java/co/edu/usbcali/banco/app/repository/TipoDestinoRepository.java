package co.edu.usbcali.banco.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import co.edu.usbcali.banco.app.domain.TipoDestino;

/**
 * @author cesarlopez
 *
 */
public interface TipoDestinoRepository extends JpaRepository<TipoDestino, Integer> {

	/**
	 * 
	 * @param codigo
	 * @return
	 */
	public TipoDestino findByCodigo(@Param("pCodigo") String codigo);
	
}
