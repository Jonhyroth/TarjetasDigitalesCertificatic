package Y.service;

import java.util.List;
import javax.jws.WebService;
import Y.model.Tarjeta;
import Y.repository.TarjetaRepository;
import Y.repository.TarjetaRepositoryImpl;
@WebService(endpointInterface="Y.service.TarjetaService")

public class TarjetaServiceImpl implements TarjetaService {

	TarjetaRepository tarjetaRepository= new TarjetaRepositoryImpl();
	@Override
	public Tarjeta crearTarjeta(Tarjeta tarjeta) {
		
		return tarjetaRepository.crearTarjeta(tarjeta);
	}

	@Override
	public List<Tarjeta> obtenerTodas() {
		// TODO Auto-generated method stub
		return tarjetaRepository.obtenerTodas();
	}

}
