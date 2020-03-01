package Y.service;

import java.util.List;

import javax.jws.WebService;

import Y.model.Tarjeta;
@WebService
public interface TarjetaService {
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
