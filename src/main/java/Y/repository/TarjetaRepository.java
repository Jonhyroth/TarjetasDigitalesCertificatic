package Y.repository;

import java.util.List;

import Y.model.Tarjeta;

public interface TarjetaRepository {
	/**
	 * Metodo para crear una tarjeta
	 * @param tarjeta
	 * @return tarjeta creada
	 */
	Tarjeta crearTarjeta(Tarjeta tarjeta);
	
	/**
	 * metodo para obtener todas las tarjetas
	 * @return
	 */
	List<Tarjeta> obtenerTodas();
	

}
