package garebnb.reservation.service;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import garebnb.reservation.dao.ReservationDAO;

@Service("reservationService")
public class ReservationServiceImpl implements ReservationService{

	Logger log = Logger.getLogger(this.getClass());

	@Resource(name="reservationDAO")
	private ReservationDAO reservationDAO;
}
