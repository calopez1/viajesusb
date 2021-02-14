package co.edu.usbcali.banco.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import co.edu.usbcali.banco.app.domain.Destino;

/**
 * @author cesarlopez
 *
 */
public interface DestinoRepository extends JpaRepository<Destino, Integer> {
	
	/**
	 * 
	 * @param codigo
	 * @return
	 */
	public Destino findByCodigo(@Param("pCodigo") String codigo);
	
}
