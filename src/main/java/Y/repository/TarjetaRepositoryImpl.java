package Y.repository;

import java.util.ArrayList;
import java.util.List;

import Y.model.Tarjeta;

public class TarjetaRepositoryImpl implements TarjetaRepository {

	private static List<Tarjeta> tarjetasDigitales= new ArrayList<Tarjeta>();
	@Override
	public Tarjeta crearTarjeta(Tarjeta tarjeta) {
		System.out.println("Crear tarjeta ::::::");
		tarjetasDigitales.add(tarjeta);
		return tarjeta;
	}

	@Override
	public List<Tarjeta> obtenerTodas() {
		System.out.println("::::: Obtener todas las tarjetas");
		return tarjetasDigitales;
	}

}
